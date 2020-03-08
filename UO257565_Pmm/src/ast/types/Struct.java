package ast.types;

import ast.definitions.FieldDefinition;

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
}
