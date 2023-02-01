package com.spartaglobal.kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculatorKataTest {

    //-------------- Step 1----------------------

    @Test
    @DisplayName("Test StringCalculatorKata for no arguments")
    public void stringCalculatorForNoArguments(){

        String numbers = "";

        int result = StringCalculatorKata.add(numbers);
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("Test StringCalculatorKata for One argument")
    public void stringCalculatorForOneArgument(){

        String number = "1";
        int result = StringCalculatorKata.add(number);
        Assertions.assertEquals(1,result);

    }

    @Test
    @DisplayName("Test StringCalculatorKata for Two arguments")
    public void stringCalculatorForTwoArguments(){

        String number = "1,2";
        int result = StringCalculatorKata.add(number);
        Assertions.assertEquals(3,result);

     }

     //------------------------ Step 2-------------------
    @ParameterizedTest
    @DisplayName("Test StringCalculatorKata for multiple numbers to be entered")
    @CsvSource({"3;4;5;6,18",
            "-1;0;10;3,12"})// in pairs, you put the input, result of the sum;
    public void multipleNumbersToBeEntered(String input, int expectedResult){

        input = input.replace(';',',');

        int result = StringCalculatorKata.add(input);
        Assertions.assertEquals(expectedResult,result);

    }

    // ------------------------ Step 3-------------------

    @Test
    @DisplayName ("Test step 3 accepting new lines and commas as separators")
    public void  newLinesAndCommasAsSeparators(){
        String s = "-1,0,10\n10,15";
        int result = StringCalculatorKata.add(s);
        Assertions.assertEquals(34,result);
    }

    // ------------------------ Step 4-------------------

    @Test
    @DisplayName ("Test step 4 accept delimiter on first line")
    public void  testDelimiterSpecificationOnFirstLine(){
        String s= "//;\n1;2;3;4";
        int result = StringCalculatorKata.add(s);
        Assertions.assertEquals(10,result);
    }

}
