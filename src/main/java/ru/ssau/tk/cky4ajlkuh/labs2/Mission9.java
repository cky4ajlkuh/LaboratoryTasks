package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission9 {
    public static double[] progression(int size, int first, int difference) {
        double[] progression = new double[size];
        for (int i = 0; i != progression.length; i++) {
            progression[i] = first + i * difference;
        }
        return progression;
    }
}
