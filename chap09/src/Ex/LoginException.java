package Ex;

public class LoginException extends RuntimeException {
    public enum ErrorType {
    ID_MISMATCH, PW_MISMATCH
    }
    ErrorType errorType;
    public LoginException(String message) {
        super(message);
    }
    public LoginException(String message, ErrorType errorType) {
        super(message);
        this.errorType = errorType;
    }
    public ErrorType getErrorType() {
        return errorType;
    }
}
