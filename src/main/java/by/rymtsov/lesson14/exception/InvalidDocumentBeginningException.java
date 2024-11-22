package main.java.by.rymtsov.lesson14.exception;

/**
 * This class is an invalid document beginning exception.
 */

public class InvalidDocumentBeginningException extends Exception {
    public InvalidDocumentBeginningException() {}
    public InvalidDocumentBeginningException(String message) {
        super(message);
    }
}
