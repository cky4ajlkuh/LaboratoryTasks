package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission10Test {

    @Test
    public void testGeometric() {
        double[] geometric = Mission10.geometric(5,5,5);
        assertEquals(geometric[0],5,0.01);
        assertEquals(geometric[1],25,0.01);
        assertEquals(geometric[2], 125, 0.01);
        assertEquals(geometric[4], 3125, 0.01);
    }
}