package com.chapter3;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public static void learnArrays() {
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            names[i] = "";
        }

        names[0] = "Glory";
        names[2] = "Skipper";
        names[4] = "Little";

        for (String element : names) {
            System.out.println(element);
        }
        System.out.println(Arrays.toString(names));
    }

    public static int[] readArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a size of an array: ");
        int size = in.nextInt();
        int[] myArray = new int[size];
        System.out.print("Please enter elements of the array: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }
        return myArray;
    }

    public static void trySorting(int[] array) {
        System.out.println("Arrays.sort is much easier way to sort an array, Ira! :)");
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + StringUtils.SPACE);
        }
        System.out.print(StringUtils.LF);
    }

    public static void copyArray(int[] array) {
        int[] smallPrimes = array;
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[1] = 12;
        System.out.printf("Element of original array: %s.\n", smallPrimes[1]);
        System.out.printf("Element of copied variable: %s.\n", luckyNumbers[1]);
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        copiedLuckyNumbers[1] = 15;
        System.out.printf("Element of original array: %s.\n", luckyNumbers[1]);
        System.out.printf("Element of copied array: %s.\n", copiedLuckyNumbers[1]);
    }

    public static int[] readArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a size of an array: ");
        int size = in.nextInt();
        int[] myArray = new int[size];
        System.out.print("Please enter elements of the array divided by spaces: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }
        return myArray;
    }

    public static void trySorting(int[] array) {
        System.out.println("Arrays.sort is much easier way to sort an array, Ira! :)");
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + StringUtils.SPACE);
        }
        System.out.print(StringUtils.LF);
    }

    public static void copyArray(int[] array) {
        int[] smallPrimes = array;
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[1] = 12;
        System.out.printf("Element of original array: %s.\n", smallPrimes[1]);
        System.out.printf("Element of copied variable: %s.\n", luckyNumbers[1]);
        if (Arrays.equals(smallPrimes, luckyNumbers)) {
            System.out.println("These two arrays are equal");
        } else {
            System.out.println("These two arrays are different");
        }
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        copiedLuckyNumbers[1] = 15;
        System.out.printf("Element of original array: %s.\n", luckyNumbers[1]);
        System.out.printf("Element of copied array: %s.\n", copiedLuckyNumbers[1]);
        if (Arrays.equals(luckyNumbers, copiedLuckyNumbers)) {
            System.out.println("These two arrays are equal");
        } else {
            System.out.println("These two arrays are different");
        }
    }

    public static void fillArrayValues(int[] array) {
        int a = 0;
        Arrays.fill(array, a);
        System.out.printf("Array filled with new values: %s", Arrays.toString(array));
    }
}
