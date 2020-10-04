package ru.ssau.tk.cky4ajlkuh.test4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {

    private final double DELTA = 0.0001;
    Operation sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(10000),100, DELTA);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrt.apply(Double.NaN), Double.NaN, DELTA);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(100000000), 10, DELTA);
        assertNotEquals(sqrt.apply(99999), 33333, DELTA);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqrt.apply(Double.NaN), Double.NaN, DELTA);
    }
}