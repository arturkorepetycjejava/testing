package exception;

public class RandomArrayLengthBelowZeroException extends RuntimeException{
    public RandomArrayLengthBelowZeroException() {
    }

    public RandomArrayLengthBelowZeroException(String message) {
        super(message);
    }
}
