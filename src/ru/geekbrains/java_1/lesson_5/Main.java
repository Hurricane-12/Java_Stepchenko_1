package ru.geekbrains.java_1.lesson_5;

import ru.geekbrains.java_1.lesson_5.animals.Animal;
import ru.geekbrains.java_1.lesson_5.animals.birds.Bird;
import ru.geekbrains.java_1.lesson_5.animals.cats.Cat;
import ru.geekbrains.java_1.lesson_5.animals.dogs.Dog;
import ru.geekbrains.java_1.lesson_5.animals.snakes.Snake;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Мышка");
        animals[1] = new Dog("Шерхан");
        animals[2] = new Snake("Каа");
        animals[3] = new Bird("Чижик", 10);

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animals[i].voice();
            if (animal instanceof Bird){
//                Bird bird = (Bird) animal;
//                bird.fly();
                ((Bird) animal).fly();
            }
        }

//        Animal animal = new Bird("Чижик", 10);
//        Bird bird = (Bird) animal;
//        bird.fly();

//        Animal animal = new Dog("Шерхан");
//        boolean bool = animal instanceof Animal;
//        System.out.println(bool);

        float b = 0.1f;
        double a = 0.2;
        a = b;

        Cat cat1 = new Cat("Мышка");
        cat1.moveOnGround();
        cat1.voice();
        Dog dog1 = new Dog("Шерхан");
        dog1.moveOnGround();
        dog1.voice();
        Bird bird1 = new Bird("Невиличка", 10);
        bird1.moveOnGround();
        bird1.fly();
        bird1.voice();
        Snake snake1 = new Snake("Каа");
        snake1.moveOnGround();
        snake1.voice();
    }
}
