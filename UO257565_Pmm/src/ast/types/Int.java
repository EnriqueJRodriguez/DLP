package ast.types;

import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
