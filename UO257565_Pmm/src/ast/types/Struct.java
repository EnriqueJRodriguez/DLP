package ast.types;

import ast.definitions.FieldDefinition;
import visitor.Visitor;

import java.util.List;

public class Struct extends AbstractType {

    private List<FieldDefinition> fields;
    private int size;

    public Struct(int line, int column, List<FieldDefinition> FieldDefinitions) {
        super(line, column);
        this.fields = FieldDefinitions;
        for(FieldDefinition definition: fields){
            size += definition.getType().getSize();
        }
    }

    @Override
    public Type dot(String name) {
        FieldDefinition field = getField(name);
        if(field != null){
            return field.getType();
        }
        return null;
    }

    public FieldDefinition getField(String name){
        for(FieldDefinition field : fields){
            if(field.getName().equals(name)){
                return field;
            }
        }
        return null;
    }

    public List<FieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<FieldDefinition> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        String result;
        result = "Struct[fields:";
        for(int i=0 ; i < fields.size(); i++){
            result += fields.get(i).toString();
            if(i != fields.size()-1){
                result += ",";
            }
        }
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
