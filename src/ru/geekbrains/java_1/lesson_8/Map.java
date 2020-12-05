package ru.geekbrains.java_1.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Map extends JPanel {

    static final int GAME_MODE_HUMAN_VS_AI = 0;
    static final int GAME_MODE_HUMAN_VS_HUMAN = 1;

    Map(){
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    private void update(MouseEvent e){
        repaint();
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen){
        System.out.println("mode = " + mode + " fieldSizeX = " +
        fieldSizeX + " fieldSizeX = " + fieldSizeY + " winLen = " + winLen);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g){

    }
}
