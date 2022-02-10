package exception;

public class NullArrayException extends RuntimeException{
    public NullArrayException() {
    }

    public NullArrayException(String message) {
        super(message);
    }
}
