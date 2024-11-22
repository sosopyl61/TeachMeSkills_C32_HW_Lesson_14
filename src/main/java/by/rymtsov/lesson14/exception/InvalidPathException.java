package main.java.by.rymtsov.lesson14.exception;

/**
 * This class is an invalid path exception.
 */

public class InvalidPathException extends Exception {
    public InvalidPathException() {}
    public InvalidPathException(String message) {
        super(message);
    }
}
