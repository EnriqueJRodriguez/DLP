package codegeneration;

import ast.definitions.VariableDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.Int;

public class AddressCGVisitor extends AbstractCGVisitor<Object,Void>{

    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator){
        super(codeGenerator);
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    /**
     * address[[ Variable: expression -> ID ]]()=
     * if(expression.definition.scope == 0)
     *      <pusha> expression.definition.offset
     * else
     *      <push bp>
     *      <pushi> expression.definition.offset
     *      <addi>
     */
    @Override
    public Void visit(Variable v, Object parameter) {
        if( v.getDefinition().getScope() == 0){
            super.getCodeGenerator().pusha(((VariableDefinition)v.getDefinition()).getOffset());
        } else{
            super.getCodeGenerator().pushBp();
            super.getCodeGenerator().pushi(((VariableDefinition)v.getDefinition()).getOffset());
            super.getCodeGenerator().add(Int.getInstance().suffix());
        }
        return null;
    }

    @Override
    public Void visit(ArrayAccess aa, Object parameter) {
        return super.visit(aa, parameter);
    }

    @Override
    public Void visit(FieldAccess fila, Object parameter) {
        return super.visit(fila, parameter);
    }

}
