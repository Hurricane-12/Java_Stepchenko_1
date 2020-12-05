package ru.geekbrains.java_1.lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 1)
                arr1[i] = 0;
            else
                arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1 + i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr2.length; i++) {
            if (mas[i] < 6)
                mas[i] *= 2;
            }
        System.out.println(Arrays.toString(mas));

        int[] arr5 = { -1, 5, 298, -324, 102, 4, 1, 6, -503 };
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if(arr5[i] > max)
                max = arr5[i];
            if(arr5[i] < min)
                min = arr5[i];
        }
        System.out.println("max = " + max + ", min = " + min);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа и действие: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        String action = sc.next();
        switch (action) {
            case "+":
                System.out.println(a + " " + action + " " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " " + action + " " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " " + action + " " + b + " = " + (a * b));
                break;
            case "/":
                if(b == 0)
                    System.out.println("Делить на 0 нельзя");
                else
                    System.out.println(a + " " + action + " " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Неизвестное действие");
        }
        sc.close();
    }
}
