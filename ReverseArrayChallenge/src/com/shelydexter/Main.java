package com.shelydexter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = {106, 26, 81, 5, 15};
        System.out.println("Initial array: " + Arrays.toString(myIntArray));
        reverse(myIntArray);
        System.out.println("Reversed array: " + Arrays.toString(myIntArray));
    }

    private static void reverse(int[] array) {

        for (int i=0; i<array.length/2; i++) {
            int swap = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = swap;
        }
    }
}
