package com.shelydexter;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(0,0));
        System.out.println(getDurationString(-1,0));
        System.out.println(getDurationString(0,-1));
        System.out.println(getDurationString(1,1));
        System.out.println(getDurationString(0,60));
        System.out.println(getDurationString(0,70));
        System.out.println(getDurationString(10,55));
        System.out.println(getDurationString(60,35));
        System.out.println(getDurationString(1000,23));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(1));
        System.out.println(getDurationString(10));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(23462356));
        System.out.println(getDurationString(90061));
        System.out.println(Math.PI);
    }

    // Create a method called getDurationString with two parameters, first parameter is minutes
    // and 2nd parameter is seconds
    // You should validate that the first parameter minutes is >= 0.
    // You should validate that the 2nd parameter seconds is >= 0 and <= 59.
    // Return "Invalid value" in the method if either of the above is not true
    // If the parameters are valid then calculate how many hours minutes and seconds
    // comprise the minutes and seconds passed to this method and return that value
    // as a string in format "XXh XXm XXs" where XX represents a number of hours minutes and seconds
    // Create a 2nd method of the same name but with only one parameter seconds
    // Validate that it is >= 0, and return "Invalid value" if it is not true
    // If it is valid, then calculate how many minutes are in the seconds and then
    // call the other overloaded method passing the correct minutes and seconds calculated so
    // that it can calculate correctly
    // Call both methods to print values in main method

    // Tips:
    // Use int or long for your number data types is probably a good idea
    // 1 minute = 60 seconds and 1 hour = 60 minutes = 3600 seconds
    // Methods should be static currently we are only using static methods

    // Bonus:
    // For the input 61 minutes out put should be 01h 01m 00s, but it is okay if it is 1h 1m 0s (Tip: use if-else)
    // Create new project with name SecondsAndMinutesChallenge

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= 60) return INVALID_VALUE_MESSAGE;
        int hours = minutes / 60;
        minutes %= 60;
        String result = "";
        if (hours < 10) result += "0";
        result += hours + "h ";
        if (minutes < 10) result += "0";
        result += minutes + "m ";
        if (seconds < 10) result += "0";
        result += seconds + "s";
        return result;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        int minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
}
