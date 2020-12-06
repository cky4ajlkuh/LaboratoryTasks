package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    private final static Matrix matrix = new Matrix(3, 4);

    @Test
    public void testGetN() {
        Matrix matrix = new Matrix(3, 3);
        assertEquals(matrix.getN(), 3, 0.01);

        Matrix matrix2 = new Matrix(100, 4);
        assertEquals(matrix2.getN(), 100, 0.01);

        Matrix matrix3 = new Matrix(0, 4);
        assertEquals(matrix3.getN(), 0, 0.01);
    }

    @Test
    public void testGetM() {
        Matrix matrix = new Matrix(3, 4);
        assertEquals(matrix.getM(), 4, 0.01);

        Matrix matrix2 = new Matrix(3, 2);
        assertEquals(matrix2.getM(), 2, 0.01);

        Matrix matrix3 = new Matrix(3, 1);
        assertEquals(matrix3.getM(), 1, 0.01);

    }

    @Test
    public void testGetAt() {
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); j++) {
                matrix.setAt(i, j, j);
            }
        }
        assertEquals(matrix.getAt(1, 1), 1, 0.01);
        assertEquals(matrix.getAt(0, 3), 3, 0.01);
        assertEquals(matrix.getAt(2, 3), 3, 0.01);
    }

    @Test
    public void testSetAt() {
        matrix.setAt(1, 1, 1000);
        matrix.setAt(2, 2, 1010);
        matrix.setAt(1, 2, 111);

        assertEquals(matrix.getAt(1, 1), 1000, 0.01);
        assertEquals(matrix.getAt(2, 2), 1010, 0.01);
        assertEquals(matrix.getAt(1, 2), 111, 0.01);

    }
}