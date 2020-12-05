package ru.geekbrains.java_1.lesson_2;

import java.util.Arrays;

public class MultiArray {

    public static void main(String[] args) {
        int[] [] arr = new int[5][2];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i] [j] = a;
                a++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[3] [1]);

    }
}
