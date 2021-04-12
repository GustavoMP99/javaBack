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
 funtionDecl     :       type ID LEFTP (formalParams)? RIGTHP block;
 formalParams    :       formalParam (COMA formalParam)*;
 formalParam     :       type ID;
 whileStatement  :       WHILE LEFTP expression RIGTHP block;
 ifStatement     :       IF  LEFTP expression RIGTHP block (ELSE block)?;
 returnStatement :       RETURN  expression;
 printStatement  :       PRINT   expression;
 classDecl       :       CLASS ID LEFTPB (classVariableDecl)* RIGTHPB;
 classVariableDecl:      simpleType ID (EQUAL expression)?;
 variableDecl    :       type ID (EQUAL expression)?;
 type            :       simpleType|arrayType|ID;
 simpleType      :       BOOLEAN|CHAR|INT|STRING;
 arrayType       :       simpleType  LEFTPC RIGTHPC;
 assignment      :        ID (POINT ID)? EQUAL expression;
 arrayAssignament:       ID LEFTPC expression RIGTHPC EQUAL expression;
 expression      :       simpleExpression (relationalOp simpleExpression)*;
 simpleExpression:       term (additiveOp term)*;
 term            :       factor(multiplicativeOp factor)*;
 factor          :       literal
                         | ID (POINT ID)?
                         | funtionCall
                         | arrayLookUp
                         | arrayLength
                         | subExpression
                         | arrayAlocationExpression
                         | allocationExpression
                         | unary;
 unary           :       (SUM|SUBTRACT|ALERT) (expression)*;
 allocationExpression:   NEW ID LEFTP RIGTHP;
 arrayAlocationExpression: NEW simpleType LEFTPC expression RIGTHPC;
 subExpression   :       LEFTP expression RIGTHP;
 funtionCall     :       ID LEFTP (actualParams)? RIGTHP;
 actualParams    :       expression (COMA expression);
 arrayLookUp     :       ID LEFTPC expression RIGTHPC;
 arrayLength     :       ID POINT LENGTH;
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
 literal         :       INTLITERAL
                         | REALLITERAL
                         | booleanLiteral
                         | STRINGLITERAL;
 //intLiteral         :   DIGIT(DIGIT)*;

 //stringLiteral      :   PRINTABLE(PRINTABLE)*;

 booleanLiteral     :   TRUE|FALSE;
 //realLiteral         :   DIGIT(DIGIT)* POINT (DIGIT)*
  //                       |POINT DIGIT (DIGIT)*;