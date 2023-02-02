package com.spartaglobal.regexr;

import java.util.regex.Pattern;

public class RegExr {
    public static void main(String[] args) {

        // Wildcards in sql = "%A"

        // Character class = represents all possibilities of a SINGLE character  [ ]


        boolean match1 = Pattern.matches("[abc]", "a"); // Does input match either a,b or c?
        // if it is "t" in the second part then it doesn't match.

        // ^ (hat) INSIDE Character class means "NOT this" - like ! in Java - CAREFUL!
        boolean match2 = Pattern.matches("[^abc]", "b");// any character that is NOT included inside here!

        // how many occurrences, but they all have to match (zero to many of the character class)
        boolean match3 = Pattern.matches("[tkwift]*", "b");

        // the below means "zero to many" of the preceding character or character class
        boolean match4 = Pattern.matches("[abc]+", "b");

        // Back to Single char! Ranges
        boolean match5 = Pattern.matches("[a-h][j-y]", "u");

        // ^ OUTSIDE character class - means "starts with"
        // () is to group characters, so the special 'conditional' character apply to the whole substring.


        // . (do) means "any character" including alphanumeric, whitespace and special characters"
        // [a-zA-Z0-9] means "any alphanumeric character"

        boolean match7 = Pattern.matches("^(Once upon a time).+", "Once upon a time");

        //$ at the end means ENDS with
        boolean match8 = Pattern.matches("[abc]$", "any text that ends with abc");

        // Example of validation: Emails
        boolean match10 = Pattern.matches("[\\w]+@[a-z]+\\..+", "info@asos.co.uk");

        // Using regex with string replaceAll method
        String input = "...fgcionjrvoini LTozer@asos.co.uk drcgfijdrfo.... CFrench@gmail.com 54uyh0tgrhh EContiero@sky.com.br 4weu5ht0";
        var output = input.replaceAll("[\\w]+@[a-z]+(\\.\\w+){1,2}", "hr@spartaglobal.com");
        System.out.println(output);
    }



}
