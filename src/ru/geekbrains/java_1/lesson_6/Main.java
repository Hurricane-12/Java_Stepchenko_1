package ru.geekbrains.java_1.lesson_6;

public class Main {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        String s1 = "Example";
        for (int i = 0; i < 100_000; i++) {
            s1 = s1 + i;
        }

        float deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println(deltaTime + " мсек");

        startTime = System.nanoTime();
        StringBuilder s2 = new StringBuilder("Example");
        for (int i = 0; i < 100_000; i++) {
            s2.append(i);
        }

        deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println(deltaTime + " мсек");

        System.out.println("Строки равны? " + s1.equals(s2.toString()));

//        String s1 = "1";
//        String s2 = "2";
//        System.out.println(s1);
//        System.out.println(s2);
//        boolean b = s1 == s2;
//        boolean c = s1.equals(s2);
//        System.out.println(c);
    }
}
