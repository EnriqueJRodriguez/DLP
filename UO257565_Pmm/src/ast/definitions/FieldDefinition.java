package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

public class FieldDefinition extends AbstractDefinition implements Statement {

    public FieldDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
