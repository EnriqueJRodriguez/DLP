package nodes.statements;

import nodes.Definition;
import nodes.Statement;
import nodes.Type;

public class FunctionDefinition implements Statement, Definition {

    private int line;
    private int column;
    private int offset;
    private Type type;
    private String name;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
