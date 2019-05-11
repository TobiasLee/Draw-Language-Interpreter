import math
from enum import Enum

'''Enum type for better notation of token type'''
TokenType = Enum('Type',
                 ('ORIGIN', 'SCALE', 'ROT', 'IS', 'TO', 'STEP', 'DRAW', 'COLOR', 'SIZE',
                  'FOR', 'FROM', 'T', 'SEMICO',
                  'L_BRACKET', 'R_BRACKET', 'COMMA',
                  'PLUS', 'MINUS', 'MUL', 'DIV', 'POWER',
                  'FUNC', 'CONST_ID', 'NONTOKEN', 'ERRTOKEN')
                 )


class Token:
    def __init__(self, token_type, attr, lexeme, func):
        self.type = token_type  # token type
        self.attr = attr  # constant value
        self.lexeme = lexeme  # origin input
        self.func = func  # if the token is function, need to refer to the function
        # since we only support sin, cos, exp, ln, tan, we can use builtin math function

    def call(self, x):
        if self.func is not None:
            return self.func(x)
        else:
            raise Exception("No Function ")

    def __str__(self):
        return "type: {}  lexeme: {}  attr: {}  func: {}".format(self.type, self.lexeme, self.attr, self.func)


def init_token_table():
    '''init token table for check reversed token from token stream'''
    token_table = {}
    PI = Token(TokenType.CONST_ID, 3.14, "PI", func=None)
    E = Token(TokenType.CONST_ID, 2.72, "E", func=None)
    T = Token(TokenType.T, 0.0, "T", func=None)
    # ... 其他记号
    token_table['PI'] = PI
    token_table['E'] = E
    token_table['T'] = T
    # ... 初始化其他记号
    SIN = Token(TokenType.FUNC, 0.0, "SIN", func=math.sin)
    COS = Token(TokenType.FUNC, 0.0, "COS", func=math.cos)
    TAN = Token(TokenType.FUNC, 0.0, "TAN", func=math.tan)
    LN = Token(TokenType.FUNC, 0.0, "LN", func=lambda x: math.log(x, math.e))
    EXP = Token(TokenType.FUNC, 0.0, "EXP", func=math.exp)
    SQRT = Token(TokenType.FUNC, 0.0, "SQRT", func=math.sqrt)

    ORIGIN = Token(TokenType.ORIGIN, 0.0, "ORIGIN", func=None)
    SCALE = Token(TokenType.SCALE, 0.0, "ORIGIN", func=None)
    ROT = Token(TokenType.ROT, 0.0, "ORIGIN", func=None)
    IS = Token(TokenType.IS, 0.0, "IS", func=None)
    FOR = Token(TokenType.FOR, 0.0, "FOR", func=None)
    FROM = Token(TokenType.FROM, 0.0, "FROM", func=None)
    TO = Token(TokenType.TO, 0.0, "TO", func=None)
    STEP = Token(TokenType.STEP, 0.0, "STEP", func=None)
    DRAW = Token(TokenType.DRAW, 0.0, "DRAW", func=None)
    COLOR = Token(TokenType.COLOR, 0.0, "COLOR", func=None)
    SIZE = Token(TokenType.SIZE, 0.0, "SIZE", func=None)

    token_table['SIN'] = SIN
    token_table['COS'] = COS
    token_table['TAN'] = TAN
    token_table['LN'] = LN
    token_table['EXP'] = EXP
    token_table['SQRT'] = SQRT
    token_table['ORIGIN'] = ORIGIN
    token_table['FOR'] = FOR
    token_table['FROM'] = FROM
    token_table['TO'] = TO
    token_table['STEP'] = STEP
    token_table['SCALE'] = SCALE
    token_table['DRAW'] = DRAW
    token_table['ROT'] = ROT
    token_table['IS'] = IS
    token_table['COLOR'] = COLOR
    token_table['SIZE'] = SIZE

    return token_table


token_table = init_token_table()


def judgeToken(lexeme):  # judge reversed tokens
    if token_table.get(lexeme) is not None:
        return token_table[lexeme]
    else:
        return Token(TokenType.ERRTOKEN, "", 0.0, None)  # Error Token


def get_token(line):
    token = Token(TokenType.ERRTOKEN, "", 0.0, None)
    line = line.upper()
    cidx1 = line.find("//")
    cidx2 = line.find("--")
    if cidx1 > 0 or cidx2 > 0:
        line = line[:max(cidx1, cidx2)]  # remove comment
    token_buffer = ""
    tokens = []
    i = 0  # cursor
    while i < len(line):
        c = line[i]
        if c.isalpha():  #   ID
            token_buffer += c
            cnt = 0
            for j in range(i + 1, len(line)):
                if line[j].isalnum():
                    token_buffer += line[j]
                    cnt += 1
                else:
                    break
            i += cnt
            token = judgeToken(token_buffer)  # check if it is a reserved token
            token.lexeme = token_buffer

            tokens.append(token)
            token = Token(TokenType.ERRTOKEN, "", 0.0, None)  # reset token
            token_buffer = ""  # reset token buffer

        elif c.isdigit():  # recognize constant
            token_buffer += c
            cnt = 0
            for j in range(i + 1, len(line)):
                if line[j].isdigit():
                    token_buffer += line[j]
                    cnt += 1
                else:
                    break
            i += cnt
            if i < len(line) - 1 and line[i + 1] == '.':  # dot
                i += 1
                token_buffer += line[i]  # append dot to buffer
                cnt = 0
                for j in range(i + 1, len(line)):
                    if line[j].isdigit():
                        token_buffer += line[j]
                        cnt += 1
                    else:
                        break
                i += cnt

            token.type = TokenType.CONST_ID
            token.attr = float(token_buffer)  # convert string to float
            tokens.append(token)
            token = Token(TokenType.ERRTOKEN, "", 0.0, None)  # reset token
            token_buffer = ""  # reset token buffer
        elif c == ' ':  # space
            i += 1
            continue
        else:
            if c == ';':
                token.type = TokenType.SEMICO
            elif c == '(':
                token.type = TokenType.L_BRACKET
            elif c == ')':
                token.type = TokenType.R_BRACKET
            elif c == ',':
                token.type = TokenType.COMMA
            elif c == '+':
                token.type = TokenType.PLUS
            elif c == '/':
                token.type = TokenType.DIV
            elif c == '*':
                token.type = TokenType.MUL
            elif c == '-':
                token.type = TokenType.MINUS
            elif c == '^':
                token.type = TokenType.POWER
            else:
                token.type = TokenType.ERRTOKEN
            tokens.append(token)
            token = Token(TokenType.ERRTOKEN, "", 0.0, None)  # reset token
        i += 1
    return tokens


if __name__ == '__main__':
    '''Unit Test of Lexer'''
    # ret = get_token("FOR T FROm (10, 100) STEP @ DRAW (t * 2, exp(t)) // rotate 90 degree")
    ret2 = get_token("FOR T FROM 0 TO 2*PI STEP PI/50 DRAW (cos(T),sin(T));")
    print("--- Type ----- LEXEME--Attribute -- Function")
    for i in ret2:
        print("%-15s%-7s   %-7s     %-7s" % (i.type, i.lexeme, i.attr, i.func))
    # parser = Parser()
    # for i in parser.fetch_token("FOR T FROM 0 TO 2*PI STEP PI/50 DRAW (cos(T),sin(T));"):
    #     print("%-15s%-7s   %-7s     %-7s" % (i.type, i.lexeme, i.attr, i.func))
    # print(TokenType["ORIGIN"])
    # master = Tk()
    # master.title("DrawTest")
    # w = Canvas(master, width=300, height=400)
    # w.pack()
    # w.create_oval(10, 20, 10, 20, width=1, fill='black')
    # w.create_oval(15, 25, 15, 25, width=2, fill='green')
    # mainloop()
    #
    # Month = Enum('Month', ('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'))
    # for name, member in Month.__members__.items():
    #     print(name, '=>', member, ',', member.value)
    #
    # letter = "[a-zA-Z]"
    # digit = "[0-9]"
    # comment = "//|--"
    # WHITE_SPACE = " |\t|\n"
    # # const_id = digit^+ ("." digit*)?
    # # id = letter+ 覆盖了常量（PI E） 关键字 函数  简单的正则比较好些 DFA
    # # build a dict of Token to match the details
