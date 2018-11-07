package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        // Test of checkPalindrome():
        System.out.println(checkPalindrome("Is this a palindrome? Not sure!"));
        System.out.println(checkPalindrome("Super Taco Cat, rep. us!"));
    }

    public static boolean checkPalindrome(String inputString) {
        String[] stringArray = inputString.toLowerCase().split("\\s*[^A-Za-z0-9]\\s*");
        String forwards = String.join("", stringArray);
        String backwards = new StringBuilder(forwards).reverse().toString();
        if (forwards.equals(backwards)) {
            return true;
        }
        return false;
    }
}
