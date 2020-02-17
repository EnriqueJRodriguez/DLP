package nodes.types;

import nodes.Type;

public class StructRecord implements Type {

    private int line;
    private int column;
    private String fieldName;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public String getFieldName() {
        return fieldName;
    }
}
