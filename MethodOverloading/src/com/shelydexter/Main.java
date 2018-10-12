package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Shely", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(0,0));
        System.out.println(calcFeetAndInchesToCentimeters(0,-1));
        System.out.println(calcFeetAndInchesToCentimeters(-1,0));
        System.out.println(calcFeetAndInchesToCentimeters(1,0));
        System.out.println(calcFeetAndInchesToCentimeters(0,1));
        System.out.println(calcFeetAndInchesToCentimeters(1,1));
        System.out.println(calcFeetAndInchesToCentimeters(0));
        System.out.println(calcFeetAndInchesToCentimeters(-1));
        System.out.println(calcFeetAndInchesToCentimeters(1));

    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >= 0
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimeters
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that it's >= 0
    // return -1 if it is not true
    // But if it's valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch - 2.54cm and one foot = 12 inches
    // use the link I gave you to confirm your code is calculating correctly.
    // calling another overloaded method just requires you to use the
    // right number of parameters.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0d && (inches >= 0d && inches < 12d)) {
            inches += feet * 12d;
            return inches * 2.54d;
        }
        return -1d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0d) return inches * 2.54d;
        return -1d;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
