package com.backendJava.AContextual;

import generated.ParserMain;

public class AContextual extends generated.ParserMainBaseVisitor {
    private TablaSimbolos tabla;

    public AContextual() {
        this.tabla = new TablaSimbolos();
    }


    @Override
    public Object visitProgramAST(ParserMain.ProgramASTContext ctx) {
        for(ParserMain.StatementContext c: ctx.statement()){
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx) {
        System.out.println("callvariableDeclAST");
        Object retorno = this.visit(ctx.variableDecl());
        return null;
    }


    @Override
    public Object visitCallClassDeclAST(ParserMain.CallClassDeclASTContext ctx) {
        this.visit(ctx.classDecl());
        //ctx.SEMICOLON();
        return null;
    }

    @Override
    public Object visitCallAssignamentAST(ParserMain.CallAssignamentASTContext ctx) {
        this.visit(ctx.assignment());
        ctx.SEMICOLON();
        return null;
    }

    @Override
    public Object visitCallArrayAssignamentAST(ParserMain.CallArrayAssignamentASTContext ctx) {
        this.visit(ctx.arrayAssignament());
        return null;
    }

    @Override
    public Object visitCallPrintStatementAST(ParserMain.CallPrintStatementASTContext ctx) {
        this.visit(ctx.printStatement());
        ctx.SEMICOLON();
        return null;
    }

    @Override
    public Object visitCallIfStatementAST(ParserMain.CallIfStatementASTContext ctx) {
        this.visit(ctx.ifStatement());
        return null;
    }

    @Override
    public Object visitCallWhileStatementAST(ParserMain.CallWhileStatementASTContext ctx) {
        this.visit(ctx.whileStatement());
        return null;
    }

    @Override
    public Object visitCallReturnStatementAST(ParserMain.CallReturnStatementASTContext ctx) {
        this.visit(ctx.returnStatement());
        ctx.SEMICOLON();
        return null;
    }

    @Override
    public Object visitCallFuntionDeclAST(ParserMain.CallFuntionDeclASTContext ctx) {
        this.visit(ctx.funtionDecl());
        return null;
    }

    @Override
    public Object visitCallBlockAST(ParserMain.CallBlockASTContext ctx) {
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlockAST(ParserMain.BlockASTContext ctx) {
        for(ParserMain.StatementContext c: ctx.statement()){
            this.visit(c);
        }

        return null;
    }

    @Override
    public Object visitFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx) {
        this.visit(ctx.type());
        if(ctx.formalParams() != null){
            this.visit(ctx.formalParams());
        }
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitFormalParamsAST(ParserMain.FormalParamsASTContext ctx) {
        this.visit(ctx.formalParam(0));
        if(ctx.COMA() != null){
            for (int i=1; i<ctx.formalParam().size();i++){
                this.visit(ctx.formalParam(i));
            }
        }
        return null;
    }

    @Override
    public Object visitFormalParamAST(ParserMain.FormalParamASTContext ctx) {
        this.visit(ctx.type());

        return null;
    }

    @Override
    public Object visitWhileStatementAST(ParserMain.WhileStatementASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitIfStatementAST(ParserMain.IfStatementASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block(0));
        for (int i=1; i<ctx.block().size();i++){
            this.visit(ctx.block(i));
        }
        return null;
    }

    @Override
    public Object visitReturnStatementAST(ParserMain.ReturnStatementASTContext ctx) {
        ctx.RETURN();
        System.out.println("ESTO ES UN RETURN");
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitPrintStatementAST(ParserMain.PrintStatementASTContext ctx) {
        ctx.PRINT();
        System.out.println("Es un print");
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitClassDeclAST(ParserMain.ClassDeclASTContext ctx) {
        System.out.println("ClassDeclAST");
        //ctx.CLASS();
        //ctx.ID();
        //ctx.LEFTPB();

        for(ParserMain.ClassVariableDeclContext c: ctx.classVariableDecl()){
            this.visit(c);
        }
        //ctx.RIGTHPB();
        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx) {
        this.visit(ctx.simpleType());
        //ctx.ID();
        if(ctx.EQUAL() != null){
            this.visit(ctx.expression());
        }

        return null;
    }

    @Override
    public Object visitVariableDeclAST(ParserMain.VariableDeclASTContext ctx) {

        Object retorno = this.visit(ctx.type());
        String id= ctx.ID().getText();

        if(ctx.EQUAL() != null){
            System.out.println(id + " fue declarado y asignador");
            this.visit(ctx.expression());
        }
        else {
            System.out.println(id + " fue declarado y NO asignado");
        }

        return null;
    }

    @Override
    public Object visitSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx) {
        Object retorno = this.visit(ctx.simpleType());

        System.out.println("RETORNO: " + retorno);
        return retorno;
    }

    @Override
    public Object visitArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx) {
        this.visit(ctx.arrayType());
        return null;
    }

    @Override
    public Object visitIdTAST(ParserMain.IdTASTContext ctx) {
        ctx.ID();
        return "Soy tipo ID";
    }

    @Override
    public Object visitBoleanSTAST(ParserMain.BoleanSTASTContext ctx) {

        return "Boolean";
    }

    @Override
    public Object visitCharSTAST(ParserMain.CharSTASTContext ctx) {
        return "Soy un Char";
    }

    @Override
    public Object visitIntSTAST(ParserMain.IntSTASTContext ctx) {
        return "Soy un int";
    }

    @Override
    public Object visitStringSTAST(ParserMain.StringSTASTContext ctx) {
        return "Soy un string";
    }

    @Override
    public Object visitArrayTypeAST(ParserMain.ArrayTypeASTContext ctx) {
        this.visit(ctx.simpleType());
        return null;
    }

    @Override
    public Object visitAssignmentAST(ParserMain.AssignmentASTContext ctx) {
        ctx.ID();
        if(ctx.POINT() != null){
            System.out.println("Punto y ID");
            ctx.ID();
        }
        ctx.EQUAL();
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx) {
        for (int i=1; i<ctx.expression().size();i++){
            this.visit(ctx.expression(i));
        }
        return null;
    }

    @Override
    public Object visitExpressionAST(ParserMain.ExpressionASTContext ctx) {
        int exprType=1;
        int exprType2=-1;

        this.visit(ctx.simpleExpression(0));

        for (int i=1; i<ctx.simpleExpression().size();i++){
            this.visit(ctx.relationalOp(i-1));
            exprType2 = (int) this.visit(ctx.simpleExpression(i));
            if(exprType != exprType2) //acá no va a pasar porque siempre es int (0) pero para efectos del proyecto es así.
                System.out.println("ERROR - Tipos de datos incompatibles en el operador..."); //poner operador.
        }
        return null;
    }

    @Override
    public Object visitSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx) {
        int exprType=1;
        int exprType2=-1;

        this.visit(ctx.term(0));

        for (int i=1; i<ctx.term().size();i++){
            this.visit(ctx.additiveOp(i-1));
            exprType2 = (int) this.visit(ctx.term(i));
            if(exprType != exprType2) //acá no va a pasar porque siempre es int (0) pero para efectos del proyecto es así.
                System.out.println("ERROR - Tipos de datos incompatibles en el operador..."); //poner operador.
        }

        return null;
    }

    @Override
    public Object visitTermAST(ParserMain.TermASTContext ctx) {
        int exprType=1;
        int exprType2=-1;

        this.visit(ctx.factor(0));

        for (int i=1; i<ctx.factor().size();i++){
            this.visit(ctx.multiplicativeOp(i-1));
            exprType2 = (int) this.visit(ctx.factor(i));
            if(exprType != exprType2) //acá no va a pasar porque siempre es int (0) pero para efectos del proyecto es así.
                System.out.println("ERROR - Tipos de datos incompatibles en el operador..."); //poner operador.
        }

        return null;
    }

    @Override
    public Object visitFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx) {
        this.visit(ctx.literal());

        return null;
    }

    @Override
    public Object visitFactorIDAST(ParserMain.FactorIDASTContext ctx) {
        ctx.ID();
        if(ctx.POINT() != null){
            System.out.println("Punto y ID");
            ctx.ID();
        }
        return null;
    }

    @Override
    public Object visitFactorfuntionCallAST(ParserMain.FactorfuntionCallASTContext ctx) {
        this.visit(ctx.funtionCall());
        return null;
    }

    @Override
    public Object visitFactorArrayLookUpAST(ParserMain.FactorArrayLookUpASTContext ctx) {
        this.visit(ctx.arrayLookUp());
        return null;
    }

    @Override
    public Object visitFactorArrayLengthAST(ParserMain.FactorArrayLengthASTContext ctx) {
        this.visit(ctx.arrayLength());
        return null;
    }

    @Override
    public Object visitFactorSubExpressionAST(ParserMain.FactorSubExpressionASTContext ctx) {
        this.visit(ctx.subExpression());
        return null;
    }

    @Override
    public Object visitFactorArrayAlocationAST(ParserMain.FactorArrayAlocationASTContext ctx) {
        this.visit(ctx.arrayAlocationExpression());
        return null;
    }

    @Override
    public Object visitFactorAllocationAST(ParserMain.FactorAllocationASTContext ctx) {
        this.visit(ctx.allocationExpression());
        return null;
    }

    @Override
    public Object visitFactorUnary(ParserMain.FactorUnaryContext ctx) {
        this.visit(ctx.unary());
        return null;
    }

    @Override
    public Object visitUnaryAST(ParserMain.UnaryASTContext ctx) {
        this.visit(ctx.expression(0));
        for (int i=1; i<ctx.expression().size();i++){
            this.visit(ctx.expression(i));

        }
        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(ParserMain.AllocationExpressionASTContext ctx) {
        ctx.NEW();
        ctx.ID();
        ctx.LEFTP();
        ctx.RIGTHP();
        System.out.println("New ID()");
        return null;
    }

    @Override
    public Object visitArrayAlocationExpressionAST(ParserMain.ArrayAlocationExpressionASTContext ctx) {
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitSubExpressionAST(ParserMain.SubExpressionASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitFuntionCallAST(ParserMain.FuntionCallASTContext ctx) {
        ctx.ID();
        ctx.LEFTP();
        if(ctx.actualParams() != null){
            this.visit(ctx.actualParams());
        }
        return null;
    }

    /*
    * PROBAR ESTA PARTE BIEN!!
    */
    @Override
    public Object visitActualParamsAST(ParserMain.ActualParamsASTContext ctx) {
        this.visit(ctx.expression(0));
        if(ctx.COMA() != null){
            for (int i=1; i<ctx.expression().size();i++){
                this.visit(ctx.expression(i));

            }
        }
        return null;
    }

    @Override
    public Object visitArrayLookUpAST(ParserMain.ArrayLookUpASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayLengthAST(ParserMain.ArrayLengthASTContext ctx) {
        System.out.println("LEN DE LISTA");
            ctx.ID();
            ctx.POINT();
            ctx.LENGTH();

        return null;
    }

    @Override
    public Object visitMinusOPAST(ParserMain.MinusOPASTContext ctx){
        System.out.println("MINUS");
        return "MINUS";
    }

    @Override
    public Object visitMaxOPAST(ParserMain.MaxOPASTContext ctx) {
        System.out.println("MAX");
        return "MAX";
    }

    @Override
    public Object visitIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx) {
        System.out.println("IDENTICAL");
        return "IDENTICAL";
    }

    @Override
    public Object visitDifOPAST(ParserMain.DifOPASTContext ctx) {
        System.out.println("DIF");
        return "DIF";
    }

    @Override
    public Object visitMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx) {
        System.out.println("MINUSEQUAL");
        return "MINUSEQUAL";
    }

    @Override
    public Object visitMaxSequalAST(ParserMain.MaxSequalASTContext ctx) {
        System.out.println("maxSequalAST");
        return "maxSequalAST";
    }

    @Override
    public Object visitSumOPAST(ParserMain.SumOPASTContext ctx) {
        return "SUMA";
    }

    @Override
    public Object visitSubtractOPAST(ParserMain.SubtractOPASTContext ctx) {
        return "RESTA";
    }

    @Override
    public Object visitOrOPAST(ParserMain.OrOPASTContext ctx) {
        return "OR";
    }

    @Override
    public Object visitMultOPAST(ParserMain.MultOPASTContext ctx) {
        System.out.println("multiplicación");
        return "multOPAST";
    }

    @Override
    public Object visitDivOPAST(ParserMain.DivOPASTContext ctx) {
        System.out.println("división");
        return "divOPAST";
    }

    @Override
    public Object visitAndOPAST(ParserMain.AndOPASTContext ctx) {
        System.out.println("and - otro operando");
        return "andOPAST";
    }

    @Override
    public Object visitIntLiteralAST(ParserMain.IntLiteralASTContext ctx) {
        return "Soy un int literal";
    }

    @Override
    public Object visitRealLiteralAST(ParserMain.RealLiteralASTContext ctx) {
        return "Soy un real literal";
    }

    @Override
    public Object visitBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx) {
        Object valor = this.visit(ctx.booleanLiteral());
        System.out.println("RETORNO: " + valor);
        return null;
    }

    @Override
    public Object visitStringLiteralAST(ParserMain.StringLiteralASTContext ctx) {
        return "Soy un string literal";
    }

    @Override
    public Object visitTrueAST(ParserMain.TrueASTContext ctx) {
        return "Soy TRUE";
    }

    @Override
    public Object visitFalseAST(ParserMain.FalseASTContext ctx) {
        return "Soy FALSE";
    }
}
