package ru.geekbrains.java_1.lesson_5.homework5;

import ru.geekbrains.java_1.lesson_5.homework5.Animal;

public class MainClass {

    private static final int animalsSize = 3;

    public static void main(String[] args) {
        Animal[] animals = new Animal[animalsSize];
        animals[0] = new Horse("Пегас");
        animals[1] = new Cat("Барсик");
        animals[2] = new Dog("Тузик");

        final float runDistance = 450f;
        final float swimDistance = 16f;
        final float jumpDistance = 1.5f;

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.run(runDistance);
            animal.swim(swimDistance);
            animal.jump(jumpDistance);
            System.out.println();
        }
    }
}
