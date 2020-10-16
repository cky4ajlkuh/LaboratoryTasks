package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission7Test {

    @Test
    public void testQuadraticEquation() {
        assertEquals(Mission7.quadraticEquation(9,0,-4), new double[]{-0.666,0.666}, 0.001);
        assertEquals(Mission7.quadraticEquation(1,2,1), new double[]{-1}, 0.001);
        assertEquals(Mission7.quadraticEquation(0,5,10), new double[]{-2}, 0.001);
        assertEquals(Mission7.quadraticEquation(3,9,0), new double[]{-3,0}, 0.001);
    }
}