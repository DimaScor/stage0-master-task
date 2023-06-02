package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if(divider > 0 && dividend > 0){
            int dividedValue = dividend / divider;
            int temp = dividedValue * divider;
            if(temp == dividend){
                System.out.println("can be divided completely");
            }else {
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }
    }

}
