package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        printSquareStar(-5);
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        for (int x = 0; x < number; x++) {
            String row = "";
            for (int y = 0; y < number; y++) {
                if (y == 0 || y == number - 1 || x == 0 || x == number - 1) {
                    row += "*";
                } else if (y == x || number - y - 1 == x) {
                    row += "*";
                } else {
                    row += " ";
                }
            }
            System.out.println(row);
        }
    }
}
