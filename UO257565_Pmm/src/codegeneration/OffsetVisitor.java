package codegeneration;

import ast.definitions.FieldDefinition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Struct;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Boolean, Void> {

    private int globalVariablesCounter;
    private int localVariablesCounter;
    private int parametersSize;

    public OffsetVisitor() {
        super();
        globalVariablesCounter = 0;
        localVariablesCounter = 0;
    }

    @Override
    public Void visit(VariableDefinition vd, Boolean parameter) {
        vd.getType().accept(this, parameter);
        if(vd.getScope() == 0){
            vd.setOffset(globalVariablesCounter);
            globalVariablesCounter += vd.getType().getSize();
        } else if (parameter == null || !parameter){
            localVariablesCounter += vd.getType().getSize();
            vd.setOffset(-localVariablesCounter);
        } else {
            vd.setOffset(4 + parametersSize);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition fund, Boolean parameter) {
        localVariablesCounter = 0;
        for(Statement statement: fund.getStatements()){
            statement.accept(this, parameter);
        }
        fund.getType().accept(this, parameter);
        fund.setLocalVariablesBytes(localVariablesCounter);
        return null;
    }

    @Override
    public Void visit(FunctionType funt, Boolean parameter) {
        parametersSize = 0;
        for(int i = funt.getVariableDefinitions().size() -1; i >= 0 ; i--){
            funt.getVariableDefinitions().get(i).accept(this,true);
            parametersSize += funt.getVariableDefinitions().get(i).getType().getSize();
        }
        return null;
    }

    @Override
    public Void visit(Struct stt, Boolean parameter) {
        int fieldsSize = 0;
        for(FieldDefinition definition: stt.getFields()){
            definition.accept(this, parameter);
            definition.setOffset(fieldsSize);
            fieldsSize += definition.getType().getSize();
        }
        return null;
    }
}
