package ast.types;

import visitor.Visitor;

public class Char extends AbstractType {

    private static Char staticInstance;

    private Char(int line, int column) {
        super(line, column);
    }

    public static Char getInstance() {
        if (staticInstance == null) {
            staticInstance = new Char(0, 0);
        }
        return staticInstance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
