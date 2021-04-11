parser grammar ParserMain;

options {
    tokenVocab = ScannerMain;
}

program            :     singleCommand  EOF                                     #programAST     ;
command            :     singleCommand ( PyCOMA singleCommand)*                 #commandAST     ;
singleCommand      :     ID ASSIGN expression                                   #assingSCAST
                         | ID PIZQ expression PDER                              #callSCAST
                         | IF expression THEN singleCommand ELSE singleCommand  #ifSCAST
                         | WHILE expression DO singleCommand                    #whileSCAST
                         | LET declaration IN singleCommand                     #letSCAST
                         | BEGIN command END                                    #blockSCAST     ;
declaration        :     singleDeclaration ( PyCOMA singleDeclaration)*         #declarationAST ;
singleDeclaration  :     CONST ID VIR expression                                #constDeclAST
    	                 | VAR ID DOSPUN typeDenoter                            #varDeclAST     ;
typeDenoter        :     ID                                                     #typeDenoterAST ;
expression         :     primaryExp (operador primaryExp)*                      #expressionAST  ;
primaryExp         :     NUM                                                    #numPEAST
                         | ID                                                   #idPEAST
                         | PIZQ expression PDER                                 #groupPEAST     ;
operador           : SUM | SUB | MUL | DIV                                      #operadorAST    ;
