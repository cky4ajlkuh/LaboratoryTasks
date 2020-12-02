package ru.ssau.tk.cky4ajlkuh.create;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestingPanel extends JFrame {
    private final static JButton jButton = new JButton("Press F");

    public TestingPanel() {
        super("Getting respect");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 5, 5, 5));
        jButton.addActionListener(new JButtonListener());
        jButton.addKeyListener(new KeyListener());
        container.add(jButton);
    }

    static class KeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_F) {
                TestingPanel.outMessage();
            }
        }
    }

    public static void outMessage() {
        String sms;
        sms = "take your respect :)";
        JOptionPane.showMessageDialog(null, sms);

    }

    static class JButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            TestingPanel.outMessage();
        }
    }
}

class Main {

    public static void main(String[] args) {
        TestingPanel test = new TestingPanel();
        test.setVisible(true);
    }

}
