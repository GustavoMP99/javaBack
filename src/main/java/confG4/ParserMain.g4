parser grammar ParserMain;

 options{
   tokenVocab = ScannerMain;
 }
 program         :       (statement)*;
 statement       :       variableDecl SEMICOLON
                         | classDecl SEMICOLON
                         | assignment SEMICOLON
                         | arrayAssignament SEMICOLON
                         | printStatement SEMICOLON
                         | ifStatement
                         | whileStatement
                         | returnStatement SEMICOLON
                         | funtionDecl
                         | block;
 block           :       LEFTPB (statement)* RIGTHPB;
 funtionDecl     :       type identifier LEFTP (formalParams)? RIGTHP block;
 formalParams    :       formalParam (COMA formalParam)*;
 formalParam     :       type identifier;
 whileStatement  :       WHILE LEFTP expression RIGTHP block;
 ifStatement     :       IF  LEFTP expression RIGTHP block (ELSE block)?;
 returnStatement :       RETURN  expression;
 printStatement  :       PRINT   expression;
 classDecl       :       CLASS identifier LEFTPB (classVariableDecl)* RIGTHPB;
 classVariableDecl:      simpleType identifier (EQUAL expression)?;
 variableDecl    :       type identifier (EQUAL expression)?;
 type            :       simpleType|arrayType|identifier;
 simpleType      :       BOOLEAN|CHAR|INT|STRING;
 arrayType       :       simpleType  LEFTPC RIGTHPC;
 assignment      :        identifier (POINT identifier)? EQUAL expression;
 arrayAssignament:       identifier LEFTPC expression RIGTHPC EQUAL expression;
 expression      :       simpleExpression (relationalOp simpleExpression)*;
 simpleExpression:       term (additiveOp term)*;
 term            :       factor(multiplicativeOp factor)*;
 factor          :       literal
                         | identifier (POINT identifier)?
                         | funtionCall
                         | arrayLookUp
                         | arrayLength
                         | subExpression
                         | arrayAlocationExpression
                         | allocationExpression
                         | unary;
 unary           :       (SUM|SUBTRACT|ALERT) (expression)*;
 allocationExpression:   NEW identifier LEFTP RIGTHP;
 arrayAlocationExpression: NEW simpleType LEFTPC expression RIGTHPC;
 subExpression   :       LEFTP expression RIGTHP;
 funtionCall     :       identifier LEFTP (actualParams)? RIGTHP;
 actualParams    :       expression (COMA expression);
 arrayLookUp     :       identifier LEFTPC expression RIGTHPC;
 arrayLength     :       identifier POINT LENGTH;
 relationalOp    :       MINUS
                         | MAX
                         | IDENTICAL
                         | DIF
                         | MINUSEQUAL
                         | MAXEQUAL;
 additiveOp      :       SUM
                         | SUBTRACT
                         | OR;
 multiplicativeOp:       MULT
                         | DIV
                         | AND;
 identifier      :       (UNDERSCORE | LETTER) (UNDERSCORE |LETTER| DIGIT)*;
 literal         :       intLiteral
                         | realLiteral
                         | booleanLiteral
                         | stringLiteral;
 intLiteral         :   DIGIT(DIGIT)*;

 stringLiteral      :   PRINTABLE(PRINTABLE)*;

 booleanLiteral     :   (TRUE|FALSE);
 realLiteral         :   DIGIT(DIGIT)* POINT (DIGIT)*
                         |POINT DIGIT (DIGIT)*;