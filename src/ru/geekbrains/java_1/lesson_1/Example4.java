package ru.geekbrains.java_1.lesson_1;

public class Example4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 10;
        c = ~c;
        if(a > 0 & b > 0 | c > 0){
            System.out.println("Первый блок");
        } else {
            System.out.println("Второй блок");
        }
        System.out.println("Конец программы");
    }
}