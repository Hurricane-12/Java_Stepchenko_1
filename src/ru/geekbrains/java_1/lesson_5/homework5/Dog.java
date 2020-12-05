package ru.geekbrains.java_1.lesson_5.homework5;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        maxRunDistance = 2000f;
        maxSwimDistance = 15f;
        maxJumpDistance = 1.2f;
    }
}
