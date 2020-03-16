package ast.types;

import ast.ErrorHandler;

public class ErrorType extends AbstractType{

    private String errorMessage;

    public ErrorType(int line, int column, String errorMessage) {
        super(line, column);
        this.errorMessage = errorMessage;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error: " + errorMessage + " line: " + getLine() + ", column: " + getColumn() + ".";
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
