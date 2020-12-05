package ru.geekbrains.java_1.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class NougthsAndCrosses {

    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '*';
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rnd = new Random();
    private static int field_size_y;
    private static int field_size_x;
    private static char[][] field;

    public static void main(String[] args) {
        initMap(3, 3);
        printMap();
        while (true){
            humanTurn();
            printMap();
            if(checkWin(HUMAN_DOT)){
                System.out.println("Выиграл игрок");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(AI_DOT)){
                System.out.println("Выиграл компьютер");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        sc.close();
    }

    private static void initMap(int size_x, int size_y){
        field_size_y = size_y;
        field_size_x = size_x;
        field = new char[field_size_y][field_size_x];
        for (int i = 0; i < field_size_y; i++) {
            for (int j = 0; j < field_size_x; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printMap(){
        System.out.print("+ ");
        for (int i = 1; i <= field_size_x; i++)
        System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < field_size_y; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < field_size_x; j++)
                System.out.print(field[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do  {
            System.out.println("Введите координаты X и Y: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isValidCell(x, y) || isEmptyCell(x, y));
        field[y][x] = HUMAN_DOT;
    }

    private static void aiTurn(){
        int x, y;
        do  {
            x = rnd.nextInt(field_size_x);
            y = rnd.nextInt(field_size_y);
        } while (isEmptyCell(x, y));
        field[y][x] = AI_DOT;
    }

    private static boolean checkWin(char c){
        //Проверка горизонтальных линий
        if(field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if(field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if(field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
        //Проверка горизонтальных линий
        if(field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if(field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if(field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
        //Проверка диагональных линий
        if(field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if(field[2][0] == c && field[1][1] == c && field[0][2] == c) return true;

        return false;
    }

    private static boolean isMapFull(){
        for (int i = 0; i < field_size_y; i++) {
            for (int j = 0; j < field_size_x; j++) {
                if(field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    private static boolean isValidCell(int x, int y){
        return x >=0 && x < field_size_x && y >= 0 && y <= field_size_y;
    }

    private static boolean isEmptyCell(int x, int y){
        return field[y][x] != EMPTY_DOT;
    }

    private static boolean checkLine(int x, int y, int vx, int vy, int len, char c){
        return field[y][x] == EMPTY_DOT;
    }
}
