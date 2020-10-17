package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission8Test {

    @Test
    public void testIntegers() {
        double[] integer = Mission8.integers(10);
        assertEquals(integer[0], 1);
        assertEquals(integer[1], 2);
        assertEquals(integer[2], 4);
        assertEquals(integer[3], 5);
        assertEquals(integer[4],7);
    }
}