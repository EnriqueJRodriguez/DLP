package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition implements Statement, Definition {

    private List<Statement> statements;

    public FunctionDefinition(int line, int column,List<Statement> statements,Type type, String name) {
        super(line, column, name, type);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    /**
     * Auxiliary method to obtain the return type of the function (name-wise)
     * @return Return type
     */
    public Type getReturnType(){
        return getType();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
