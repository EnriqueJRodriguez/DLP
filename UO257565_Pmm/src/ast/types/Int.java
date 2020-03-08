package ast.types;

public class Int extends AbstractType {

    private static Int staticInstance;

    private Int(int line, int column) {
        super(line, column);
    }

    public static Int getInstance() {
        if (staticInstance == null) {
            staticInstance = new Int(0, 0);
        }
        return staticInstance;
    }
}
