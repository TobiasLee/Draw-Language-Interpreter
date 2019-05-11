from lexer import get_token, TokenType, Token
import math


class Content(object):  # node content

    class OperatorCase:
        def __init__(self, left, right, operation):
            assert type(left) == ExpressionNode
            assert type(right) == ExpressionNode
            self.left = left  # Exper
            self.right = right
            self.op = operation

        def __str__(self):
            return str(self.op)

    class FuncOperator:
        def __init__(self, func, child):
            assert child is not None
            self.child = child
            self.func = func

        def __str__(self):
            return str(self.func)

    def __init__(self):
        self.case_operator = None
        self.case_func = None
        self.const_value = None
        self.param = None

    def set_value(self, value):
        self.const_value = value

    def set_func(self, func_op):
        self.case_func = func_op

    def set_param(self, param):
        self.param = param

    def __str__(self):
        return "operator :{}    func: {}  const_value: {}   param: {}".format(self.case_operator,
                                                                              self.case_func,
                                                                              self.const_value,
                                                                              self.param)


class ExpressionNode(object):
    def __init__(self):
        self.token_type = TokenType.ERRTOKEN  # default is error
        self.content = None

    def __str__(self):
        return ""


def outputSyntaxTree(root_node, i):
    node = root_node
    # print(node)
    if node.content is None:
        return
    if node.content.case_operator is not None:
        print("--" * (i * 4), node.content.case_operator)
        outputSyntaxTree(node.content.case_operator.left, i + 1)
        outputSyntaxTree(node.content.case_operator.right, i + 1)

    elif node.content.case_func is not None:
        print("--" * (i * 4), node.content.case_func)
        outputSyntaxTree(node.content.case_func.child, i + 1)
    elif node.content.const_value is not None:
        print("--" * (i * 4), node.content.const_value)
    elif node.content.param is not None:
        print("--" * (i * 4), node.content.param)
    else:
        print(node)
        raise Exception("Error content, content: %s" % node.content)


# global variable
# origin_x, origin_y = 0, 0  # origin
origin_x, origin_y = 0, 0  # convert cord

scale_x, scale_y = 1, 1  # scale
rot_angle = 0.0
parameter = 0


def getExpressionValue(node):
    if node.content is None:
        return
    if node.content.case_operator is not None:
        if node.content.case_operator.op == TokenType.MUL:
            return getExpressionValue(node.content.case_operator.left) * \
                   getExpressionValue(node.content.case_operator.right)
        elif node.content.case_operator.op == TokenType.DIV:
            return getExpressionValue(node.content.case_operator.left) / \
                   getExpressionValue(node.content.case_operator.right)
        elif node.content.case_operator.op == TokenType.MINUS:
            return getExpressionValue(node.content.case_operator.left) - \
                   getExpressionValue(node.content.case_operator.right)
        elif node.content.case_operator.op == TokenType.POWER:
            return getExpressionValue(node.content.case_operator.left) ** \
                   getExpressionValue(node.content.case_operator.right)
        elif node.content.case_operator.op == TokenType.PLUS:
            return getExpressionValue(node.content.case_operator.left) + \
                   getExpressionValue(node.content.case_operator.right)

    elif node.content.case_func is not None:
        return node.content.case_func.func(
            getExpressionValue(node.content.case_func.child))
    elif node.content.const_value is not None:
        return node.content.const_value
    elif node.content.param is not None:
        return parameter


def calcCoord(x_node, y_node):
    cur_x = getExpressionValue(x_node)
    cur_y = getExpressionValue(y_node)
    # print(scale_x, scale_y)
    cur_x *= scale_x
    cur_y *= scale_y
    # print(rot_angle)
    temp = cur_x * math.cos(rot_angle) + cur_y * math.sin(rot_angle)
    cur_y = cur_y * math.cos(rot_angle) - cur_x * math.sin(rot_angle)
    cur_x = temp
    # print(cur_x, cur_y)

    cur_x += origin_x
    cur_y += origin_y
    return cur_x, cur_y


def drawLoop(start, end, step, x_node, y_node, canvas, color, width=3):
    b = getExpressionValue(start)
    e = getExpressionValue(end)
    s = getExpressionValue(step)
    global parameter
    parameter = b
    while parameter <= e:
        x_cur, y_cur = calcCoord(x_node, y_node)
        drawPixel(x_cur, y_cur, canvas, color, width)
        parameter += s


# origin (0, 0 ) -> ( 0, height)
#  (x, y)  -> (0, height - y)
def drawPixel(x_v, y_v, canvas, color, width=3):
    c_y = 400 - y_v
    canvas.create_oval(x_v, c_y, x_v + width, c_y + width, fill=color, outline="")


class Parser():
    def __init__(self, token_stream, canvas):
        self.stream = token_stream
        self.cur = 0
        self.canvas = canvas
        self.fill = 'black'  # default color
        self.width = 3  # default size of dot

    @staticmethod
    def create_expression_node(opcode, *args):
        node = ExpressionNode()
        if opcode == TokenType.CONST_ID:
            node.token_type = TokenType.CONST_ID
            node.content = Content()
            node.content.set_value(args[0])
            # node.content.case_value = args[0]
        elif opcode == TokenType.T:
            node.token_type = TokenType.T
            node.content = Content()
            node.content.param = args[0]  # variable
        elif opcode == TokenType.FUNC:
            node.token_type = TokenType.FUNC
            node.content = Content()
            node.content.set_func(Content.FuncOperator(args[0], args[1]))
        else:  # 二元运算
            node.token_type = TokenType.CONST_ID
            node.content = Content()
            node.content.case_operator = Content.OperatorCase(args[0], args[1], args[2])
        return node

    @staticmethod
    def fetch_token(code):
        tokens = get_token(code)
        for t in tokens:
            if t.type == TokenType.ERRTOKEN:
                raise Exception("Error Token")
            yield t

    def match_token(self, token_type):
        if self.stream[self.cur].type == token_type:
            self.cur += 1
        else:  # error hint
            raise Exception("Token type not matched: Supposed %s but get %s" %
                            (token_type, self.stream[self.cur].type))

    def for_statement(self):
        self.match_token(TokenType.FOR)
        self.match_token(TokenType.T)
        self.match_token(TokenType.FROM)
        start = self.expression()
        self.match_token(TokenType.TO)
        end = self.expression()
        self.match_token(TokenType.STEP)
        step = self.expression()
        self.match_token(TokenType.DRAW)
        self.match_token(TokenType.L_BRACKET)
        x = self.expression()
        self.match_token(TokenType.COMMA)
        y = self.expression()
        self.match_token(TokenType.R_BRACKET)
        # print(self.width)
        drawLoop(start, end, step, x, y, self.canvas, self.fill, self.width)
        return start, end, step, x, y

    def rot_statement(self):
        self.match_token(TokenType.ROT)
        self.match_token(TokenType.IS)
        angle = self.expression()
        global rot_angle
        rot_angle = getExpressionValue(angle)
        return angle

    def scale_statement(self):
        self.match_token(TokenType.SCALE)
        self.match_token(TokenType.IS)
        self.match_token(TokenType.L_BRACKET)
        x = self.expression()
        self.match_token(TokenType.COMMA)
        y = self.expression()
        self.match_token(TokenType.R_BRACKET)
        global scale_x, scale_y
        scale_x, scale_y = getExpressionValue(x), getExpressionValue(y)
        return x, y

    def origin_statement(self):
        self.match_token(TokenType.ORIGIN)
        self.match_token(TokenType.IS)
        self.match_token(TokenType.L_BRACKET)
        x = self.expression()
        self.match_token(TokenType.COMMA)
        y = self.expression()
        self.match_token(TokenType.R_BRACKET)
        global origin_x, origin_y
        origin_x, origin_y = getExpressionValue(x), getExpressionValue(y)
        return x, y

    def color_statement(self):
        self.match_token(TokenType.COLOR)
        self.match_token(TokenType.IS)
        color = self.expression()
        c = int(getExpressionValue(color))
        if c == 0:
            self.fill = 'black'
        elif c == 1:
            self.fill = 'blue'
        elif c == 2:
            self.fill = 'red'
        elif c == 3:
            self.fill = 'green'
        # print(self.fill)
        return color

    def size_statement(self):
        self.match_token(TokenType.SIZE)
        self.match_token(TokenType.IS)
        width = self.expression()
        w = getExpressionValue(width)
        if w < 0:
            raise Exception("Size of dot must greater than zero, the result is %.3f" % w)
        self.width = w
        # print(self.width)
        return width

    def flush(self, stream):
        """set the stream and default cursor"""
        self.stream = stream
        self.cur = 0

    def parse(self):
        token = self.stream[self.cur]
        ret = []
        while token.type != TokenType.NONTOKEN:
            ret.append(self.statement(token))
            try:
                self.match_token(TokenType.SEMICO)
            except IndexError:
                raise Exception("No Semicolon")
            if self.cur == len(self.stream):
                break
            else:
                token = self.stream[self.cur]
        return ret

    def statement(self, token):
        if token.type == TokenType.ORIGIN:
            return self.origin_statement()
        elif token.type == TokenType.SCALE:
            return self.scale_statement()
        elif token.type == TokenType.FOR:
            return self.for_statement()
        elif token.type == TokenType.ROT:
            return self.rot_statement()
        elif token.type == TokenType.COLOR:
            return self.color_statement()
        elif token.type == TokenType.SIZE:
            # print("size ~")
            return self.size_statement()
        else:
            raise Exception("Unexpected token type!")

    def atom(self):
        # print("enter: atom")
        left = ExpressionNode()
        token = self.stream[self.cur]
        # print("cur token ", token)
        if token.type == TokenType.CONST_ID:
            self.match_token(token.type)
            left.token_type = TokenType.CONST_ID
            left.content = Content()
            left.content.const_value = token.attr
        elif token.type == TokenType.T:
            self.match_token(token.type)
            left.token_type = TokenType.T
            left.content = Content()
            left.content.set_param(token.lexeme)
        elif token.type == TokenType.FUNC:
            self.match_token(TokenType.FUNC)
            self.match_token(TokenType.L_BRACKET)
            value = self.expression()
            left = self.create_expression_node(TokenType.FUNC, token.func, value)
            self.match_token(TokenType.R_BRACKET)
        elif token.type == TokenType.L_BRACKET:
            self.match_token(TokenType.L_BRACKET)
            left = self.expression()
            self.match_token(TokenType.R_BRACKET)
        # print("result: ", left)
        # print("exit atom")
        return left

    def component(self):
        left = self.atom()
        if self.cur == len(self.stream):
            return left
        token = self.stream[self.cur]

        if token.type == TokenType.POWER:
            self.match_token(token.type)
            right = self.component()
            left = self.create_expression_node(token.type, left, right, token.type)

        return left

    def factor(self):
        token = self.stream[self.cur]
        if token.type == TokenType.PLUS or token.type == TokenType.MINUS:  # 把一元运算处理成二元
            self.match_token(token.type)
            left = self.create_expression_node(TokenType.CONST_ID, 0)
            right = self.factor()
            left = self.create_expression_node(token.type, left, right, token.type)
        else:
            left = self.component()

        return left

    def term(self):
        left = self.factor()
        if self.cur == len(self.stream):
            return left
        token = self.stream[self.cur]

        while token.type == TokenType.MUL or token.type == TokenType.DIV:
            self.match_token(token.type)
            right = self.term()
            left = self.create_expression_node(token.type, left, right, token.type)
            if self.cur == len(self.stream):
                break
            token = self.stream[self.cur]

        return left

    def expression(self):
        # print("enter: expression")
        left = self.term()
        if self.cur == len(self.stream):
            return left
        token = self.stream[self.cur]
        # print("cur token: ", token)

        while token.type == TokenType.PLUS or token.type == TokenType.MINUS:
            self.match_token(token.type)
            right = self.term()
            left = self.create_expression_node(token.type, left, right, token.type)
            if self.cur == len(self.stream):
                break
            token = self.stream[self.cur]
        # print("exit: expression")

        return left


if __name__ == '__main__':
    '''Unit test of parser, output a syntax tree with hierarchy'''
    # to_parse = "for t from -100 to 100 step 1 draw (t, 0);"
    to_parse = "rot is -16+5^3/cos(T);"

    # to_parse = "origin is (2, 3.5);"
    token_stream = get_token(to_parse)

    parser = Parser(token_stream, None)
    ret = parser.parse()
    # print(ret[0])

    for node in ret:
        outputSyntaxTree(node, 1)
        # print(getExpressionValue(node))
    # print("------------------------------")
    # for token in token_stream:
    #     print(token)
    # print("------------------------------")
    #
    # parser = Parser(token_stream)
    # node = parser.expression()
    # outputSyntaxTree(node, 1)

    # start, end, step, x, y = parser.for_statement()
    # outputSyntaxTree(start, 1)
    # outputSyntaxTree(end, 1)
    # outputSyntaxTree(step, 1)
    # outputSyntaxTree(x, 1)
    # outputSyntaxTree(y, 1)
    # # print(node)
