package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        // Test of checkPalindrome():
        System.out.println(checkPalindrome("Is this a palindrome? Not sure!"));
        System.out.println(checkPalindrome("Super Taco Cat, rep. us!"));
    }

    public static boolean checkPalindrome(String inputString) {
        String[] stringArray = inputString.split("\\s*[^A-Za-z]\\s*");
        String forwards = "";
        String backwards = "";
        for (String word: stringArray) {
            for (String letter: word.split("")) {
                letter = letter.toLowerCase();
                forwards += letter;
                backwards = letter + backwards;
            }
        }
        if (forwards.equals(backwards)) {
            return true;
        }
        return false;
    }
}
