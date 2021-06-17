package com.backendJava.Interprete;

import generated.ParserMain;
import generated.ParserMainBaseVisitor;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.Stack;

public class Interprete extends ParserMainBaseVisitor {
    private Stack<Object> pilaExpresiones;
    private AlmacenDatos almacenDatos;
    private Object valorP;


    public Interprete(){
        this.pilaExpresiones= new Stack<Object>();
        this.almacenDatos = new AlmacenDatos();
    }

    @Override
    public Object visitProgramAST(ParserMain.ProgramASTContext ctx) {
        return super.visitProgramAST(ctx);
    }

    @Override
    public Object visitCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx) {
        return super.visitCallvariableDeclAST(ctx);
    }

    @Override
    public Object visitCallClassDeclAST(ParserMain.CallClassDeclASTContext ctx) {
        return super.visitCallClassDeclAST(ctx);
    }

    @Override
    public Object visitCallAssignamentAST(ParserMain.CallAssignamentASTContext ctx) {
        return super.visitCallAssignamentAST(ctx);
    }

    @Override
    public Object visitCallArrayAssignamentAST(ParserMain.CallArrayAssignamentASTContext ctx) {
        return super.visitCallArrayAssignamentAST(ctx);
    }

    @Override
    public Object visitCallPrintStatementAST(ParserMain.CallPrintStatementASTContext ctx) {
        return super.visitCallPrintStatementAST(ctx);
    }

    @Override
    public Object visitCallIfStatementAST(ParserMain.CallIfStatementASTContext ctx) {
        return super.visitCallIfStatementAST(ctx);
    }

    @Override
    public Object visitCallWhileStatementAST(ParserMain.CallWhileStatementASTContext ctx) {
        return super.visitCallWhileStatementAST(ctx);
    }

    @Override
    public Object visitCallReturnStatementAST(ParserMain.CallReturnStatementASTContext ctx) {
        return super.visitCallReturnStatementAST(ctx);
    }

    @Override
    public Object visitCallFuntionDeclAST(ParserMain.CallFuntionDeclASTContext ctx) {
        return super.visitCallFuntionDeclAST(ctx);
    }

    @Override
    public Object visitCallBlockAST(ParserMain.CallBlockASTContext ctx) {
        return super.visitCallBlockAST(ctx);
    }

    @Override
    public Object visitBlockAST(ParserMain.BlockASTContext ctx) {
        Object statements = null;
        for(int i=0; i< ctx.statement().size(); i++) {
            statements = this.visit(ctx.statement(i));
        }
        return statements;
    }

    @Override
    public Object visitFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx) {
        ArrayList<Object> valorAux = new ArrayList<Object>();
        valorAux.add(null);
        this.almacenDatos.agregarInstancia(ctx.ID().getText(), valorAux, "function", ctx);
        return null;
    }

    @Override
    public ArrayList<Object> visitFormalParamsAST(ParserMain.FormalParamsASTContext ctx) {
        Object params = this.visit(ctx.formalParam(0));
        ArrayList<Object> paramsAux = new ArrayList<Object>();
        paramsAux.add(params);

        for(int i=1; i< ctx.formalParam().size(); i++) {
            params = this.visit(ctx.formalParam(i));
            paramsAux.add(params);
        }
        return paramsAux;
    }

    @Override
    public Object visitFormalParamAST(ParserMain.FormalParamASTContext ctx) {
        String tipo = (String) visit(ctx.type());

        ArrayList<Object> valorAux = new ArrayList<Object>();
        valorAux.add(null);

        this.almacenDatos.agregarInstancia(ctx.ID().getText(), valorAux, tipo, ctx);

        return ctx.ID();
    }

    @Override
    public Object visitWhileStatementAST(ParserMain.WhileStatementASTContext ctx) {
        return super.visitWhileStatementAST(ctx);
    }

    @Override
    public Object visitIfStatementAST(ParserMain.IfStatementASTContext ctx) {
        return super.visitIfStatementAST(ctx);
    }

    @Override
    public Object visitReturnStatementAST(ParserMain.ReturnStatementASTContext ctx) {
        return super.visitReturnStatementAST(ctx);
    }

    @Override
    public Object visitPrintStatementAST(ParserMain.PrintStatementASTContext ctx) {

        Object expr = this.visit(ctx.expression());
        System.out.println(expr);
        return null;
    }

    @Override
    public Object visitClassDeclAST(ParserMain.ClassDeclASTContext ctx) {
        return super.visitClassDeclAST(ctx);
    }

    @Override
    public Object visitClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx) {
        return super.visitClassVariableDeclAST(ctx);
    }

    @Override
    public Object visitVariableDeclAST(ParserMain.VariableDeclASTContext ctx) {
        String tipo = (String) visit(ctx.type());

        ArrayList<Object> valorAux = new ArrayList<Object>();

        if(ctx.EQUAL() != null){ // Si fue declarada y asignada.
            Object value = this.visit(ctx.expression());
            valorAux.add(value);
        }
        else // Valor por defecto null
            valorAux.add(null);

        this.almacenDatos.agregarInstancia(ctx.ID().getText(), valorAux, tipo, ctx);

        return null;
    }

    @Override
    public Object visitSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx) {
        Object retorno = this.visit(ctx.simpleType());
        return retorno;
    }

    @Override
    public Object visitArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx) {
        String tipo=(String) this.visit(ctx.arrayType());
        return tipo;
    }

    @Override
    public Object visitIdTAST(ParserMain.IdTASTContext ctx) {
        return super.visitIdTAST(ctx);
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
        String tipo=(String) this.visit(ctx.simpleType());
        return tipo+"[]";
    }

    @Override
    public Object visitAssignmentAST(ParserMain.AssignmentASTContext ctx) {
        System.out.println("ASIGNACIÓN!!");
        int valor = (int) visit(ctx.expression());

        almacenDatos.setInstancia(ctx.ID(0).getText(), valor);

        return null;
    }

    @Override
    public Object visitArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx) {
        int indice = (int) this.visit(ctx.expression(0));
        Object valor = this.visit(ctx.expression(1));

        almacenDatos.setInstancia(ctx.ID().getText(), indice,valor);
        return null;
    }

    @Override
    public Object visitExpressionAST(ParserMain.ExpressionASTContext ctx) {
        Object valor1 = this.visit(ctx.simpleExpression(0));
        if(valor1==null)
            return valorP;

        valorP =valor1;
        return valor1;
    }

    @Override
    public Object visitSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx) {
        Object term1 = this.visit(ctx.term(0));
        for(int i=1; i< ctx.term().size(); i++) {
            String op = (String) this.visit(ctx.additiveOp(i-1));
            Object v2 = this.visit(ctx.term(i));
            if (term1 != null && v2 != null)
                term1 = operar(term1,v2,op);
        }
        return term1;
    }

    private Object operar(Object v1, Object v2, String op){
        Object result=null;
        if (op.equals("+"))
            result = ((Integer)v1) + ((Integer)v2);
        else if (op.equals("*"))
            result = ((Integer)v1) * ((Integer)v2);
        else if (op.equals("/"))
            result = ((Integer)v1) / ((Integer)v2);
        else if (op.equals("-"))
            result = ((Integer)v1) - ((Integer)v2);

        return result;
    }

    @Override
    public Object visitTermAST(ParserMain.TermASTContext ctx) {
        //Object factor = this.visit(ctx.factor(0));
        Object fact1 = this.visit(ctx.factor(0));
        for(int i=1; i< ctx.factor().size(); i++) {
            String op = (String) this.visit(ctx.multiplicativeOp(i-1));
            Object v2 = this.visit(ctx.factor(i));
            fact1 = operar(fact1,v2,op);
        }
        return fact1;
    }

    @Override
    public Object visitFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx) {
        Object literal = this.visit(ctx.literal());
        return literal;
    }

    @Override
    public Object visitFactorIDAST(ParserMain.FactorIDASTContext ctx) {
        AlmacenDatos.Instancia inst = almacenDatos.getInstancia(ctx.ID(0).getText());
        if(inst.tipo.contains("[]")){
            return inst.valor_;
        }
        else{
            return inst.valor_.get(0);
        }
    }

    @Override
    public Object visitFactorfuntionCallAST(ParserMain.FactorfuntionCallASTContext ctx) {
        return super.visitFactorfuntionCallAST(ctx);
    }

    @Override
    public Object visitFactorArrayLookUpAST(ParserMain.FactorArrayLookUpASTContext ctx) {
        return super.visitFactorArrayLookUpAST(ctx);
    }

    @Override
    public Object visitFactorArrayLengthAST(ParserMain.FactorArrayLengthASTContext ctx) {
        return super.visitFactorArrayLengthAST(ctx);
    }

    @Override
    public Object visitFactorSubExpressionAST(ParserMain.FactorSubExpressionASTContext ctx) {
        return super.visitFactorSubExpressionAST(ctx);
    }

    @Override
    public Object visitFactorArrayAlocationAST(ParserMain.FactorArrayAlocationASTContext ctx) {
        return super.visitFactorArrayAlocationAST(ctx);
    }

    @Override
    public Object visitFactorAllocationAST(ParserMain.FactorAllocationASTContext ctx) {
        return super.visitFactorAllocationAST(ctx);
    }

    @Override
    public Object visitFactorUnary(ParserMain.FactorUnaryContext ctx) {
        return super.visitFactorUnary(ctx);
    }

    @Override
    public Object visitUnaryAST(ParserMain.UnaryASTContext ctx) {
        return super.visitUnaryAST(ctx);
    }

    @Override
    public Object visitAllocationExpressionAST(ParserMain.AllocationExpressionASTContext ctx) {
        return super.visitAllocationExpressionAST(ctx);
    }

    @Override
    public Object visitArrayAlocationExpressionAST(ParserMain.ArrayAlocationExpressionASTContext ctx) {
        return super.visitArrayAlocationExpressionAST(ctx);
    }

    @Override
    public Object visitSubExpressionAST(ParserMain.SubExpressionASTContext ctx) {
        return super.visitSubExpressionAST(ctx);
    }

    @Override
    public Object visitFuntionCallAST(ParserMain.FuntionCallASTContext ctx) {
        Object result=null;
        AlmacenDatos.Instancia i = almacenDatos.getInstancia(ctx.ID().getText());

        //lidiar con parametros reales y formales
        ArrayList<Object> realParams = (ArrayList<Object>) visit(ctx.actualParams());
        ArrayList<Object> formalParams = (ArrayList<Object>) visit(((ParserMain.FuntionDeclASTContext) i.ctx).formalParams());

        int contador = 0;
        for (Object fp : formalParams) {
            this.almacenDatos.setInstancia( fp.toString(), realParams.get(contador));
            contador++;
        }

        //tengo que visitar cuerpo del método
        visit(((ParserMain.FuntionDeclASTContext) i.ctx).block());

        return result;
    }

    @Override
    public ArrayList<Object> visitActualParamsAST(ParserMain.ActualParamsASTContext ctx) {
        Object params = this.visit(ctx.expression(0));
        ArrayList<Object> paramsAux = new ArrayList<Object>();
        paramsAux.add(params);

        for(int i=1; i< ctx.expression().size(); i++) {
            params = this.visit(ctx.expression(i));
            paramsAux.add(params);
        }
        return paramsAux;
    }

    @Override
    public Object visitArrayLookUpAST(ParserMain.ArrayLookUpASTContext ctx) {
        return super.visitArrayLookUpAST(ctx);
    }

    @Override
    public Object visitArrayLengthAST(ParserMain.ArrayLengthASTContext ctx) {

        return (almacenDatos.getInstancia(ctx.ID().getText())).valor_.size();
    }

    @Override
    public Object visitMinusOPAST(ParserMain.MinusOPASTContext ctx) {
        return ctx.MINUS().getSymbol();
    }

    @Override
    public Object visitMaxOPAST(ParserMain.MaxOPASTContext ctx) {
        return super.visitMaxOPAST(ctx);
    }

    @Override
    public Object visitIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx) {
        return super.visitIdenticalOPAST(ctx);
    }

    @Override
    public Object visitDifOPAST(ParserMain.DifOPASTContext ctx) {
        return super.visitDifOPAST(ctx);
    }

    @Override
    public Object visitMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx) {
        return super.visitMinSequalOPAST(ctx);
    }

    @Override
    public Object visitMaxSequalAST(ParserMain.MaxSequalASTContext ctx) {
        return super.visitMaxSequalAST(ctx);
    }

    @Override
    public Object visitSumOPAST(ParserMain.SumOPASTContext ctx) {
        return ctx.SUM().getText();
    }

    @Override
    public Object visitSubtractOPAST(ParserMain.SubtractOPASTContext ctx) {
        return ctx.SUBTRACT().getText();
    }

    @Override
    public Object visitOrOPAST(ParserMain.OrOPASTContext ctx) {
        return ctx.OR().getText();
    }

    @Override
    public Object visitMultOPAST(ParserMain.MultOPASTContext ctx) {
        return ctx.MULT().getText();
    }

    @Override
    public Object visitDivOPAST(ParserMain.DivOPASTContext ctx) {
        return ctx.DIV().getText();
    }

    @Override
    public Object visitAndOPAST(ParserMain.AndOPASTContext ctx) {
        return ctx.AND().getText();
    }

    @Override
    public Object visitIntLiteralAST(ParserMain.IntLiteralASTContext ctx) {
        return Integer.parseInt(ctx.INTLITERAL().getText());
    }

    @Override
    public Object visitRealLiteralAST(ParserMain.RealLiteralASTContext ctx) {
        return ctx.REALLITERAL();
    }

    @Override
    public Object visitBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx) {
        Object valor = this.visit(ctx.booleanLiteral());
        return valor;
    }

    @Override
    public Object visitStringLiteralAST(ParserMain.StringLiteralASTContext ctx) {
        return ctx.STRINGLITERAL().getText();
    }

    @Override
    public Object visitTrueAST(ParserMain.TrueASTContext ctx) {
        return ctx.TRUE().getText();
    }

    @Override
    public Object visitFalseAST(ParserMain.FalseASTContext ctx) {
        return ctx.FALSE().getText();
    }
}
