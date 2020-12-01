package ru.ssau.tk.cky4ajlkuh.create;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestingPanel extends JFrame {
    private JButton jButton = new JButton("Press F");

    public TestingPanel() {
        super("Getting respect");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 5, 5, 5));
        jButton.addActionListener(new JButtonListener());
        container.add(jButton);
    }

    static class JButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String sms;
            sms = "take your respect :)";
            JOptionPane.showMessageDialog(null, sms);
        }
    }
}

class Main {

    public static void main(String[] args) {
        TestingPanel test = new TestingPanel();
        test.setVisible(true);
    }

}
