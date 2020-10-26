package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
}