package ast.definitions;

import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition implements Statement, Definition {

    private List<Statement> statements;
    private int localVariablesBytes;

    public FunctionDefinition(int line, int column,List<Statement> statements,Type type, String name) {
        super(line, column, name, type);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public int getNumberOfVariableDefinitions(){
        int i = 0;
        for(Statement statement : statements){
            if(statement instanceof VariableDefinition){
                i++;
            }
        }
        return i;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    /**
     * Auxiliary method to obtain the return type of the function (name-wise)
     * @return Return type
     */
    public Type getReturnType(){
        return ((FunctionType) getType()).getReturnType();
    }

    public int getLocalVariablesBytes() {
        return localVariablesBytes;
    }

    public void setLocalVariablesBytes(int localVariablesBytes) {
        this.localVariablesBytes = localVariablesBytes;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
