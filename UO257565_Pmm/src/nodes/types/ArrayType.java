package nodes.types;

import nodes.Type;

public class ArrayType implements Type {

    private int line;
    private int column;
    private Type arrayType;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public Type getArrayType() {
        return arrayType;
    }
}
