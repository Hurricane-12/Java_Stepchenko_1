package ru.geekbrains.java_1.lesson_5.homework5;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
        maxRunDistance = 400f;
        maxJumpDistance = 1.8f;
    }

    @Override
    public void swim(float distance){
        System.out.println(name + " не умеет плавать");
    }
}
