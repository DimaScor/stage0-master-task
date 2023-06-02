package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        String[] stringedNumbers = Integer.toString(number).split("");
        for (String elemOfArray:
             stringedNumbers) {
            int innerBeast = Integer.parseInt(elemOfArray);
            sum+= innerBeast;
        }
        System.out.println(sum);
    }

}
