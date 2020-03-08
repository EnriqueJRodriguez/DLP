package ast.types;

public class Real extends AbstractType {

    private static Real staticInstance;

    private Real(int line, int column) {
        super(line, column);
    }

    public static Real getInstance() {
        if (staticInstance == null) {
            staticInstance = new Real(0, 0);
        }
        return staticInstance;
    }
}
