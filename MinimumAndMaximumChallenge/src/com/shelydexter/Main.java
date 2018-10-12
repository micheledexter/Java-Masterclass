package com.shelydexter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sysInScanner = new Scanner(System.in);
        boolean isValid = true;
        int min = 0;
        int max = 0;
        boolean start = true;

        while (true) {
            System.out.println("Enter number:");
            isValid = sysInScanner.hasNextInt();
            if (!isValid) break;
            int number = sysInScanner.nextInt();
            sysInScanner.nextLine();
            if (start) {
                min = number;
                max = number;
                start = false;
            }
            if (number < min) min = number;
            if (number > max) max = number;
        }

        if (start) {
            System.out.println("No numbers entered");
        } else {
            System.out.println("Minimum value was: " + min);
            System.out.println("Maximum value was: " + max);
        }
        sysInScanner.close();
    }
}
