public class FirstSample {

    public static final double CM_PER_INCH = 2.54;
    static int intVar =  -2147483648;
    static long longVar = 2147483647;//9223372036854775807;
    static byte byteVar = 100;
    static short shortVar = 32767;
    static char charVar1 = 'Q';
    static char charVar2 = 'A';
    static float floatVar = 3.40282347E+38F;
    static double doubleVar = 3.14;
    static boolean boolVar = true;
    enum Division { Automation, Manual };

    public static void learningDataTypes() {
        System.out.println("Byte: "+ byteVar);
        System.out.println("Short: "+ shortVar);
        System.out.println("Int: "+ intVar);
        System.out.println("Long: "+ longVar);
        System.out.println("Two chars:"+charVar1+""+charVar2);
    }

    public static void learningMathOperations() {
        System.out.println("Substract Long and Int =");
        System.out.println(longVar-intVar);

        System.out.println("Dividing:"+floatVar/1000000);

        double y = Math.sqrt(byteVar);
        System.out.println("Square root: "+ y);

        double x = Math.pow(byteVar,2);
        System.out.println("Power: "+ x);
        double result = x+22767;
        System.out.println("Result: "+ result);
        System.out.println("Comparision is ");
        if (shortVar == result) {
            System.out.println(boolVar);
        } else {
            System.out.println("False!!!");
        }

        System.out.println("Number PI:"+Math.PI);
        System.out.println("Number E:"+Math.E);
    }

    public static void learningConstants() {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        final double CONSTANT;
        CONSTANT = 51;
        System.out.println("Constant: "+CONSTANT);
    }

    public static void learningTypeCasting() {
        int n;
        n = 123456789;
        float f1 = n;
        System.out.println("Casting Int to Float:" +f1);
        float f2 = n + f1;
        System.out.println("Casting Int to Float:" +f2);

        int castToInt = (int) (n - doubleVar);
        System.out.println("Casting Double to Int:" +castToInt);

        double castToDouble = n - doubleVar;
        System.out.println("Casting Int to Double:" +castToDouble);

        double х = 9.997;
        int nx = (int)Math.round(х);
        System.out.println("Round:" +nx);
    }

    public static void learningEnums() {
        Division div = Division.Automation;
        System.out.println("Nadiia wants to be in the "+div+" division :)");
        System.out.println("Nadiia has been working in the "+Division.Manual+" division too long :D");
    }

    public static void learningInitVariables() {
        int a,b,c = 100500;
        b = 1;
        a = 0;
        System.out.println("Few variables: a="+a+", b="+b+", c="+c);
    }

    public static void main(String[] args){
        learningDataTypes();
        learningMathOperations();
        learningConstants();
        learningTypeCasting();
        learningEnums();
        learningInitVariables();
        }
    }
