package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("Count value was " + count);
            count++;
        }

        count = 7;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count <= 6);

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }

        // Modify the while code above
        // make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        number = 4;
        count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) continue;
            count++;
            System.out.println("Even number " + number);
            if (count == 5) break;
        }
        System.out.println("Found " + count);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
