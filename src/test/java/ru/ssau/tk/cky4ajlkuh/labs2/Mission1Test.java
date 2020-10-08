package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission1Test {

    @Test
    public void testDimension() {
       int[] firstArray = Mission1.dimension(10);
       int[] secondArray = Mission1.dimension(2);
       int[] thirdArray = Mission1.dimension(15);
       assertEquals(firstArray.length, 10, 0.0001);
       assertEquals(secondArray.length,2, 0.0001);
       assertEquals(thirdArray.length,15, 0.0001);
    }
}