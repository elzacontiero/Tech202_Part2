package com.spartaglobal;

public class TypeConversionApp {
    public static void main(String[] args) {
        // Safe implicit widening type conversions
        var result = 5.50/5; // It is a double. C
        var myInt = 5;
        double myNum = myInt;

        // Unsafe explicit narrowing type conversions
        // go from long to an int or double to an int

        // two ways: casting, or various java methods

        // Casting

        double pi = 3.14159265359;
        float floatPi = (float)pi;

        long popUKLong = 67_890_000;
        int popUK = (int)popUKLong;

        long popWorldLong = 8_000_000_000L;
        int popWorldInt = (int)popWorldLong;

        // Wrapper classes doing similar things
        //As alternative to using casting, you can use the methods of Class

        Long popWorldLongWrapper = popWorldLong;
        Long popWorldWrapper2 = Long.valueOf(popWorldLong);

        popWorldInt = popWorldLongWrapper.intValue();

        // Math static methods thrown an exception rather than overflow

        var result1 = Math.toIntExact(popUK);
        //var result2 = Math.toIntExact(popWorldLong); throw an exception


        //var sum = Integer.MAX_VALUE + 1;
        var sum2 = Math.addExact(Integer.MAX_VALUE, 1);

        // Conversion from number to string and vice versa
        String strNum = "52";
        // int num = (int)strNum;

        int intNum = Integer.parseInt(strNum);


    }

}
