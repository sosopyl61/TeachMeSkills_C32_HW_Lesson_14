package main.java.by.rymtsov.lesson14.exception;

/**
 * This class is an invalid document symbols exception.
 */

public class InvalidDocumentSymbolsException extends Exception {
    public InvalidDocumentSymbolsException() {}
    public InvalidDocumentSymbolsException(String message) {
        super(message);
    }
}
