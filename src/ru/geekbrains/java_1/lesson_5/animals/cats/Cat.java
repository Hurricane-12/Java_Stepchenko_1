package ru.geekbrains.java_1.lesson_5.animals.cats;

import ru.geekbrains.java_1.lesson_5.animals.Animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void moveOnGround() {
        super.moveOnGround();
        System.out.println(name + " прыгает");
    }

    @Override
    public void voice() {
        System.out.println(name + " мяукает");;
    }

    public static void met1() {
        System.out.println("Animal met1");
    }
}
