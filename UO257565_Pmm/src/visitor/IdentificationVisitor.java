package visitor;

import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void,Void>{

    private SymbolTable symbolTable;

    public IdentificationVisitor(){
        super();
        this.symbolTable = new SymbolTable();
    }

    @Override
    public Void visit(VariableDefinition vd, Void parameter) {
        if(!symbolTable.insert(vd)){
            new ErrorType(vd.getLine(), vd.getColumn(), "The variable " + vd.getName() + " is already defined.");
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition fund, Void parameter) {
        if(symbolTable.insert(fund)){
            symbolTable.set();
            fund.getType().accept(this, parameter);
            for(Statement statement : fund.getStatements()){
                statement.accept(this, parameter);
            }
            symbolTable.reset();
        }
        else{
            new ErrorType(fund.getLine(), fund.getColumn(), "The funtion " + fund.getName() + " is already defined.");
        }
        return null;
    }

    @Override
    public Void visit(Variable v, Void parameter) {
        Definition definition = symbolTable.find(v.getName());
        if(definition == null){
            v.setDefinition(new VariableDefinition(v.getLine(), v.getColumn(), v.getName(), new ErrorType(v.getLine(),
                    v.getColumn(), "The variable " + v.getName() + " is not defined.")));
        }
        else{
            v.setDefinition(definition);
        }
        return null;
    }
}
