package ru.geekbrains.java_1.lesson_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int POS_X = 800;
    private static final int POS_Y = 300;

    private final Map map;

    GameWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Крестики-нолики");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(POS_X, POS_Y);
        setResizable(false);
        StartNewGameWindow startNewGameWindow = new StartNewGameWindow(this);
        JButton btnNewGame = new JButton("Новая игра");
        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);
            }
        });
        JButton btnExitGame = new JButton("Выход");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));
        bottomPanel.add(btnNewGame);
        bottomPanel.add(btnExitGame);

        map = new Map();
        add(map, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        setVisible(true);
        startNewGameWindow.setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen){
        map.startNewGame(mode, fieldSizeX, fieldSizeY, winLen);
    }
}
