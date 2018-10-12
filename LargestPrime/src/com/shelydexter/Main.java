package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        for (int i = number; i > 1; i--) {
            boolean isPrime = true;
            for (int x = i-1; x > 1; x--) {
                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                for (int x = 1; x <= number; x++) {
                    if (x * i == number) return i;
                }
            }
        }
        return -1;
    }
}
