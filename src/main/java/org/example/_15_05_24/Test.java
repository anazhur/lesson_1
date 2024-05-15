package org.example._15_05_24;

public class Test {
    public static void main(String[] args) {
        byte byteValue = 4;
        short shortValue = 277;
        int intValue = 7090800;
        long longValue = 4000_000_00L;
        float floatValue = 100.56f;
        double doubleValue = 567.894;
        char charValue = 'a';
        boolean booleanValue = false;
        String stringValue = "Hello";

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);

        int number = 345;
        int dig1 = number / 100;
        int dig2 = (number / 10) % 10;
        int dig3 = number % 10;

        System.out.println("Number" + number + "->" + dig1 + ", " + dig2 + ", " + dig3);
    }
}


