package com.shelydexter;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many integers are you checking? ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("Minimum value of this array is " + min + ".");
    }

    public static int[] readIntegers(int count) {

        int[] intArray = new int[count];
        System.out.println("Please enter " + count + " integers:");
        for (int i=0; i<count; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static int findMin(int[] array) {

        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
