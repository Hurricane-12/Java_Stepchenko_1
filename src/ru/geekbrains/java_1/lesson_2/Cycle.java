package ru.geekbrains.java_1.lesson_2;

public class Cycle {

    public static void main(String[] args) {
        int i = 0; // инициализация
        while(i < 5) { // условие выполнения цикла
            System.out.println(1);
            i++; // итерация цикла
        }
        System.out.println("The end");

//        do {
//            System.out.println("Печать");
//        } while (true);

        int a = 2;
        for(int n = 0; n < 5; n++) {
            if(n == 2)
                continue;
            System.out.println(a);
            a += 2;
            if(n == 4)
                break;
        }
    }
}
