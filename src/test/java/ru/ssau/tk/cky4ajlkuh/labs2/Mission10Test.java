package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.cky4ajlkuh.labs4.Practice;

import java.util.Arrays;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class Mission10Test {

    @Test
    public void testArrayHalf() {
        assertEquals(Mission10.arrayHalf(5), new int[]{1, 2, 3, 2, 1});
        assertEquals(Mission10.arrayHalf(6), new int[]{1, 2, 3, 3, 2, 1});
        assertEquals(Mission10.arrayHalf(7), new int[]{1, 2, 3, 4, 3, 2, 1});
    }

    @Test
    public void testGetArray() {
        assertEquals(Mission10.getArray(3), new double[][]{{1, 2, 3}, {4, 5}, {6}});
        assertEquals(Mission10.getArray(2), new double[][]{{1, 2}, {3}});
        assertEquals(Mission10.getArray(4), new double[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10}});
    }

    @Test
    public void testCheckNullAndSort() {
        Object[] array = new Object[]{10., 30., 20., 40., 60., 50., 70.};
        Object[] arrayIsSorted = new Object[]{10., 20., 30., 40., 50., 60., 70.};
        Mission10.checkNullAndSort(array);
        boolean b = Arrays.equals(array, arrayIsSorted);
        assertTrue(b);
        Object[] array1 = new Object[]{1., 2., 4., 6., null, 10., 12., 14., 16};
        Assert.assertThrows(NullPointerException.class, () -> Mission10.checkNullAndSort(array1));
    }

    @Test
    public void testGeometric() {
        double[] geometric = Mission10.geometric(5, 5, 5);
        assertEquals(geometric[0], 5, 0.01);
        assertEquals(geometric[1], 25, 0.01);
        assertEquals(geometric[2], 125, 0.01);
        assertEquals(geometric[4], 3125, 0.01);
    }

    @Test
    public void testDivider() {
        double[] divider = Mission10.divider(18);
        assertEquals(divider[0], 1);
        assertEquals(divider[1], 2);
        assertEquals(divider[2], 3);
        assertEquals(divider[4], 0);
    }

    @Test
    public void testOppositeArray() {
        double[] array = new double[]{-1., 1., 2., 3., 4., 10.};
        Mission10.oppositeArray(array);
        assertEquals(array[0], 1);
        assertEquals(array[5], -10);
        assertEquals(array[1], -1);
    }

    @Test
    public void testCheckAvailability() {
        double[] array = new double[]{10., 20., 30., 5., 0., 0.1, -3.};
        assertTrue(Mission10.checkAvailability(10., array));
        assertFalse(Mission10.checkAvailability(-4., array));
        assertNotEquals(Mission10.checkAvailability(-100., array), true);
    }

    @Test
    public void testCheckNull() {
        Integer[] firstArray = new Integer[]{null, 10, 5, -3, 15};
        Integer[] secondArray = new Integer[]{4, 3, 2, 1, -64};
        assertFalse(Mission10.checkNull(secondArray));
        assertTrue(Mission10.checkNull(firstArray));
    }

    @Test
    public void testEvenNumber() {
        double[] array = new double[]{10., 20., 30., 40., 50., 1.};
        double[] arraySecond = new double[10];
        double[] arrayThird = new double[]{1., 2., 3., 4., 5., 6., 7., 8.};
        for (int i = 0; i < 10; i++) {
            arraySecond[i] = i * 3;
        }
        assertEquals(Mission10.evenNumber(array), 5, 0.001);
        assertEquals(Mission10.evenNumber(arraySecond), 5, 0.001);
        assertEquals(Mission10.evenNumber(arrayThird), 4, 0.001);
    }

    @Test
    public void testMaxNumber() {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i * 3;
        }
        assertEquals(Mission10.maxNumber(new int[]{}), null);
        assertEquals(Mission10.maxNumber(array), 57, 0.001);
    }

    @Test
    public void testSumNumber() {
        double[] array = new double[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i * 2;
        }
        assertEquals(Mission10.sumNumber(array), 180, 0.001);
        assertEquals(Mission10.sumNumber(new double[]{1., 2., 3.,}), 4, 0.001);
    }

    @Test
    public void testComparisonOfDivision() {
        double[] array1 = new double[]{1., 2., 4., 6., 8., 10., 12., 14., 16};
        double[] array2 = new double[]{10., 20., 30., 40., 50., 3., 1.};
        assertTrue(Mission10.comparisonOfDivision(array1));
        assertFalse(Mission10.comparisonOfDivision(array2));

    }

    @Test
    public void testSearchElement() {
        assertEquals(Mission10.searchElement(new double[]{10., 20., 30., 40., 50., 60., 70.}, 30), 2, 0.001);
        assertEquals(Mission10.searchElement(new double[]{-5, -10, 14, 23, 654, 345, 667, 86, 8, 41}, 86), 7, 0.001);
    }

    @Test
    public void testReplayElements() {
        int[] array = new int[]{1, 2, 4, 6, 8, 10, 12, 14, 16};
        Mission10.replayElements(array);
        assertEquals(array[0], 16);
        assertEquals(array[8], 1);
    }

    @Test
    public void testBitwiseNegation() {
        int[] array = new int[]{1, 2, 4, 6, 8, 10, 12, 14, 16};
        Mission10.bitwiseNegation(array);
        assertEquals(array[0], -2, 0.01);
        assertEquals(array[1], -3, 0.01);
        assertEquals(array[2], -5, 0.01);
        Mission10.bitwiseNegation(array);
        assertEquals(array[0], 1, 0.001);
        assertEquals(array[1], 2, 0.001);
        assertEquals(array[2], 4, 0.001);
    }

    @Test
    public void testTrueArray() {
        int[] array = new int[]{1, 2, 4, 6, 8, 10, 12, 14, 16, 17, 18, 19, 21};
        boolean[] array2 = Mission10.trueArray(array);
        assertFalse(array2[0]);
        assertTrue(array2[2]);
        assertFalse(array2[12]);
    }

    @Test
    public void testMultiplyArray() {
        double[] array = new double[]{0., 1., 2., 3., 0. / 0., 5.};
        double[] array2 = new double[]{0., 1., 2., 3., Double.POSITIVE_INFINITY, 5.};
        double[] array3 = new double[]{0., 1., 2., 3., 4., 5.};
        assertEquals(Mission10.multiplyArray(array), 30, 0.01);
        assertEquals(Mission10.multiplyArray(array2), 30, 0.01);
        assertEquals(Mission10.multiplyArray(array3), 120, 0.01);
    }

}