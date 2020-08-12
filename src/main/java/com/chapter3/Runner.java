package com.chapter3;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
/*        Utils.learningDataTypes();
        Utils.learningMathOperations();
        Utils.learningConstants();
        Utils.learningTypeCasting();
        Utils.learningEnums();
        Utils.learningInitVariables();
        Utils.learningTypeCastingPart2();
        Utils.learningStringOperations();*/

        Scanner string = new Scanner(System.in);
        System.out.print("Please enter a string which will be processed: ");
        String strFromConsole = string.nextLine();
        StringUtils.workWithEnteredString(strFromConsole);
    }
}
