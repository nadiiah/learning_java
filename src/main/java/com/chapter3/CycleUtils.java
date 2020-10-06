package com.chapter3;

import java.util.Scanner;

public class CycleUtils {
    public static void learnSwitch() {
        Scanner in = new Scanner(System.in);
        System.out.print("Select an option (1, 2, 3, 4) ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
