package guru.qa;

import java.util.Random;

public class BasicJava {

    static byte minByte = -128;
    static byte maxByte = 127;

    static short minShort = -32768;
    static short aShort = 137;
    static short maxShort = 32767;

    static int minInt = -2147483648;
    static int aInt = -10;
    static int bInt = 23;
    static int maxInt = 2147483647;

    static long minLong = Long.MIN_VALUE;
    static long maxLong = Long.MAX_VALUE;

    static float aFloat = 4.03f;
    static float bFloat = -17.023f;

    static double aDouble = 183.83;
    static double bDouble = 1;

    static boolean tBoolean = true;
    static boolean fBoolean = false;

    static char aChar = 'a';
    static char dChar = 'd';
    static char sevenChar = '7';

    static String aString = "test";

    static int[] intArray = {35, 61, -107, 23, 76};
    static char[] charArray = {'q', 'a', 'g', 'u', 'r', 'u'};
    static String[] stringArray = {"qa", "Automation", "Engineer"};

    public static void calculations() {

        int sumInt = aInt + bInt;
        float sumFloat = aFloat + bFloat;
        System.out.println("aInt + bInt = " + sumInt);
        System.out.println("aFloat + bFloat = " + sumFloat);

        int minusInt = aInt - bInt;
        double minusDouble = aDouble - bDouble;
        System.out.println("aInt - bInt = " + minusInt);
        System.out.println("aDouble - bDouble = " + minusDouble);

        int multiplyInt = aInt * bInt;
        System.out.println("aInt * bInt = " + multiplyInt);

        int divideInt1 = aInt / bInt;
        int divideInt2 = bInt / aInt;
        int divideInt3 = bInt % aInt;
        System.out.println("aInt / bInt = " + divideInt1);
        System.out.println("bInt / aInt = " + divideInt2);
        System.out.println("bInt % aInt = " + divideInt3);

        System.out.println("minByte = " + minByte);
        System.out.println("maxInt = " + maxInt);
        System.out.println("minInt = " + minInt);
        System.out.println("maxShort = " + maxShort);
        System.out.println("minShort = " + minShort);
        System.out.println("maxLong = " + maxLong);
        System.out.println("minLong = " + minLong);

        System.out.println("aChar + sevenChar = " + aChar + sevenChar);
        System.out.println("Length of aString is " + aString.length());
        System.out.println("caps aString is " + aString.toUpperCase());
        int fInt = intArray[1] * intArray[2];
        int gInt = charArray[0] + charArray[1];
        String bString = stringArray[0] + stringArray[1] + stringArray[2];
        System.out.println("fInt = " + fInt);
        System.out.println("gInt = " + gInt);
        System.out.println("bString = " + bString);
    }


    public static void conditionCalculation() {

        Random random = new Random();
        int randomNumber = random.nextInt(30);

        if (maxByte == 127) {
            System.out.println("maxByte = 127 is " + tBoolean);
        }

        if (randomNumber > bInt) {
            System.out.println(randomNumber + " > " + bInt + " is " + tBoolean);
        }
        else {
            System.out.println(randomNumber + " > " + bInt + " is " + fBoolean);
        }

        boolean orBoolean = (aInt > bInt) || (bInt % aInt == 5);
        boolean andBoolean = (aFloat > 4) && (stringArray[1].equals("Automation"));
        System.out.println("orBoolean is " + orBoolean);
        System.out.println("andBoolean is  " + andBoolean);
    }

    public static void mixedCalculation() {
        byte cByte = (byte) (maxByte * 2);
        int dByte = maxByte * 2;
        System.out.println("cByte = " + cByte);
        System.out.println("dByte = " + dByte);

        short bShort = (short) (aShort + aInt);
        int cInt = aShort + aInt;
        System.out.println("bShort = " + bShort);
        System.out.println("cInt = " + cInt);

        int dInt = (int) (bInt + aFloat);
        float cFloat = bInt + aFloat;
        System.out.println("dInt = " + dInt);
        System.out.println("cFloat = " + cFloat);

        System.out.println("aString + dChar = " + aString + dChar);
        int eInt = sevenChar + aInt;
        System.out.println("eInt = " + eInt);
    }

    public static void main(String[] args) {
        calculations();
        conditionCalculation();
        mixedCalculation();
    }
}
