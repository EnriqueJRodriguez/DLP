package ast.types;

public class ErrorType extends AbstractType{

    private String errorMessage;

    public ErrorType(int line, int column, String errorMessage) {
        super(line, column);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
