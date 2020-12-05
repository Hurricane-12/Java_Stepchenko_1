package ru.geekbrains.java_1.lesson_5.homework5;

public class Animal {

    protected final String name;
    protected float maxRunDistance;
    protected float maxSwimDistance;
    protected float maxJumpDistance;

    public Animal(String name) { this.name = name; }

    public void run(float distance){
        if(distance <= maxRunDistance)
            System.out.println(name + " пробежал " + distance + "м");
        else
            System.out.println(name + " не смог пробежать " + distance + "м");
    }

    public void swim(float distance){
        if(distance <= maxSwimDistance)
            System.out.println(name + " переплыл " + distance + "м");
        else
            System.out.println(name + " не смог переплыть " + distance + "м");
    }

    public void jump(float distance){
        if(distance <= maxJumpDistance)
            System.out.println(name + " перепрыгнул " + distance + "м");
        else
            System.out.println(name + " не смог перепрыгнуть " + distance + "м");
    }
}
