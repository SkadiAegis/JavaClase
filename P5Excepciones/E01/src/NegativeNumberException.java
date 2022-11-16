public class NegativeNumberException extends Exception {
    public NegativeNumberException() { //Constructor vacio
    }

    public NegativeNumberException(String message) { //Constructor con mensaje
        super(message);
    }
}
