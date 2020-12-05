package ru.geekbrains.java_1.lesson_2;

import java.util.Scanner;

public class SwitchFirst {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("default");
        }
    }
}
