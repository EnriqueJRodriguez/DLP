package nodes.expressions;

import nodes.Expression;

public class FunctionInvocation implements Expression {

    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

}
