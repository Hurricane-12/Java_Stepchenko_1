package ru.geekbrains.java_1.lesson_7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StartNewGameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 230;
    private static final int ROWS_COUNT = 10;
    private static final int COLS_COUNT = 1;
    private static final int MIN_WIN_LEN = 2;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    private final String FIELD_SIZE_PREFIX = "Field size: ";
    private final String WIN_LEN_PREFIX = "Win_len: ";

    private final GameWindow gameWindow;
    private JRadioButton rbHumanVsAI;
    private JRadioButton rbHumanVsHuman;
    private JSlider sliderFieldSize;
    private JSlider sliderWinLen;

    StartNewGameWindow(GameWindow gameWindow){
        this.gameWindow = gameWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = gameWindow.getBounds();
        final int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;
        final int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Создание новой игры");
        setLayout(new GridLayout(ROWS_COUNT, COLS_COUNT));
        addGameModeControls();
        addFieldAndWindowLengthControls();
        JButton btnStartGame = new JButton("Начать игру");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onPressStartButton();
            }
        });
        add(btnStartGame);
    }

    private void addGameModeControls(){
        add(new JLabel("Выберите режим игры:"));
        rbHumanVsAI = new JRadioButton("Игрок против компьютера", true);
        rbHumanVsHuman = new JRadioButton("Игрок против игрока");
        ButtonGroup bgGameMode = new ButtonGroup();
        bgGameMode.add(rbHumanVsAI);
        bgGameMode.add(rbHumanVsHuman);
        add(rbHumanVsAI);
        add(rbHumanVsHuman);
    }

    private void addFieldAndWindowLengthControls(){
        JLabel labelWinLen = new JLabel(WIN_LEN_PREFIX + MIN_WIN_LEN);
        sliderWinLen = new JSlider(MIN_WIN_LEN, MIN_FIELD_SIZE, MIN_WIN_LEN);
        sliderWinLen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLen.setText(WIN_LEN_PREFIX + sliderWinLen.getValue());
            }
        });

        JLabel labelFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int fieldSize = sliderFieldSize.getValue();
                labelFieldSize.setText(FIELD_SIZE_PREFIX + fieldSize);
                sliderWinLen.setMaximum(fieldSize);
            }
        });

        add(new JLabel("Выберите размер поля:"));
        add(labelFieldSize);
        add(sliderFieldSize);
        add(new JLabel("Выберите длину выигрышной последовательности:"));
        add(labelWinLen);
        add(sliderWinLen);
    }

    private void onPressStartButton(){
        int mode;
        if(rbHumanVsAI.isSelected()){
            mode = Map.GAME_MODE_HUMAN_VS_AI;
        } else if(rbHumanVsHuman.isSelected()){
            mode = Map.GAME_MODE_HUMAN_VS_HUMAN;
        } else {
            throw new RuntimeException("Неизвестный RadioButton");
        }
        setVisible(false);
        int fieldSize = sliderFieldSize.getValue();
        gameWindow.startNewGame(mode, fieldSize, fieldSize, sliderWinLen.getValue());
    }
}
