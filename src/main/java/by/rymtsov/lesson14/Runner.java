package main.java.by.rymtsov.lesson14;

import main.java.by.rymtsov.lesson14.exception.InvalidPathException;
import main.java.by.rymtsov.lesson14.service.FileManager;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * This is the application runner class.
 * Here user can input a path to the file
 * and then get three files:
 * valid contracts, valid docnums and invalid documents.
 */

public class Runner {
    public static void main(String[] args) throws InvalidPathException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();
        Path inputhPath = Paths.get(path);
        FileManager.parseDocument(inputhPath);
        sc.close();
    }
}
