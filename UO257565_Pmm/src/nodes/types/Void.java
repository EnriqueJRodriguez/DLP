package nodes.types;

import nodes.Type;

public class Void implements Type {

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