package hexlet.code;

public class IncorrectGameNumberException extends Exception {
    public IncorrectGameNumberException(String errorMessage) {
        super(errorMessage);
    }
}
