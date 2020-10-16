package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission4Test {

    @Test
    public void testArray() {
        int[] array = Mission4.array(7);
        assertEquals(array[0], 14);
        assertEquals(array[6], 2);
        assertEquals(array[3],8);
    }
}