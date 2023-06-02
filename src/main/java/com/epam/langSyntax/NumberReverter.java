package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder sb = new StringBuilder(Integer.toString(number));
        System.out.println(sb.reverse());
    }
}
