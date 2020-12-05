package ru.geekbrains.java_1.lesson_2;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr = new int[8];
        int[] arr2 = arr;
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("The end " + Arrays.toString(arr));
    }
}
