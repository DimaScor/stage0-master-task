package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sumOfAllElements = 0;
        for (int j : arr) {
            sumOfAllElements += j;
        }
        return sumOfAllElements;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reverseArray = new String[arr.length];
        for(int i = 0; i < reverseArray.length; i++){
            reverseArray[i] = arr[arr.length-i - 1];
        }
        return reverseArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] tempToSortArray = new int[arr.length];
        int[] positiveNumsArray;
        int currentIndex = 0;
        for (int tempValue : arr) {
            if (tempValue > 0) {
                tempToSortArray[currentIndex] = tempValue;
                currentIndex++;
            }
        }
        positiveNumsArray = new int[currentIndex];
        System.arraycopy(tempToSortArray, 0, positiveNumsArray, 0, positiveNumsArray.length);
        return positiveNumsArray;
    }


    public static int[][] sortRaggedArray(int[][] arr) {
        // Sort the numbers in each one-dimensional array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][k] < arr[i][j]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }

        int[][] initiallyArray = new int[arr.length][];
        System.arraycopy(arr, 0, initiallyArray, 0, arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int place1=0;
                int place2=0;
                for (int num = 0; num < arr.length; num++) {
                    if (checkArrayForEquality(arr[i], initiallyArray[num])){
                        place1 = num;
                    }
                    if (checkArrayForEquality(arr[j], initiallyArray[num])){
                        place2 = num;
                    }
                }

                if (arr[j].length < arr[i].length ||
                        (arr[j].length < arr[i].length&& place1 < place2) ||
                        arr[i].length == arr[j].length && (place1 > place2)
                ) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }

    public static boolean checkArrayForEquality(int[] arrayOfNumbers, int[] initiallyArray){
        if(arrayOfNumbers.length != initiallyArray.length){
            return false;
        }
        for (int i = 0; i < arrayOfNumbers.length; i++){
            if(arrayOfNumbers[i] != initiallyArray[i]){
                return false;
            }
        }
        return true;
    }

}