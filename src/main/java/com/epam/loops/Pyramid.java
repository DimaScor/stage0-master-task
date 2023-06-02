package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if(cathetusLength > 0){
             for(int i = 0; i < cathetusLength;i++ ){
                StringBuilder str = new StringBuilder();
                 for(int y = 0; y < (cathetusLength -(i+1)); y++){
                     str = new StringBuilder(str.toString().concat(" "));
                 }
                 int op = str.length();
                 for(int x = op; x < (2 * cathetusLength-1)-op; x++){
                     if(x < cathetusLength){
                         str.append(cathetusLength - x);
                     }
                     if(x >= cathetusLength){
                         str.append(x + 2 - cathetusLength);
                     }
                 }
                 System.out.println(str);
             }
        }else {
            System.out.print( "" );
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }

}
