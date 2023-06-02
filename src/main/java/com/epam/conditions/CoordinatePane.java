package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String str = "";
        if (x > 0 && y > 0) str = "first";
        if (x < 0 && y > 0) str = "second";
        if (x < 0 && y < 0) str = "third";
        if (x > 0 && y < 0) str = "fourth";
        if (x == 0 && y == 0) str = "zero";

        System.out.println(str);
    }
}

