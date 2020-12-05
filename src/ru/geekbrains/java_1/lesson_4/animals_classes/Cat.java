package ru.geekbrains.java_1.lesson_4.animals_classes;

public class Cat {

    private String name;
    private String color;
    private int age;

    private static int catsCount;

    public Cat(){
        this("Барсик", "Черный", 1);
    }

    public Cat(String name){
        this(name, "черный", 1);
    }

    public Cat (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catsCount++;
    }

    public static int getCatsCount(){
//        name = "абв";
        return catsCount;
    }

    public void printInfo(){
        System.out.println(
                "Cat name: " +  name +
                " color: " + color +
                " age: " + age);
    }

    public void setAge(int age){
        if (age < 0 || age > 100) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}
