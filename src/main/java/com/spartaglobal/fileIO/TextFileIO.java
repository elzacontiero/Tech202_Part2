package com.spartaglobal.fileIO;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TextFileIO { // a library of static methods.


    /* ---------------  HOMEWORK ---------------------------
     */
    public static String[] readFile(String fileName) {
        List<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        // Convert List<String> to String[]
        // See https://stackoverflow.com/questions/9929321/converting-arraylist-to-array-in-java#9929344
        String[] arrayResult = new String[result.size()];
        result.toArray(arrayResult);
        return arrayResult;
    }


    public static void writeFile(String fileName, String[] lines) {
        try (FileWriter fw = new FileWriter(fileName)) {
            for (String line : lines) {
                fw.write(line);
                fw.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readwriteFile(String inFileName, String outFileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inFileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFileName));

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line+ "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /*
  ----------    readFile from Today's lesson! ----------------
    */
    public static void readFile_lesson(String fileName) {

        // AutoCloseable
        try (FileReader fr = new FileReader(fileName)){

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                var splitLine = line.split(",");
                System.out.println(Arrays.toString(splitLine));


                System.out.println(line);
            }
            // read also throws an exception
//                System.out.println((char)readValue);
//
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
    // From lesson
    // Long way
    public static void readFile(String fileName){

       FileReader fr = null;
       try {
           fr = new FileReader(fileName); // throws a check exception, handle it.
           int readValue;

           while((readValue = fr.read()) != -1) { // read also throws an exception
               System.out.println((char)readValue);
           }

           fr.close();

       }   catch (FileNotFoundException | IOException e) {
           e.printStackTrace();

           // method that belongs to the Exception class
           // basically that has a system, println, the line the exception was called
       }


*/
