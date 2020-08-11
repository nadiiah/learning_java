package com.chapter3;

public class Utils {
    private static final double CM_PER_INCH = 2.54;
    private static final int INT_VAR = -2147483648;
    private static final long LONG_VAR = 9223372036854775807L;
    private static final byte BYTE_VAR = 100;
    private static final short SHORT_VAR = 32767;

    private enum Division {Automation, Manual}

    public static void learningDataTypes() {
        char charVar1 = 'Q';
        char charVar2 = 'A';

        System.out.println("Byte: " + BYTE_VAR);
        System.out.println("Short: " + SHORT_VAR);
        System.out.println("Int: " + INT_VAR);
        System.out.println("Long: " + LONG_VAR);
        System.out.println("Two chars:" + charVar1 + "" + charVar2);
        System.out.println(charVar1 + charVar2);
        System.out.println(charVar1 - charVar2);
    }

    public static void learningMathOperations() {
        float floatVar = 3.40282347E+38F;
        boolean boolVar = true;

        System.out.println("Substract Long and Int =");
        System.out.println(LONG_VAR - INT_VAR);

        System.out.println("Dividing:" + floatVar / 1000000);

        double y = Math.sqrt(BYTE_VAR);
        System.out.println("Square root: " + y);

        double x = Math.pow(BYTE_VAR, 2);
        System.out.println("Power: " + x);
        double result = x + 22767;
        System.out.println("Result: " + result);

        System.out.println("Comparision is ");
        if (SHORT_VAR == result) {
            System.out.println(boolVar);
        } else {
            System.out.println("False!!!");
        }

        System.out.println("Number PI:" + Math.PI);
        System.out.println("Number E:" + Math.E);
    }

    public static void learningConstants() {
        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        final double CONSTANT;
        CONSTANT = 51;
        System.out.println("Constant: " + CONSTANT);


    }

    public static void learningTypeCasting() {
        int n;
        n = 123456789;
        float f1 = n;
        System.out.println("Casting Int to Float:" + f1);
        float f2 = n + f1;
        System.out.println("Casting Int to Float:" + f2);

        double doubleVar = 3.14;
        int castToInt = (int) (n - doubleVar);
        System.out.println("Casting Double to Int:" + castToInt);

        double castToDouble = ((int) (n - doubleVar));
        System.out.println("Casting Int to Double:" + castToDouble);

        double x = 9.997;
        int nx = (int) Math.round(x);
        System.out.println("Round:" + nx);

        int a = 10 % 3;
        System.out.println(a);
    }

    public static void learningEnums() {
        Utils.Division div = Utils.Division.Automation;
        System.out.println("Nadiia wants to be in the " + div + " division :)");
        System.out.println("Nadiia has been working in the " + Division.Manual + " division too long :D");
    }

    public static void learningInitVariables() {
        int a, b, c = 100500;
        b = 1;
        a = 0;
        System.out.println("Few variables: a=" + a + ", b=" + b + ", c=" + c);

        int x = 0;
        x += 4;
        System.out.println("Operation +=" + x);
    }

    public static void learningTypeCastingPart2() {
        int integerRes, integerRes2;
        double doubleRes;
        int intVal = 10;
        double dobVal = 2.5;

        integerRes = (int) (intVal / dobVal);
        System.out.println("Assign dividing result to Int: " + integerRes);
        doubleRes = intVal / dobVal;
        System.out.println("Assign dividing result to Double: " + doubleRes);
        integerRes2 = intVal / (int) dobVal;
        System.out.println("Assign dividing result to Int with casting: " + integerRes2);
    }

    public static void learningStringOperations() {
        String st1 = "substring";
        String st3 = " is time to go to bed";
        int i = 0;

        String st2 = st1.substring(3);
        System.out.println(st2 + " is substring of " + st1);
        System.out.println(i + i + ":" + i + i + st3);
        String sizes = String.join(" / ", "S", "M", "L", "XL");
        System.out.println("Clothes sizes: " + sizes);
        st1 = st1.substring(3) + " changed";
        System.out.println("Changes in the string: " + st1);
    }
}
