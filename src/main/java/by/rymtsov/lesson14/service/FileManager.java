package main.java.by.rymtsov.lesson14.service;

import main.java.by.rymtsov.lesson14.exception.*;
import main.java.by.rymtsov.lesson14.validator.Validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains method to parse
 * a file with documents names.
 * It also uses private method to write
 * results to the files.
 */

public class FileManager {

    public static void parseDocument(Path path) throws InvalidPathException {
        try {
            List<String> documents = Files.readAllLines(path);
            List<String> validDocnums = new ArrayList<>();
            List<String> validContracts = new ArrayList<>();
            List<String> invalidDocuments = new ArrayList<>();

            for (String document : documents) {
                try {
                    Validator.isDocumentNumberValid(document);
                    if (document.startsWith("docnum")) {
                        validDocnums.add(document);
                    } else if (document.startsWith("contract")) {
                        validContracts.add(document);
                    }
                }
                catch (NullDocumentNameException | InvalidDocumentLengthException | InvalidDocumentBeginningException |
                       InvalidDocumentSymbolsException e) {
                    invalidDocuments.add(document + " - " + e.getMessage());
                }
            }
            writeDocuments(validDocnums, validContracts, invalidDocuments);
        } catch (IOException e) {
            throw new InvalidPathException("Invalid file path!");
        }
    }

    private static void writeDocuments(List<String> validDocnums,
                                       List<String> validContracts,
                                       List<String> invalidDocuments) throws IOException {
        Files.write(Paths.get("resources\\validDocnums.txt"), validDocnums);
        Files.write(Paths.get("resources\\validContracts.txt"), validContracts);
        Files.write(Paths.get("resources\\invalidDocuments.txt"), invalidDocuments);
    }
}
