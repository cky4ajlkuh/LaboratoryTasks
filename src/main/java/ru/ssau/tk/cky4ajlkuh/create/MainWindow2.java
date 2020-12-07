package ru.ssau.tk.cky4ajlkuh.create;

import javax.swing.*;

public class MainWindow2 {

    public static void main(String[] args) {
        Body body = new Body("calculator");
        body.setVisible(true);
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        body.setResizable(false);
        body.setLocationRelativeTo(null);
    }
}
