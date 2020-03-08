package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

public class VariableDefinition extends AbstractDefinition implements Statement, Definition {

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }
}
