package nodes.statements;

import nodes.Expression;
import nodes.Statement;
import nodes.Type;

public class ReturnStatement implements Statement {

    private int line;
    private int column;
    private Expression expression;
    private Type returnType;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getReturnType() {
        return returnType;
    }
}
