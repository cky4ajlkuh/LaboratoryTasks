package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {

    private final static Matrix matrix = new Matrix(3, 3);
    private final static Matrix matrix0 = new Matrix(1, 1);
    private final static Matrix matrix1 = new Matrix(10, 90);
    private final static Matrix matrix2 = new Matrix(3, 3);

    @Test
    public void testMultiply() {
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); j++) {
                matrix.setAt(i, j, j);
            }
        }
        for (int i = 0; i < matrix2.getN(); i++) {
            for (int j = 0; j < matrix2.getM(); j++) {
                matrix.setAt(i, j, i);
            }
        }
        assertEquals(Matrices.multiply(matrix, matrix2).getAt(1, 1), matrix.getAt(1, 1) * matrix2.getAt(1, 1), 0.01);
        assertEquals(Matrices.multiply(matrix, matrix2).getAt(1, 0), matrix.getAt(1, 0) * matrix2.getAt(1, 0), 0.01);
        assertEquals(Matrices.multiply(matrix, matrix2).getAt(2, 2), matrix.getAt(2, 2) * matrix2.getAt(2, 2), 0.01);
        Assert.assertThrows(IncompatibleDimensionsException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void testPlus() {
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); j++) {
                matrix.setAt(i, j, j);
            }
        }
        for (int i = 0; i < matrix2.getN(); i++) {
            for (int j = 0; j < matrix2.getM(); j++) {
                matrix.setAt(i, j, i);
            }
        }
        assertEquals(Matrices.plus(matrix, matrix2).getAt(0, 0), matrix.getAt(0, 0) + matrix2.getAt(0, 0), 0.01);
        assertEquals(Matrices.plus(matrix, matrix2).getAt(0, 1), matrix.getAt(0, 1) + matrix2.getAt(0, 1), 0.01);
        assertEquals(Matrices.plus(matrix, matrix2).getAt(2, 0), matrix.getAt(2, 0) + matrix2.getAt(2, 0), 0.01);
        Assert.assertThrows(IncompatibleDimensionsException.class, () -> Matrices.multiply(matrix1, matrix2));

    }

    @Test
    public void testMultiplyOnNumber() {
        matrix0.setAt(0, 0, 2);
        Matrix matrix;
        matrix = Matrices.multiplyOnNumber(matrix0, 2);
        assertEquals(Matrices.multiplyOnNumber(matrix0, 2).getAt(0, 0), matrix.getAt(0, 0));

        matrix0.setAt(0, 0, 3);
        Matrix matrix2;
        matrix2 = Matrices.multiplyOnNumber(matrix0, 3);
        assertEquals(Matrices.multiplyOnNumber(matrix0, 3).getAt(0, 0), matrix2.getAt(0, 0));

        matrix0.setAt(0, 0, 10);
        Matrix matrix3;
        matrix3 = Matrices.multiplyOnNumber(matrix0, 10);
        assertEquals(Matrices.multiplyOnNumber(matrix0, 10).getAt(0, 0), matrix3.getAt(0, 0));

    }
}