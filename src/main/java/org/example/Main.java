package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*примитивные типы данных*/
        byte byteValue = 1; // (-128 до 127) 1байт
        short shortValue = 500; // (-32 768 до 32 767) 2байта
        int intValue = 2000000; // (-2147483648 до 2147483647) 4байта
        long longValue = 4000_000_00L; // (-9*10^18 до 9*10^18) 8байт

        float floatValue = 36.6f; // (до 7 десятичных цифр) 4байта
        double doubleValue = 123.123; // (до 16 десятичных цифр) 8байт

        System.out.println(floatValue);
        System.out.println(doubleValue);
        char charValue = 'a'; //только один символ в одинарных кавычках, 2байта
        char charUnicode = '\u0065'; // шестнадцатиричный код знака
        char charUnicodeX10 = (char) 65; // десятиричный (?) код знака
        boolean booleanValue = true; // true or false, 1байт

        /*не примитивные (ссылочные) типы данных*/

        String stringValue = "Hello"; // определяется массивом char-ов


    }
}
