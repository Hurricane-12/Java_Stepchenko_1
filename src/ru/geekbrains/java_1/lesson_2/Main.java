package ru.geekbrains.java_1.lesson_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 + 1 = " + sum(1,2));
        System.out.println("1 + 1 + 1 = " + sum(1,2,3));
    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int sum(int a, int b, int c){
        return a + b + c;
    }
}
