package ru.geekbrains.java_1.lesson_1;

public class HomeWork1 { // Имена классов

    public static void main(String[] args) {
//        - Создать пустой проект в IntelliJ IDEA и прописать метод main(); (Можно также вывести строку "HelloWorld !!!")
        System.out.println("Hello World!!!");
//        - Создать переменные всех пройденных типов данных и инициализировать их значения; (Можно с выводом значения на экран)
        byte var_byte = -120;
        short var_short = 20053;
        int var_int = -200000000;
        long var_long = 100000000L; // не забывать L
        float var_float = 0.234f;
        double var_double = 0.552; // можно опустить d
        char var_char = 'e';
        boolean var_bool = true;

        System.out.println("var_byte = " + var_byte);
        System.out.println("var_short = " + var_short);
        System.out.println("var_int = " + var_int);
        System.out.println("var_long = " + var_long);
        System.out.println("var_float = " + var_float);
        System.out.println("var_double = " + var_double);
        System.out.println("var_char = " + var_char);
        System.out.println("var_bool = " + var_bool);
//          - Написать метод, вычисляющий выражение a * (b + c / d) и возвращающий результат,
//             где a,b,c,d – входные параметры этого метода. (все переменные имеют тип int)

        System.out.println("Результат выражения: " + calcExpression(10, 20, 8, 2));
//        - Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20,
//        если да – вернуть true, в противном случае – false.
//         (включая значения 10 и 20)
        System.out.println("Сумма чисел 13 и 2 лежит в диапазоне [10..20]: " + checkSumRange(13, 2));
//        - Написать метод, который определяет, является ли год високосным. Каждый 4-й год является високосным,
//        кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("Високосный ли год 2100: " + isLeapYear(1700));
    }

    private static int calcExpression(int a, int b, int c, int d) {
        return a * (b + c / d);
    }

    private static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}