package ru.geekbrains.java_1.lesson_6;

import java.io.IOException;

public class DemoException {

    public static void main(String[] args) {
        int[] arr = new int[1];
        try {
            method();
        } catch (IOException e) {
            throw new RuntimeException(e);
//            System.out.println("Перехватили исключение");
        }
    }

    private static void method() throws IOException{
        throw new IOException("случилось исключение");
    }
}
