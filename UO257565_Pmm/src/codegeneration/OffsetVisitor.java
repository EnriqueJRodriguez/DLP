package codegeneration;

import ast.definitions.FieldDefinition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Struct;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor {

    private int globalVariablesCounter;
    private int localVariablesCounter;

    public OffsetVisitor() {
        super();
        globalVariablesCounter = 0;
        localVariablesCounter = 0;
    }

    @Override
    public Object visit(VariableDefinition vd, Object parameter) {
        vd.getType().accept(this, parameter);
        if(vd.getScope() == 0){
            vd.setOffset(globalVariablesCounter);
            globalVariablesCounter += vd.getType().getSize();
        } else if ( parameter == null || !(boolean)parameter){
            localVariablesCounter += vd.getType().getSize();
            vd.setOffset(-localVariablesCounter);
        }
        return null;
    }

    @Override
    public Object visit(FunctionDefinition fund, Object parameter) {
        localVariablesCounter = 0;
        for(Statement statement: fund.getStatements()){
            statement.accept(this, parameter);
        }
        fund.getType().accept(this, parameter);
        fund.setLocalvariablesBytes(-1 * localVariablesCounter);
        return null;
    }

    @Override
    public Object visit(FunctionType funt, Object parameter) {
        int parametersSize = 0;
        for(int i = funt.getVariableDefinitions().size() -1;
            i >= 0 ; i--){
            funt.getVariableDefinitions().get(i).accept(this,true);
            funt.getVariableDefinitions().get(i).setOffset(4 + parametersSize);
            parametersSize += funt.getVariableDefinitions().get(i).getType().getSize();
        }
        return null;
    }

    @Override
    public Object visit(Struct stt, Object parameter) {
        int fieldsSize = 0;
        for(FieldDefinition definition: stt.getFields()){
            definition.accept(this, parameter);
            definition.setOffset(fieldsSize);
            fieldsSize += definition.getType().getSize();
        }
        return null;
    }
}
