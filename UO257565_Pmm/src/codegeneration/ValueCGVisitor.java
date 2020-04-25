package codegeneration;

import ast.expressions.*;
import ast.types.Int;

public class ValueCGVisitor extends AbstractCGVisitor<Object,Void>{

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        super(codeGenerator);
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    /**
     * value[[ Arithmetic: expression -> expression1 operator expression2]]() =
     * value[[ expression1 ]]()
     * value[[ expression2 ]]()
     * <arithmetic> operator expression.type
     */
    @Override
    public Void visit(Arithmetic a, Object parameter) {
        a.getLeftOperand().accept(this, parameter);
        a.getRightOperand().accept(this, parameter);
        super.getCodeGenerator().arithmetic(a.getOperator(), a.getType().suffix());
        return null;
    }

    @Override
    public Void visit(ArrayAccess aa, Object parameter) {
        return super.visit(aa, parameter);
    }

    /**
     * value[[ Cast: expression -> type]]()=
     * value[[ expression ]]()
     * <castTo> expression.casted.type type
     */
    @Override
    public Void visit(Cast c, Object parameter) {
        c.getExpression().accept(this,parameter);
        super.getCodeGenerator().castTo(c.getExpression().getType(), c.getType());
        return null;
    }

    /**
     *  value[[ CharLiteral: expression -> CHAR_CONSTANT]]()=
     *  <pushb> expression.value
     */
    @Override
    public Void visit(CharLiteral cl, Object parameter) {
        super.getCodeGenerator().pushb(cl.getValue());
        return null;
    }

    /**
     * value[[ comparison: expression -> expression1 operator expression2]]() =
     * value[[ expression1 ]]()
     * value[[ expression2 ]]()
     * <comparison> operator expression.type.suffix
     */
    @Override
    public Void visit(Comparison com, Object parameter) {
        com.getLeftOperand().accept(this, parameter);
        com.getRightOperand().accept(this, parameter);
        super.getCodeGenerator().compare(com.getOperator(), com.getType().suffix());
        return null;
    }

    @Override
    public Void visit(FieldAccess fila, Object parameter) {
        return super.visit(fila, parameter);
    }

    /**
     *  value[[ IntLiteral: expression -> INT_CONSTANT]]()=
     *  <pushi> expression.value
     */
    @Override
    public Void visit(IntLiteral il, Object parameter) {
        super.getCodeGenerator().pushi(il.getValue());
        return null;
    }

    /**
     * value[[ Logical: expression -> expression1 operator expression2]]() =
     * value[[ expression1 ]]()
     * value[[ expression2 ]]()
     * <logical> operator expression.type
     */
    @Override
    public Void visit(Logical l, Object parameter) {
        l.getLeftOperand().accept(this,parameter);
        l.getRightOperand().accept(this, parameter);
        super.getCodeGenerator().logical(l.getOperator());
        return null;
    }

    /**
     *  value[[ RealLiteral: expression -> REAL_CONSTANT]]()=
     *  <pushf> expression.value
     */
    @Override
    public Void visit(RealLiteral rl, Object parameter) {
        super.getCodeGenerator().pushf(rl.getValue());
        return null;
    }

    /**
     * value[[ UnaryNegation: expression -> operator operand ]]()=
     * <pushi> 0
     * <convertTo> IntegerType.instance expression.type
     * value[[ operand ]]
     * <sub> expression.type.suffix
     */
    @Override
    public Void visit(UnaryMinus um, Object parameter) {
        super.getCodeGenerator().pushi(0);
        super.getCodeGenerator().castTo(Int.getInstance(), um.getType());
        um.getOperand().accept(this, parameter);
        super.getCodeGenerator().sub(um.getType().suffix());
        return null;
    }

    /**
     * value[[ UnaryNegation: expression -> operator operand]]()=
     * value[[ operand ]]()
     * <not>
     */
    @Override
    public Void visit(UnaryNegation un, Object parameter) {
        un.getOperand().accept(this,parameter);
        super.getCodeGenerator().not();
        return null;
    }

    /**
     * value[[ Variable: expression -> ID ]]()=
     * address[[ expression ]]()
     * <load> expression.type.suffix
     */
    @Override
    public Void visit(Variable v, Object parameter) {
        v.accept(addressCGVisitor, parameter);
        super.getCodeGenerator().load(v.getDefinition().getType().suffix());
        return null;
    }
}
