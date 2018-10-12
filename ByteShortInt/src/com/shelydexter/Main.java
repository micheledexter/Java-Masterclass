package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.
		byte myByte = 99;

		// 2. Create a short variable and set it to any valid short number.
		short myShort = 10000;

		// 3. Create an int variable and set it to any valid int number.
		int myInt = 1_000_000_000;

		// 4. Create a variable of type long, and make it equal to
		// 50000 + 10 times the sum of the byte, plus the short plus the int

		long myLong = 50000L + 10L * (myByte + myShort + myInt);

		System.out.println(myLong);
    }
}
