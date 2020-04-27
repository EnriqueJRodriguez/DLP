package codegeneration;

import ast.definitions.Definition;
import ast.definitions.FieldDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.Int;
import ast.types.Struct;

public class AddressCGVisitor extends AbstractCGVisitor<Definition,Void>{

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
    public Void visit(Variable v, Definition parameter) {
        if( v.getDefinition().getScope() == 0){
            super.getCodeGenerator().pusha(((VariableDefinition)v.getDefinition()).getOffset());
        } else{
            super.getCodeGenerator().pushBp();
            super.getCodeGenerator().pushi(((VariableDefinition)v.getDefinition()).getOffset());
            super.getCodeGenerator().add(Int.getInstance().suffix());
        }
        return null;
    }

    /**
     * address[[ ArrayAccess: expression -> expression1 expression2 ]]()=
     * address[[ expression1 ]]()
     * value[[ expression2]]()
     * <push> expression1.elementsSize
     * <mul> Int.instance.suffix
     * <add> Int.instance.suffix
     */
    @Override
    public Void visit(ArrayAccess aa, Definition parameter) {
        aa.getArray().accept(this, parameter);
        aa.getAccessed().accept(valueCGVisitor, parameter);
        super.getCodeGenerator().pushi(aa.getElementSize());
        super.getCodeGenerator().mul(Int.getInstance().suffix());
        super.getCodeGenerator().add(Int.getInstance().suffix());
        return null;
    }

    /**
     * address[[ FieldAccess: expression -> expression1 ID]](fieldDefinition)=
     * address[[ expression1 ]]
     * <push> ((Struct) expression1.type).getField(ID).getOffset()
     * <add> Int.instance.suffix
     */
    @Override
    public Void visit(FieldAccess fila, Definition parameter) {
        fila.getAccessed().accept(this, parameter);
        super.getCodeGenerator().pushi(((Struct) fila.getAccessed().getType()).getField(fila.getField()).getOffset());
        super.getCodeGenerator().add(Int.getInstance().suffix());
        return null;
    }

}
