package com.chapter3;

import org.apache.commons.lang3.StringUtils;

public class BubbleSorting {

    public static void sortNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int interim = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = interim;
                }
            }
        }
        System.out.print("Array sorted using Bubble Sorting method: ");
        for (int element : numbers) System.out.print(element + " ");
        System.out.print(StringUtils.LF);
    }
}