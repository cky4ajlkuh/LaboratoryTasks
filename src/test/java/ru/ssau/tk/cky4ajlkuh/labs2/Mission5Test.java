package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission5Test {

    @Test
    public void testArray() {
        int[] functionFib = Mission5.array(10);
        assertEquals(functionFib[4], 3);
        assertEquals(functionFib[5], 5);
        assertEquals(functionFib[6], 8);
        assertEquals(functionFib[7], 13);
    }
}