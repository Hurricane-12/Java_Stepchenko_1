package ru.geekbrains.java_1.lesson_5.animals;

public class Animal {

    public static int ONE;

    protected String name;

    public Animal() {
        super();
    }

    public Animal(String name) {
        this.name = name;
    }

    public void moveOnGround(){
        System.out.println(name + " ходит лапами по земле");
    }

    public void voice(){
        System.out.println(name + " издает звук");
    }

    public static void met1() {
        System.out.println("Animal met1");
    }
}
