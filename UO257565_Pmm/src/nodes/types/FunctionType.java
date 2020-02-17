package nodes.types;

import nodes.Type;

public class FunctionType implements Type {

    private int line;
    private int column;
    private Type returnType;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public Type getReturnType() {
        return returnType;
    }
}
