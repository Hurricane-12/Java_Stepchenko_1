package ru.geekbrains.java_1.lesson_5.animals.snakes;

import ru.geekbrains.java_1.lesson_5.animals.Animal;

public class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void moveOnGround(){
        System.out.println(name + " ползает");
    }

    @Override
    public void voice() {
        System.out.println(name + " шипит");;
    }
}
