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

        int[] copyArray = array.clone();
        for (int i=0; i<array.length; i++) array[i] = copyArray[(array.length - 1) - i];
    }
}
