package main.java.by.rymtsov.lesson14.exception;

/**
 * This class is a null document name exception.
 */

public class NullDocumentNameException extends Exception {
    public NullDocumentNameException() {}
    public NullDocumentNameException(String message) {
        super(message);
    }
}
