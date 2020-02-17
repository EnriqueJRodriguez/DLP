package nodes.statements;

import nodes.Expression;
import nodes.Statement;

public class Write implements Statement {

    private int line;
    private int column;
    private Expression expression;

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
}
