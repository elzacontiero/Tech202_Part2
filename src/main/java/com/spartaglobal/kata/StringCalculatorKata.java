package com.spartaglobal.kata;

public class StringCalculatorKata {

    public static int add(String numbers) {

        int result = 0;
        if (numbers.isEmpty()) {
            return 0;
        } else{
            // STEP 4
            String delimiter = ",|\n";

            if(numbers.startsWith("//")) {
                delimiter = "" + numbers.charAt(2);
                numbers = numbers.substring(4);
            }

            String[] splitNums = numbers.split(delimiter);
            for (String s: splitNums){
                result += Integer.parseInt(s);
            }
        }

        return result;
    }
}
