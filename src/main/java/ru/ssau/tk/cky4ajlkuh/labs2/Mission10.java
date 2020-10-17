package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission10 {
    public static double[] geometric(int size, int first, int denominator) {
        double[] geometric = new double[size];
        geometric[0]= first;
        for (int i = 1; i < geometric.length; i++) {
            geometric[i] = geometric[i-1]*denominator;
        }
        return geometric;
    }
}
