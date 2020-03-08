package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

public class FieldDefinition extends AbstractDefinition implements Statement {

    public FieldDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }


}
