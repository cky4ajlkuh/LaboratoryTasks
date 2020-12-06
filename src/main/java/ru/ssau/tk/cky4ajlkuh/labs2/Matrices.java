package ru.ssau.tk.cky4ajlkuh.labs2;

public class Matrices {

    static Matrix multiply(Matrix first, Matrix second) {
        Matrix matrixMultiply = new Matrix(first.getN(), second.getN());
        if (first.getN() != second.getN() && first.getM() != second.getM()) {
            return null;
        }
        for (int i = 0; i < first.getN(); i++) {
            for (int j = 0; j < first.getN(); j++) {
                for (int k = 0; k < first.getN(); k++) {
                    matrixMultiply.setAt(i, j, first.getAt(i, k) * second.getAt(k, j));
                }
            }
        }
        return matrixMultiply;
    }

    static Matrix plus(Matrix matrix1, Matrix matrix2) {
        Matrix matrixPlus = new Matrix(matrix1.getN(), matrix2.getN());
        if (matrix2.getN() != matrix1.getN() && matrix2.getM() != matrix1.getM()) {
            return null;
        }
        for (int i = 0; i < matrix2.getN(); i++) {
            for (int j = 0; j < matrix2.getM(); j++) {
                matrixPlus.setAt(i, j, matrix1.getAt(i, j) + matrix2.getAt(i, j));
            }
        }
        return matrixPlus;
    }

    static Matrix multiplyOnNumber(Matrix matrix, double number) {
        Matrix matrixMultiply = new Matrix(matrix.getN(), matrix.getM());
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); j++) {
                matrixMultiply.setAt(i, j, matrix.getAt(i, j) * number);
            }
        }
        return matrixMultiply;
    }

}
