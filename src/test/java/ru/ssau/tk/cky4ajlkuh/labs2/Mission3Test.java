package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission3Test {

    @Test
    public void testArray() {
        int[] array = Mission3.array(4);
        assertEquals(array[0], 1);
        assertEquals(array[1], 3);
        assertEquals(array[2], 5);
        assertEquals(array[3], 7);
    }
}