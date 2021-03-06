package com.shelydexter;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26,15,5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        System.out.println("How many integers in the array? ");
        int count = scanner.nextInt();
        int[] unsortedArray = getIntegers(count);

        int[] sortedArray = sortIntegers(count, unsortedArray);

        printArray(sortedArray);
    }

    public static void printArray(int[] intArray) {
        for (int i=0; i<intArray.length; i++) System.out.println(intArray[i]);
    }

    public static int[] sortIntegers(int count, int[] intArray) {

        for (int x=0; x<count; x++) {
            for (int y=x+1; y<count; y++) {
                if (intArray[y] > intArray[x]) {
                    int swap = intArray[x];
                    intArray[x] = intArray[y];
                    intArray[y] = swap;
                }
            }
        }
        return intArray;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers:");
        int[] values = new int[number];
        for (int i=0; i<number; i++) values[i] = scanner.nextInt();
        return values;
    }
}
