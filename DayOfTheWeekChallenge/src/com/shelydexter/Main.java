package com.shelydexter;

public class Main {

    private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    private static final String INVALID_DAY_MESSAGE = "Invalid day";

    public static void main(String[] args) {
        printDayOfTheWeek(7);
        printWeekDay(3);
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println(DAYS[day]);
                break;
            default:
                System.out.println(INVALID_DAY_MESSAGE);
                break;
        }
    }

    private static void printWeekDay(int day) {
        if (day >= 0 && day <= 6) {
            System.out.println(DAYS[day]);
        } else {
            System.out.println(INVALID_DAY_MESSAGE);
        }
    }
}
