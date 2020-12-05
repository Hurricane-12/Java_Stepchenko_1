package ru.geekbrains.java_1.lesson_4;

import ru.geekbrains.java_1.lesson_4.animals_classes.Cat;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.printInfo();
        System.out.println("cat1 age = " + cat1.getAge());
//        Cat cat2 = new Cat("Рыжик", "Оранжевый", 2);
//        cat2.printInfo();
//        System.out.println("catsCount = " + Cat.getCatsCount());
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот индекс " + i);
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
            System.out.println("-------");
        }
        System.out.println("Общее количество котов " + Cat.getCatsCount());
    }
}
