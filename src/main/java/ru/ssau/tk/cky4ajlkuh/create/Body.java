package ru.ssau.tk.cky4ajlkuh.create;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Body extends JFrame {
    JButton jButton1 = new JButton("Очистить");
    JButton jButtonPlus = new JButton(" + ");
    JButton jButtonMinus = new JButton(" - ");
    JButton jButtonDivider = new JButton(" / ");
    JButton jButtonMultiply = new JButton(" * ");
    JLabel label = new JLabel("Введите первое число: ");
    JLabel label1 = new JLabel("Введите второе число: ");
    JLabel label2 = new JLabel("");
    JLabel label3 = new JLabel("");
    JLabel label0 = new JLabel("Ваше число: ");
    JTextField textField = new JTextField(5);
    JTextField textField1 = new JTextField(5);
    JTextField textField0 = new JTextField(5);
    private double i;
    private double k;
    String string;
    Listener listener = new Listener();

    public Body(String s) {
        super(s);
        add(label);
        add(label1);
        add(label2);
        add(label3);
        add(label0);
        jButtonMinus.addActionListener(listener);
        jButtonMultiply.addActionListener(listener);
        jButtonPlus.addActionListener(listener);
        jButtonDivider.addActionListener(listener);
        jButton1.addActionListener(listener);
        setSize(400, 400);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)

                .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPlus)
                        .addComponent(jButtonDivider)
                        .addComponent(jButtonMinus)
                        .addComponent(jButtonMultiply))

                .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addComponent(textField))

                .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addComponent(textField1))

                .addGroup(layout.createSequentialGroup()
                        .addComponent(label0)
                        .addComponent(textField0))
                .addComponent(jButton1));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonPlus)
                        .addComponent(jButtonDivider)
                        .addComponent(jButtonMinus)
                        .addComponent(jButtonMultiply))
                .addGroup(layout.createParallelGroup()
                        .addComponent(label)
                        .addComponent(textField))
                .addGroup(layout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(textField1))
                .addGroup(layout.createParallelGroup()
                        .addComponent(label0)
                        .addComponent(textField0))
                .addComponent(jButton1)
        );

    }


    public class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == jButtonMultiply) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    double j = i * k;
                    string = "" + j;
                    textField0.setBackground(Color.GRAY);
                    textField0.setText(string);
                }
                if (e.getSource() == jButtonDivider) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    double j = i / k;
                    string = "" + j;
                    textField0.setBackground(Color.BLUE);
                    textField0.setText(string);
                }
                if (e.getSource() == jButtonMinus) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    double j = i - k;
                    string = "" + j;
                    textField0.setBackground(Color.YELLOW);
                    textField0.setText(string);
                }
                if (e.getSource() == jButtonPlus) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    double j = i + k;
                    string = "" + j;
                    textField0.setBackground(Color.CYAN);
                    textField0.setText(string);
                }
                if (e.getSource() == jButton1) {
                    textField.setText(null);
                    textField1.setText(null);
                    textField0.setText(null);
                    textField0.setBackground(Color.WHITE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите число!");
            }
        }
    }
}
