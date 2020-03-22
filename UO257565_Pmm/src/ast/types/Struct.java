package ast.types;

import ast.definitions.FieldDefinition;
import visitor.Visitor;

import java.util.List;

public class Struct extends AbstractType {

    private List<FieldDefinition> fields;

    public Struct(int line, int column, List<FieldDefinition> FieldDefinitions) {
        super(line, column);
        this.fields = FieldDefinitions;
    }

    public List<FieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<FieldDefinition> fields) {
        this.fields = fields;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
