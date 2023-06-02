package com.epam.conditions;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year > 0 && (month > 0 && month < 13)){
            int days=0;
            Month mth = Month.of(month);

            if (Year.of(year).isLeap() &&
                    Month.FEBRUARY.equals(mth)){
                days = mth.maxLength();
            }else {
                days = mth.minLength();
            }
            System.out.println(days);
        }else {
            System.out.println("invalid date");
        }
    }

}
