package main.java.by.rymtsov.lesson14.exception;

/**
 * This class is an invalid document length exception.
 */

public class InvalidDocumentLengthException extends Exception {

    public InvalidDocumentLengthException() {}
    public InvalidDocumentLengthException(String message) {
        super(message);
    }
}
