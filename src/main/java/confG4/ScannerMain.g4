lexer grammar ScannerMain;

//Reserved
IF      :   'if';
ELSE    :   'else';
RETURN  :   'return';
CLASS   :   'class';
NEW     :   'new';
STRING  :   'string';
INT     :   'int';
BOOLEAN :   'boolean';
LENGTH  :   'length';
WHILE   :   'while';
TRUE    :   'true';
FALSE   :   'false';
OR      :   'or';
PRINT   :   'print';
AND     :   'and';
CHAR    :   'char';

//Symbols
EQUAL       :   '=';
LEFTP       :   '(';
RIGTHP      :   ')';
LEFTPB      :   '{';
RIGTHPB     :   '}';
LEFTPC      :   '[';
RIGTHPC     :   ']';
SEMICOLON   :   ';';
POINT       :   '.';
ALERT       :   '!';
IDENTICAL   :   '==';
COMA        :   ',';
MINUS       :   '<';
MAX         :   '>';
DIF         :   '!=';
MINUSEQUAL  :   '<=';
MAXEQUAL    :   '>=';
UNDERSCORE  :   '_';
EXTRA       :   '"';

//Operators
SUM         :   '+';
SUBTRACT    :   '-';
MULT        :   '*';
DIV         :   '/';


WS          :   [ \r\t\n]+ -> skip;
COMMENT     :   ('//')(LETTER|DIGIT|[ \r\t\n]|'@#$%^&*!_-+=.,><?/`"')*; //???????????

//Fragments

 LETTER     : [a-zA-Z];
 DIGIT      :   [0-9];
 PRINTABLE  :   EXTRA (LETTER | DIGIT |' '| ALERT | EXTRA | '#' | '$' | '%' | '&'  | '\'' | LEFTP | RIGTHP | MULT | SUM | COMA | SUBTRACT | POINT | DIV | ':'
                | SEMICOLON | MINUS | EQUAL | MAX | '?' | '@' | LEFTPC | '\\' | RIGTHPC | '^' | UNDERSCORE | '`' | LEFTPB | '|' | RIGTHPB | '~' )* EXTRA;
