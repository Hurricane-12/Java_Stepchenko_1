package ru.geekbrains.java_1.lesson_2;

import java.util.Scanner;

public class ScannerFirst {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = sc.nextLine();
        System.out.println("Вы написали " + s1);
    }
}
