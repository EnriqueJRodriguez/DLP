package ast.types;

import ast.definitions.VariableDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<VariableDefinition> variableDefinitions;
    private int parametersSize;

    public FunctionType(int line, int column, Type returnType, List<VariableDefinition> variableDefinitions) {
        super(line, column);
        this.returnType = returnType;
        this.variableDefinitions = variableDefinitions;
        for(VariableDefinition definition: variableDefinitions){
            this.parametersSize += definition.getType().getSize();
        }
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public List<VariableDefinition> getVariableDefinitions() {
        return variableDefinitions;
    }

    public void setVariableDefinitions(List<VariableDefinition> variableDefinitions) {
        this.variableDefinitions = variableDefinitions;
    }

    @Override
    public Type parenthesis(List<Type> types) {
        if(types.size() != variableDefinitions.size()){
            return null;
        }
        for(int i=0; i < types.size(); i++){
            if(!(types.get(i).promotesTo(variableDefinitions.get(i).getType()))){
                return null;
            }
        }
        return returnType;
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "returnType=" + returnType +
                ", variableDefinitions=" + variableDefinitions +
                '}';
    }

    @Override
    public int getSize() {
        return parametersSize;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
