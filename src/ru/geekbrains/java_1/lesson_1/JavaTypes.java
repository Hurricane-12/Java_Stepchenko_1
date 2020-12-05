package ru.geekbrains.java_1.lesson_1;

public class JavaTypes {

    public static void main(String[] args) {
        //целые типы
        byte b = -128;  // [-128..127]
        short sh = -32767;  // [-32768...32767]
        int i = 2_000_000_000;
        long l = 6_000_000_000l;

        //плавающая точка
        float fl = 0.5f;
        double db = 0.6;

        //символ
        char ch = 'a';

        //булевые
        boolean bool = true;

        int x = 1;
        int y = 2;
        x = y + 3;

        System.out.println("b = " + b);
        System.out.println("sh = " + sh);
        System.out.println(x);
    }

}
