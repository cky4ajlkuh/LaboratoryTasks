package ru.ssau.tk.cky4ajlkuh.labs2;

public class Matrix {
    private final double[][] matrix;
    private final int m;
    private final int n;

    public Matrix(int n, int m) {
        matrix = new double[n][m];
        this.m = m;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public double getAt(int n, int m) {
        return matrix[n][m];
    }

    public void setAt(int n, int m, double number) {
        matrix[n][m] = number;
    }

}
