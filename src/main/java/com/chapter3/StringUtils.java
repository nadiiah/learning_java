package com.chapter3;

import java.util.Arrays;

public class StringUtils {

    private static String getEnteredText(String enteredString) {
        return enteredString;
    }

    private static int getTextLength(String enteredString) {
        return enteredString.length();
    }

    private static int countLetters(String enteredString) {
        int count = 0;

        for (int i = 0; i < enteredString.length(); i++) {
            if (enteredString.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    private static String findLetterIndex(String enteredString) {
        StringBuilder letterIndexes = new StringBuilder();

        for (int i = 0; i < enteredString.length(); i++) {
            if (enteredString.charAt(i) == 'a') {
                letterIndexes.append(i).append(" ");
            }
        }
        return letterIndexes.toString();
    }

    private static String replaceLetters(String enteredString) {
        return enteredString.replace('a', 'A');
    }

    private static String makeArrayFromString(String enteredString) {
        return Arrays.toString(enteredString.split(" "));
    }

    private static String subtractText(String enteredString) {
        int firstAIndex = enteredString.indexOf('a');
        int lastAIndex = enteredString.lastIndexOf('a');

        return enteredString.substring(firstAIndex, lastAIndex + 1);
    }

    private static String reverseString(String enteredString) {
        StringBuilder reversedText = new StringBuilder();

        for (int i = enteredString.length() - 1; i >= 0; i--) {
            reversedText.append(enteredString.charAt(i));
        }
        return reversedText.toString();
    }

    private static String convertStringToLowerCase(String enteredString) {
        return enteredString.toLowerCase();
    }

    private static String convertStringToUpperCase(String enteredString) {
        return enteredString.toUpperCase();
    }

    public static void workWithEnteredString(String enteredString) {
        System.out.printf("You've entered the following text: %s.\n", getEnteredText(enteredString));
        System.out.printf("Entered text contains %d symbols.\n", getTextLength(enteredString));
        System.out.printf("Entered text contains 'a' letter %d times.\n", countLetters(enteredString));
        System.out.printf("Entered text with replaced 'a' letter: %s.\n", replaceLetters(enteredString));
        System.out.printf("Entered text contains 'a' letter on the following positions: %s\n", findLetterIndex(enteredString));
        System.out.printf("Array of words: %s\n", makeArrayFromString(enteredString));
        System.out.printf("Subtracted text: %s\n", subtractText(enteredString));
        System.out.printf("Reversed string: %s\n", reverseString(enteredString));
        System.out.printf("Entered test converted to lower case: %s\n", convertStringToLowerCase(enteredString));
        System.out.printf("Entered test converted to upper case: %s\n", convertStringToUpperCase(enteredString));
    }
}
