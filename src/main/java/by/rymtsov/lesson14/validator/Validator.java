package main.java.by.rymtsov.lesson14.validator;

import main.java.by.rymtsov.lesson14.exception.InvalidDocumentBeginningException;
import main.java.by.rymtsov.lesson14.exception.InvalidDocumentLengthException;
import main.java.by.rymtsov.lesson14.exception.InvalidDocumentSymbolsException;
import main.java.by.rymtsov.lesson14.exception.NullDocumentNameException;

import java.util.Objects;

/**
 * This class contains method to check validation
 * of the document name.
 */

public class Validator {

    public static void isDocumentNumberValid(String documentNumber)
            throws InvalidDocumentLengthException, InvalidDocumentSymbolsException,
            InvalidDocumentBeginningException, NullDocumentNameException {
        if (Objects.equals(documentNumber, "") || documentNumber == null) {
            throw new NullDocumentNameException("Null document name!");
        }
        if (documentNumber.length() != 15) {
            throw new InvalidDocumentLengthException("Invalid document length!");
        }

        if (!documentNumber.matches("^[a-zA-Z0-9]+$")) {
            throw new InvalidDocumentSymbolsException("Invalid document symbols!");
        }

        if (!documentNumber.startsWith("docnum") && !documentNumber.startsWith("contract")) {
            throw new InvalidDocumentBeginningException("Invalid document beginning!");
        }
    }
}
