package ru.ssau.tk.cky4ajlkuh.test4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {

    Operation tangent = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tangent.apply(0), 0, 0.0001);
        assertEquals(tangent.apply(Double.POSITIVE_INFINITY), Double.NaN, 0.0001);
        assertEquals(tangent.apply(Double.NaN), Double.NaN, 0.0001);
        assertEquals(tangent.apply(Double.NEGATIVE_INFINITY), Double.NaN, 0.0001);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tangent.applyTriple(0), 0, 0.001);
        assertEquals(tangent.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, 0.001);
        assertEquals(tangent.applyTriple(Double.NaN), Double.NaN, 0.001);
        assertEquals(tangent.apply(Double.NEGATIVE_INFINITY), Double.NaN, 0.0001);
    }
}