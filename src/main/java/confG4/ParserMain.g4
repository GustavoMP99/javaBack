parser grammar ParserMain;

 options{
   tokenVocab = ScannerMain;
 }
 program         :       (statement)*                                                               #programAST;
 statement       :       variableDecl SEMICOLON                                                     #callvariableDeclAST
                         | classDecl SEMICOLON                                                      #callClassDeclAST
                         | assignment SEMICOLON                                                     #callAssignamentAST
                         | arrayAssignament SEMICOLON                                               #callArrayAssignamentAST
                         | printStatement SEMICOLON                                                 #callPrintStatementAST
                         | ifStatement                                                              #callIfStatementAST
                         | whileStatement                                                           #callWhileStatementAST
                         | returnStatement SEMICOLON                                                #callReturnStatementAST
                         | funtionDecl                                                              #callFuntionDeclAST
                         | block                                                                    #callBlockAST;
 block           :       LEFTPB (statement)* RIGTHPB                                                #blockAST;
 funtionDecl     :       type ID LEFTP (formalParams)? RIGTHP block                                 #funtionDeclAST;
 formalParams    :       formalParam (COMA formalParam)*                                            #formalParamsAST;
 formalParam     :       type ID                                                                    #formalParamAST;
 whileStatement  :       WHILE LEFTP expression RIGTHP block                                        #whileStatementAST;
 ifStatement     :       IF LEFTP expression RIGTHP block (ELSE block)?                             #ifStatementAST;
 returnStatement :       RETURN  expression                                                         #returnStatementAST;
 printStatement  :       PRINT   expression                                                         #printStatementAST;
 classDecl       :       CLASS ID LEFTPB (classVariableDecl)* RIGTHPB                               #classDeclAST;
 classVariableDecl:      simpleType ID (EQUAL expression)?                                          #classVariableDeclAST;
 variableDecl    :       type ID (EQUAL expression)?                                                #variableDeclAST;
 type            :       simpleType                                                                 #simpleTypeTAST
                         | arrayType                                                                #arrayTypeTAST
                         | ID                                                                       #idTAST;
 simpleType      :       BOOLEAN                                                                    #boleanSTAST
                         | CHAR                                                                     #charSTAST
                         | INT                                                                      #intSTAST
                         | STRING                                                                   #stringSTAST;
 arrayType       :       simpleType  LEFTPC RIGTHPC                                                 #arrayTypeAST;
 assignment      :       ID (POINT ID)? EQUAL expression                                            #assignmentAST;
 arrayAssignament:       ID LEFTPC expression RIGTHPC EQUAL expression                              #arrayAssignamentAST;
 expression      :       simpleExpression (relationalOp simpleExpression)*                          #expressionAST;
 simpleExpression:       term (additiveOp term)*                                                    #simpleExpressionAST;
 term            :       factor (multiplicativeOp factor)*                                          #termAST;
 factor          :       literal                                                                    #factorLiteralAST
                         | ID (POINT ID)?                                                           #factorIDAST
                         | funtionCall                                                              #factorfuntionCallAST
                         | arrayLookUp                                                              #factorArrayLookUpAST
                         | arrayLength                                                              #factorArrayLengthAST
                         | subExpression                                                            #factorSubExpressionAST
                         | arrayAlocationExpression                                                 #factorArrayAlocationAST
                         | allocationExpression                                                     #factorAllocationAST
                         | unary                                                                    #factorUnary;
 unary           :       (SUM|SUBTRACT|ALERT) (expression)*                                         #unaryAST;
 allocationExpression:   NEW ID LEFTP RIGTHP                                                        #allocationExpressionAST;
 arrayAlocationExpression: NEW simpleType LEFTPC expression RIGTHPC                                 #arrayAlocationExpressionAST;
 subExpression   :       LEFTP expression RIGTHP                                                    #subExpressionAST;
 funtionCall     :       ID LEFTP (actualParams)? RIGTHP                                            #funtionCallAST;
 actualParams    :       expression (COMA expression)*                                              #actualParamsAST;
 arrayLookUp     :       ID LEFTPC expression RIGTHPC                                               #arrayLookUpAST;
 arrayLength     :       ID POINT LENGTH                                                            #arrayLengthAST;
 relationalOp    :       MINUS                                                                      #minusOPAST
                         | MAX                                                                      #maxOPAST
                         | IDENTICAL                                                                #identicalOPAST
                         | DIF                                                                      #difOPAST
                         | MINUSEQUAL                                                               #minSequalOPAST
                         | MAXEQUAL                                                                 #maxSequalAST;
 additiveOp      :       SUM                                                                        #sumOPAST
                         | SUBTRACT                                                                 #subtractOPAST
                         | OR                                                                       #orOPAST;
 multiplicativeOp:       MULT                                                                       #multOPAST
                         | DIV                                                                      #divOPAST
                         | AND                                                                      #andOPAST;
 literal         :       INTLITERAL                                                                 #intLiteralAST
                         | REALLITERAL                                                              #realLiteralAST
                         | booleanLiteral                                                           #booleanLiteralAST
                         | STRINGLITERAL                                                            #stringLiteralAST;

 booleanLiteral  :   TRUE                                                                           #trueAST
                     |FALSE                                                                         #falseAST;