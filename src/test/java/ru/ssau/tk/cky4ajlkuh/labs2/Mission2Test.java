package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission2Test {

    @Test
    public void testArray() {
        int[] firstArray = Mission2.array(5);
        assertEquals(firstArray.length, 5);
        assertEquals(firstArray[4], 2);
        assertEquals(firstArray[3], 1);
        assertEquals(firstArray[2], 1);
        assertEquals(firstArray[1], 1);
        assertEquals(firstArray[0], 2);
    }
}