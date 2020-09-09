package ru.ssau.tk.cky4ajlkuh.test2;

public class ClassCall {

    public static void main(String[] args) {
        ClassPoint red = new ClassPoint(255, 0, 0);
        ClassPoint blue = new ClassPoint(0, 0, 255);
        ClassPoint green = new ClassPoint(0, 255, 0);
        red.points();
        blue.points();
        green.points();
    }
}
