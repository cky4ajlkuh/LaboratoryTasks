package ru.ssau.tk.cky4ajlkuh.labs2;

public class Matrices {

    static Matrix multiply(Matrix first, Matrix second) throws IncompatibleDimensionsException {
        Matrix matrixMultiply = new Matrix(first.getN(), second.getN());
        if (first.getN() != second.getN()) {
            throw new IncompatibleDimensionsException("Кол-во строк различно!");
        }
        if (first.getM() != second.getM()) {
            throw new IncompatibleDimensionsException("Кол-во столбцов различно!");
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

    static Matrix plus(Matrix matrix1, Matrix matrix2) throws IncompatibleDimensionsException {
        Matrix matrixPlus = new Matrix(matrix1.getN(), matrix2.getN());
        if (matrix1.getN() != matrix2.getN()) {
            throw new IncompatibleDimensionsException("Кол-во строк различно!");
        }
        if (matrix1.getM() != matrix2.getM()) {
            throw new IncompatibleDimensionsException("Кол-во столбцов различно!");
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
