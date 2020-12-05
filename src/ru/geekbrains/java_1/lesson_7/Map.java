package ru.geekbrains.java_1.lesson_7;

import javax.swing.*;
import java.awt.*;

class Map extends JPanel {

    static final int GAME_MODE_HUMAN_VS_AI = 0;
    static final int GAME_MODE_HUMAN_VS_HUMAN = 1;

    Map(){
        setBackground(Color.WHITE);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen){
        System.out.println("mode = " + mode + " fieldSizeX = " +
        fieldSizeX + " fieldSizeX = " + fieldSizeY + " winLen = " + winLen);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, 100, 100);
    }
}
