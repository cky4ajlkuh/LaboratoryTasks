package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class Mission10Test {

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
    public void comparisonOfDivision() {
        double[] array1 = new double[]{1., 2., 4., 6., 8., 10., 12., 14., 16};
        double[] array2 = new double[]{10., 20., 30., 40., 50., 3., 1.};
        assertTrue(Mission10.comparisonOfDivision(array1));
        assertFalse(Mission10.comparisonOfDivision(array2));

    }

    @Test
    public void searchElement() {
        assertEquals(Mission10.searchElement(new double[]{10., 20., 30., 40., 50., 60., 70.,}, 30), 2, 0.001);
        assertEquals(Mission10.searchElement(new double[]{-5, -10, 14, 23, 654, 345, 667, 86, 8, 41}, 86), 7, 0.001);
    }

    @Test
    public void replayElements(){
        int[] array = new int[]{1, 2, 4, 6, 8, 10, 12, 14, 16};
        Mission10.replayElements(array);
        assertEquals(array[0], 16);
        assertEquals(array[8],1);
    }
}