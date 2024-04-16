package exceptions;


public class AutomationFrameworkException extends RuntimeException{

    //This is used to handle the exception during execution.
    public AutomationFrameworkException(String message) {
        super(message);
    }
}