lexer grammar DrawLangLexerRules;

// currently , we dont implement case-insensitive
ORIGIN : 'origin';
STEP: 'step';
DRAW: 'draw';
SCALE: 'scale';
FOR: 'for';
T: 't';
FROM: 'from';
TO: 'to';
ROT: 'rot';
COMMA: ',';
IS: 'is';
SEMICO: ';';
WIDTH: 'width';
COLOR: 'color';
MUL: '*';
DIV: '/';
POWER: '^';
ADD: '+';
SUB: '-';
PI: 'pi';
E: 'e';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';
EXP: 'exp';
LN: 'ln';
SQRT: 'sqrt';
L_BRACKET: '(';
R_BRACKET: ')';
NUMBER: FLOAT | INT;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
CONST_ID : [0-9]+;
NEWLINE : '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT
    : '/*' .*? '*/' -> skip // comment
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;
ErrText : . ;
// 辅助定义
fragment
DIGIT: [0-9];
fragment
INT: '0' .. '9'+;
fragment
FLOAT: DIGIT+ '.' DIGIT*
		| '.' DIGIT+
		;



