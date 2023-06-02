package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int x = 1; x <= cathetusLength; x++){
            StringBuilder str = new StringBuilder();
            for (int y = 1; y <= (cathetusLength - x); y++){
                str.append(" ");
            }

            for (int t = 1; t <= x; t++){
                str.append("*");
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
