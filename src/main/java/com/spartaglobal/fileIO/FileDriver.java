package com.spartaglobal.fileIO;

public class FileDriver {
    public static void main(String[] args) {
        // HOMEWORK
        String[] lines = TextFileIO.readFile("employees.csv");
        for (String line : lines) {
            System.out.println(line);
        }
        lines = new String[] {
                "This is the first line",
                "This is a second line"
        };
        TextFileIO.writeFile("test.txt", lines);
        TextFileIO.readwriteFile("test.txt", "output_test.txt");


        // From lesson:
//        TextFileIO.readFile_lesson("src/main/resources/employees_short.csv");
//        System.out.println("Writing as an array of strings");
    }
}
