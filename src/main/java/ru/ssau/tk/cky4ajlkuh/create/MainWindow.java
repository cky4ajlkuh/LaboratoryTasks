package ru.ssau.tk.cky4ajlkuh.create;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
