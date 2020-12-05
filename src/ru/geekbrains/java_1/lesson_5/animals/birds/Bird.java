package ru.geekbrains.java_1.lesson_5.animals.birds;

import ru.geekbrains.java_1.lesson_5.animals.Animal;

public class Bird extends Animal {

    public static int ONE;

    private int h;

    public Bird(String name, int h) {
        super(name);
        this.h = h;
    }

    public void fly() {
        System.out.println(name + " летает на высоте " + h + " метров");
    }

    @Override
    public void voice() {
        System.out.println(name + " чирикает");;
    }
}
