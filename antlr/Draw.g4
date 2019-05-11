grammar DrawM;
import DrawLangLexerRules;

prog:  (stats NEWLINE*)* EOF;
stats
	: stat SEMICO
	| stat {notifyErrorListeners("Missing closing ';'");}
	| stat SEMICO SEMICO {notifyErrorListeners("To many ';'");};

stat: forStat | originStat | widthStat | scaleStat | rotStat | colorStat | assignStat;

forStat : FOR T FROM expr TO expr STEP expr DRAW L_BRACKET expr COMMA expr R_BRACKET;
originStat:  ORIGIN IS L_BRACKET expr COMMA expr R_BRACKET ;
scaleStat : SCALE IS L_BRACKET expr COMMA expr R_BRACKET ;
rotStat:  ROT IS expr ;
colorStat: COLOR IS L_BRACKET expr COMMA expr COMMA expr R_BRACKET;
widthStat: WIDTH IS expr;
assignStat: ID '=' expr;


expr: SUB expr # UnarySub
	| <assoc=right> expr POWER expr # Power
	| expr op=(MUL|DIV) expr # MulDiv
	| expr op=(ADD|SUB) expr # AddSub
	| T # T
	| NUMBER  # Number
	| PI # Pie
	| E # E
	| L_BRACKET expr R_BRACKET # Paren
	| COS L_BRACKET expr R_BRACKET # FuncCos
	| SIN L_BRACKET expr R_BRACKET # FuncSin
	| TAN L_BRACKET expr R_BRACKET # FuncTan
	| EXP L_BRACKET expr R_BRACKET # FuncExp
	| LN L_BRACKET expr R_BRACKET # FuncLn
	| SQRT L_BRACKET expr R_BRACKET # FuncSqrt
	| ID # Id
	;

