package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission6Test {

    @Test
    public void testArray() {
        int[] pow = Mission6.array(4);
        assertEquals(pow[3], 9);
        assertEquals(pow[2], 4);
        assertEquals(pow[1], 1);
        assertEquals(pow[0], 0);
    }
}