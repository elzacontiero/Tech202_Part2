package com.spartaglobal.fileIO;

public class FileDriverMain {
    public static void main(String[] args) {
        // HOMEWORK
        String[] lines = TextFileIO.readFile("employees.csv");
        for (String line : lines) {
            System.out.println(line);
        }
        lines = new String[] {
                "This is the first line.",
                "This is a second line."
        };
        TextFileIO.writeFile("test.txt", lines);
        TextFileIO.readwriteFile("test.txt", "output_test.txt");

    }
}
