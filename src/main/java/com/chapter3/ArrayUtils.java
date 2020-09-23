package com.chapter3;

import java.util.Arrays;

public class ArrayUtils {
    public static void learnArrays() {
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) names[i] = "";

        names[0] = "Glory";
        names[2] = "Skipper";
        names[4] = "Little";

        for (int i = 0; i < names.length; i++) System.out.println(names[i]);

        for (String element : names) System.out.println(element);

        System.out.println(Arrays.toString(names));
    }
}
