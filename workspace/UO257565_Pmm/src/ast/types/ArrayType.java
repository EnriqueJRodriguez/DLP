package ast.types;

public class ArrayType extends AbstractType {

    private int size;
    private Type type;


    public ArrayType(Type type, int line, int column) {
        super(line, column);
        this.type = type;
    }

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size * type.getSize();
    }

    public void setSize(int size) {
        this.size = size;
    }
}
