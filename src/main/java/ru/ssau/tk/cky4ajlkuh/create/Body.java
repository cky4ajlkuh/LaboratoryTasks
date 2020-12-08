package ru.ssau.tk.cky4ajlkuh.create;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
    ListenerMouse listenerMouse = new ListenerMouse();
    JComboBox<String> comboBox = new JComboBox<>(new String[]{" ", "Процент", "Корень"});
    ListenerComboBox listenerComboBox = new ListenerComboBox();

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
        textField0.addMouseListener(listenerMouse);
        textField.addMouseListener(listenerMouse);
        textField1.addMouseListener(listenerMouse);
        setSize(400, 400);
        comboBox.addItemListener(listenerComboBox);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)

                .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPlus)
                        .addComponent(jButtonDivider)
                        .addComponent(jButtonMinus)
                        .addComponent(jButtonMultiply)
                        .addComponent(comboBox))

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
                        .addComponent(jButtonMultiply)
                        .addComponent(comboBox))
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

    public class ListenerComboBox implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                if (e.getItem() == "Процент") {
                    checkText();
                    i = Double.parseDouble(textField.getText());
                    string = i / 100 + "%";
                    textField0.setBackground(Color.GRAY);
                    textField0.setText(string);
                    textField1.setEditable(false);
                }
                if (e.getItem() == "Корень") {
                    checkText();
                    i = Double.parseDouble(textField.getText());
                    string = Math.sqrt(i) + "";
                    textField0.setBackground(Color.WHITE);
                    textField0.setText(string);
                    textField1.setEditable(false);
                }

                if (e.getItem() != "Процент" & e.getItem() != "Корень") {
                    textField1.setEditable(true);
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Вводите нормально числа!");
            }

        }
    }

    public class ListenerMouse implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == textField0) {
                textField0.setEditable(false);
            }
            if (e.getSource() == textField1) {
                textField0.setEditable(true);
            }
            if (e.getSource() == textField) {
                textField0.setEditable(true);
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private void checkNull() {
        if (i != 0 && k == 0) {
            JOptionPane.showMessageDialog(null, "На ноль делить нельзя!");
            throw new ArithmeticException();
        }
    }

    private void checkText() {
        String str = textField.getText();
        String str1 = textField1.getText();
        for (int i = 0; i < str.length(); i++) {
            for (int j = -9; j < 10; j++) {
                if (str.charAt(i) == j) {
                    throw new ArithmeticException();
                }
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            for (int j = -9; j < 10; j++) {
                if (str1.charAt(i) == j) {
                    throw new ArithmeticException();
                }
            }
        }
    }

    public class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == jButtonMultiply) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    checkText();
                    double j = i * k;
                    string = "" + j;
                    textField0.setBackground(Color.GRAY);
                    textField0.setText(string);
                }
                if (e.getSource() == jButtonDivider) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    checkText();
                    checkNull();
                    double j = i / k;
                    string = "" + j;
                    textField0.setBackground(Color.BLUE);
                    textField0.setText(string);
                }
                if (e.getSource() == jButtonMinus) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    checkText();
                    double j = i - k;
                    string = "" + j;
                    textField0.setBackground(Color.YELLOW);
                    textField0.setText(string);
                }
                if (e.getSource() == jButtonPlus) {
                    i = Double.parseDouble(textField.getText());
                    k = Double.parseDouble(textField1.getText());
                    checkText();
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
                JOptionPane.showMessageDialog(null, "Вводите нормально числа!");
            }
        }
    }
}
