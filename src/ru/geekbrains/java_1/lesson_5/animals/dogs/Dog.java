package ru.geekbrains.java_1.lesson_5.animals.dogs;

import ru.geekbrains.java_1.lesson_5.animals.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкает");;
    }
}
