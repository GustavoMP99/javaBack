package com.backendJava.AContextual;

import generated.ParserMain;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.springframework.context.expression.StandardBeanExpressionResolver;

import static com.backendJava.ErrorListenerControl.errorMsgs;

public class AContextual extends generated.ParserMainBaseVisitor {
    private TablaSimbolos tabla;

    public AContextual() {
        this.tabla = new TablaSimbolos();
        tabla.insertar(new CommonToken(ParserMain.ID, "chr"), "string", null);
        tabla.insertar(new CommonToken(ParserMain.ID, "ord"), "char", null);
        tabla.insertar(new CommonToken(ParserMain.ID, "len"), "string", null);
        tabla.insertar(new CommonToken(ParserMain.ID, "len"), "string[]", null);
        tabla.insertar(new CommonToken(ParserMain.ID, "len"), "int[]", null);
        tabla.insertar(new CommonToken(ParserMain.ID, "len"), "char[]", null);
        tabla.insertar(new CommonToken(ParserMain.ID, "len"), "boolean[]", null);
    }


    @Override
    public Object visitProgramAST(ParserMain.ProgramASTContext ctx) {
        for (ParserMain.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx) {
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
        tabla.openScope();
        for (ParserMain.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        tabla.imprimir();
        tabla.closeScope();

        return null;
    }

    @Override
    public Object visitFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx) {
        String tipo = (String) this.visit(ctx.type());
        tabla.insertar(ctx.ID().getSymbol(), tipo, ctx);

        if (ctx.formalParams() != null) {
            this.visit(ctx.formalParams());
        }
        if (ctx.block() != null) {
            if (!ctx.block().getText().contains("return")) {
                errorMsgs.add(new String("PARSER ERROR - Función sin retorno"));
                System.out.println("PARSER ERROR - Función sin retorno");
            } else {
                String[] getBlock = ctx.block().getText().split("return");

                String nameR = getBlock[1].split(" ")[0];
                if (tabla.buscar(nameR) != null) {
                    if (tabla.buscar(nameR).getType() != ctx.type().getText()) {
                        errorMsgs.add(new String("PARSER ERROR - Función con retorno no valido"));
                        System.out.println("PARSER ERROR - Función con retorno no valido");
                    }

                } /*else {
                    errorMsgs.add(new String("PARSER ERROR - Función con variable sin asignar"));
                    System.out.println("PARSER ERROR - Función con variable sin asignar");
                }*/
            }
        }
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitFormalParamsAST(ParserMain.FormalParamsASTContext ctx) {

        this.visit(ctx.formalParam(0));
        if (ctx.COMA() != null) {
            for (int i = 1; i < ctx.formalParam().size(); i++) {
                this.visit(ctx.formalParam(i));
            }
        }
        return null;
    }

    @Override
    public Object visitFormalParamAST(ParserMain.FormalParamASTContext ctx) {
        String t = (String) this.visit(ctx.type());
        tabla.insertar(ctx.ID().getSymbol(), t, ctx);
        return null;
    }

    @Override
    public Object visitWhileStatementAST(ParserMain.WhileStatementASTContext ctx) {
        String value = (String) this.visit(ctx.expression());

        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitIfStatementAST(ParserMain.IfStatementASTContext ctx) {
        String value = (String) this.visit(ctx.expression());

        if (value == null) {
            System.out.println("PARSER ERROR - identificador " + value + " no declarado 7");
            errorMsgs.add(new String("PARSER ERROR - identificador " + value + " no declarado"));
        } else {
            this.visit(ctx.block(0));
            for (int i = 1; i < ctx.block().size(); i++) {
                this.visit(ctx.block(i));
            }
        }
        return null;
    }

    @Override
    public Object visitReturnStatementAST(ParserMain.ReturnStatementASTContext ctx) {

        String value = (String) this.visit(ctx.expression());

        return null;
    }

    @Override
    public Object visitPrintStatementAST(ParserMain.PrintStatementASTContext ctx) {
        ctx.PRINT();
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitClassDeclAST(ParserMain.ClassDeclASTContext ctx) {
        tabla.insertar(ctx.ID().getSymbol(), "class", ctx); //Agregar la declación de la clase a la tabla.
        for (ParserMain.ClassVariableDeclContext c : ctx.classVariableDecl()) {
            this.visit(c);
        }
        tabla.imprimir();
        tabla.closeScope();
        //ctx.RIGTHPB();
        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx) {
        tabla.openScope();
        String tipo = (String) this.visit(ctx.simpleType());

        //ctx.ID();
        tabla.insertar(ctx.ID().getSymbol(), tipo, ctx);
        if (ctx.EQUAL() != null) {
            this.visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitVariableDeclAST(ParserMain.VariableDeclASTContext ctx) {
        String tipo = (String) this.visit(ctx.type());
        if(!tabla.insertar(ctx.ID().getSymbol(), tipo, ctx)){
            System.out.println("PARSER ERROR - ya existe el identificador " + ctx.ID() + " en el mismo nivel");
            errorMsgs.add(new String("PARSER ERROR - ya existe el identificador " + ctx.ID() + " en el mismo nivel"));
        } else if (ctx.EQUAL() != null) {
            switch (ctx.type().getText()) {
                case "char":
                    if (ctx.expression().getText().length() != 1) {
                        errorMsgs.add(new String("PARSER ERROR - valor de char no aceptado"));
                        System.out.println("PARSER ERROR - valor de char no aceptado");
                    }
                    break;
                case "int":
                    if (!isNumeric_(ctx.expression().getText())) {
                        errorMsgs.add(new String("PARSER ERROR - valor "+ ctx.expression().getText() + " no es int"));
                        System.out.println("PARSER ERROR - valor \"+ ctx.expression().getText() + \" no es int");
                    }
                    break;
                case "string":
                    if (!(ctx.expression().getText().charAt(0) == "\"".charAt(0) && ctx.expression().getText().charAt(ctx.expression().getText().length() - 1) == "\"".charAt(0))) {
                        System.out.println("ID " + ctx.ID().getText());
                        errorMsgs.add(new String("PARSER ERROR - valor de string no aceptado"));
                        System.out.println("PARSER ERROR - valor de string no aceptado");
                    } else if (ctx.expression().getText().contains("+")) {
                        String[] temp = ctx.expression().getText().split("\\+");
                        for (int x = 0; x < temp.length; x++) {
                            if (!(temp[x].charAt(0) == "\"".charAt(0) && temp[x].charAt(temp[x].length() - 1) == "\"".charAt(0))) {
                                errorMsgs.add(new String("PARSER ERROR - valor de string no aceptado"));
                                System.out.println("PARSER ERROR - valor de string no aceptado 4");
                            }
                        }
                    }
                    break;
                case "boolean":
                    if (!(ctx.expression().getText() == "true" || ctx.expression().getText() == "false")) {
                        errorMsgs.add(new String("PARSER ERROR - valor de boolean no aceptado"));
                        System.out.println("PARSER ERROR - valor de boolean no aceptado");
                    }
                default:
            }
            this.visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx) {
        Object retorno = this.visit(ctx.simpleType());
        return retorno;
    }

    @Override
    public Object visitArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx) {
        String arrayType = (String) this.visit(ctx.arrayType());
        return arrayType;
    }

    @Override
    public Object visitIdTAST(ParserMain.IdTASTContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public Object visitBoleanSTAST(ParserMain.BoleanSTASTContext ctx) {
        return ctx.BOOLEAN().getText();
    }

    @Override
    public Object visitCharSTAST(ParserMain.CharSTASTContext ctx) {
        return ctx.CHAR().getText();
    }

    @Override
    public Object visitIntSTAST(ParserMain.IntSTASTContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public Object visitStringSTAST(ParserMain.StringSTASTContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public Object visitArrayTypeAST(ParserMain.ArrayTypeASTContext ctx) {
        String tipo = (String) this.visit(ctx.simpleType());
        return tipo + "[]";
    }

    @Override
    public Object visitAssignmentAST(ParserMain.AssignmentASTContext ctx) {
        if (ctx.POINT() != null) {
            ctx.ID();
        }
        if (tabla.buscar(ctx.ID(0).getText()) != null) {
            TablaSimbolos.Ident tempI = tabla.buscar(ctx.ID(0).getText());

            switch (tempI.getType()) {
                case "char":
                    if (ctx.expression().getText().length() != 1) {
                        errorMsgs.add(new String("PARSER ERROR - valor de char no aceptado"));
                        System.out.println("PARSER ERROR - valor de char no aceptado 1");
                    }
                    break;
                case "int":
                    if (!isNumeric(ctx.expression().getText())) {
                        errorMsgs.add(new String("PARSER ERROR - valor de int no aceptado"));
                        System.out.println("PARSER ERROR - valor de int no aceptado");
                    }
                    break;
                case "string":
                    if (!(ctx.expression().getText().charAt(0) == "\"".charAt(0) && ctx.expression().getText().charAt(ctx.expression().getText().length() - 1) == "\"".charAt(0))) {
                        errorMsgs.add(new String("PARSER ERROR - valor de string no aceptado"));
                        System.out.println("PARSER ERROR - valor de string no aceptado");
                    } else if (ctx.expression().getText().contains("+")) {
                        String[] temp = ctx.expression().getText().split("\\+");
                        for (int x = 0; x < temp.length; x++) {
                            if (!(temp[x].charAt(0) == "\"".charAt(0) && temp[x].charAt(temp[x].length() - 1) == "\"".charAt(0))) {
                                errorMsgs.add(new String("PARSER ERROR - valor de string no aceptado"));
                                System.out.println("PARSER ERROR - valor de string no aceptado");
                            }
                        }
                        //ctx.expression()=  (ParserMain.ExpressionContext) final1;
                    }
                    break;
                case "boolean":
                    if (!(ctx.expression().getText() == "true" || ctx.expression().getText() == "false")) {
                        errorMsgs.add(new String("PARSER ERROR - valor de boolean no aceptado"));
                        System.out.println("PARSER ERROR - valor de boolean no aceptado");
                    }
                default:

            }

        } else {
            System.out.println("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado 1");
            errorMsgs.add(new String("PARSER ERROR - identificador " + ctx.ID() + " no declarado"));
        }
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx) {
        if (tabla.buscar(ctx.ID().toString()) == null) {
            System.out.println("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado");
            errorMsgs.add(new String("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado"));
        } else {
            for (int i = 1; i < ctx.expression().size(); i++) {
                this.visit(ctx.expression(i));
            }
        }
        return null;
    }

    @Override
    public Object visitExpressionAST(ParserMain.ExpressionASTContext ctx) {
        String exprType = "";
        String exprType2 = "";
        String op = "";

        exprType = (String) this.visit(ctx.simpleExpression(0));
        if (exprType != null) {
            for (int i = 1; i < ctx.simpleExpression().size(); i++) {
                op = (String) this.visit(ctx.relationalOp(i - 1));
                exprType2 = (String) this.visit(ctx.simpleExpression(i));

                switch (op) {
                    case ">":
                        /* Deben ser int. */
                        if ((!exprType.equals("int")) || (!exprType2.equals("int"))) {
                            errorMsgs.add(new String("PARSER ERROR - el operador " + op + " solo es válido para números"));
                            System.out.println("PARSER ERROR - el operador " + op + " solo es válido para números");
                        }
                        break;
                    case "<":
                        /* Deben ser int. */
                        if ((!exprType.equals("int")) || (!exprType2.equals("int"))) {
                            errorMsgs.add(new String("PARSER ERROR - el operador " + op + " solo es válido para números"));

                        }
                    case "<=":
                        /* Deben ser int. */
                        if ((!exprType.equals("int")) || (!exprType2.equals("int"))) {
                            errorMsgs.add(new String("PARSER ERROR - el operador " + op + " solo es válido para números"));
                        }
                    case ">=":
                        if ((!exprType.equals("int")) || (!exprType2.equals("int"))) {
                            errorMsgs.add(new String("PARSER ERROR - el operador " + op + " solo es válido para números"));
                        }
                        /* Deben ser el mismo tipo. */
                    case "==":
                        if (!exprType.equals(exprType2)) {
                            errorMsgs.add(new String("PARSER ERROR - los valores deben ser iguales para " + op));
                        }
                    case "!=":
                        /* Deben ser el mismo tipo. */
                        if (!exprType.equals(exprType2)) {
                            errorMsgs.add(new String("PARSER ERROR - los valores deben ser iguales para " + op));
                            System.out.println("PARSER ERROR - los valores deben ser iguales para " + op);
                        }
                    default:
                }

            }

        }

        return exprType;
    }

    @Override
    public Object visitSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx) {

        String value1 = (String) this.visit(ctx.term(0));
        String value2;
        for (int i = 1; i < ctx.term().size(); i++) {
            this.visit(ctx.additiveOp(i - 1));
            value2 = (String) this.visit(ctx.term(i));
            if(!value1.equals(value2)){
                errorMsgs.add(new String("PARSER ERROR - se intenta operar " + value1 + " con " + value2));
                System.out.println("PARSER ERROR - se intenta operar " + value1 + " con " + value2);
            }
        }
        return value1;
    }

    @Override
    public Object visitTermAST(ParserMain.TermASTContext ctx) {
        String exprType1 = "";
        String exprType2 = "";
        exprType1 = (String) this.visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            this.visit(ctx.multiplicativeOp(i - 1));
            exprType2 = (String) this.visit(ctx.factor(i));
            if (!exprType1.equals(exprType2))
                errorMsgs.add(new String("PARSER ERROR - se intenta operar " + exprType1 + " con " + exprType2));
                System.out.println("PARSER ERROR - se intenta operar ... " + exprType1 + " con " + exprType2);
        }

        return exprType1;
    }

    @Override
    public Object visitFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx) {
        Object retorno = this.visit(ctx.literal());
        return retorno;
    }

    @Override
    public Object visitFactorIDAST(ParserMain.FactorIDASTContext ctx) {
        if (tabla.buscar(ctx.ID(0).getText()) == null) {
            System.out.println("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado 5");
            errorMsgs.add(new String("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado"));
            return null;
        }
        String type = tabla.getType(ctx.ID(0).getText());
        return type;
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
        for (int i = 1; i < ctx.expression().size(); i++) {
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
        String tipo = (String) this.visit(ctx.simpleType());
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
        if (tabla.buscar(ctx.ID().getText()) == null) {
            System.out.println("PARSER ERROR - '" + ctx.ID() + "' no existe");
            errorMsgs.add(new String("PARSER ERROR - '" + ctx.ID() + "' no existe"));
        }
        ctx.LEFTP();
        if (ctx.actualParams() != null) {
            this.visit(ctx.actualParams());
        }
        return null;
    }

    @Override
    public Object visitActualParamsAST(ParserMain.ActualParamsASTContext ctx) {
        this.visit(ctx.expression(0));
        if (ctx.COMA() != null) {
            for (int i = 1; i < ctx.expression().size(); i++) {
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
        if (tabla.buscar(ctx.ID().getText()) == null) {
            System.out.println("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado 6");
            errorMsgs.add(new String("PARSER ERROR - identificador '" + ctx.ID() + "' no declarado"));
        }
        return null;
    }

    @Override
    public Object visitMinusOPAST(ParserMain.MinusOPASTContext ctx) {
        return ctx.MINUS().getText();
    }

    @Override
    public Object visitMaxOPAST(ParserMain.MaxOPASTContext ctx) {
        return ctx.MAX().getText();
    }

    @Override
    public Object visitIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx) {
        return ctx.IDENTICAL().getText();
    }

    @Override
    public Object visitDifOPAST(ParserMain.DifOPASTContext ctx) {
        return ctx.DIF().getText();
    }

    @Override
    public Object visitMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx) {
        return ctx.MINUSEQUAL().getText();
    }

    @Override
    public Object visitMaxSequalAST(ParserMain.MaxSequalASTContext ctx) {
        return ctx.MAXEQUAL().getText();
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
        //System.out.println("IntLiteral " + ctx.INTLITERAL().getSymbol());
        return "int";
    }

    @Override
    public Object visitRealLiteralAST(ParserMain.RealLiteralASTContext ctx) {
        System.out.println("Soy un real literal");
        return "Soy un real literal";
    }

    @Override
    public Object visitBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx) {
        Object valor = this.visit(ctx.booleanLiteral());

        return valor;
    }

    @Override
    public Object visitStringLiteralAST(ParserMain.StringLiteralASTContext ctx) {
        return "string";
    }

    @Override
    public Object visitTrueAST(ParserMain.TrueASTContext ctx) {
        return ctx.TRUE().getText();
    }

    @Override
    public Object visitFalseAST(ParserMain.FalseASTContext ctx) {
        return ctx.FALSE().getText();
    }

    private static boolean isNumeric_(Object cadena){
        try {
            Integer.parseInt((String) cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    private boolean isNumeric(String cadena) {
        boolean bool = true;
        String[] tempC = cadena.split("\\+|\\*|\\/|\\-");
        for (String temp : tempC) {
            try {
                Integer.parseInt(temp);
            } catch (NumberFormatException nfe) {
                if (tabla.buscar(temp)!= null){
                    if (!tabla.buscar(temp).getType().equals("int"))
                        bool=false;
                }
            }
        }
        return bool;
    }
}

