package ru.ssau.tk.cky4ajlkuh.test4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {

    private final double DELTA = 0.0001;
    Operation identical = new IdenticalOperation();
    @Test
    public void testApply() {
        assertEquals(identical.apply(5000), 5000,DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN),Double.NaN,DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
    }
    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(10), 10, DELTA);
        assertEquals(identical.apply(Double.NaN),Double.NaN,DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
    }

}