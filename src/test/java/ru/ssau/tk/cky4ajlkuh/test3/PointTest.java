package ru.ssau.tk.cky4ajlkuh.test3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {


    private final static Point point = new Point(1.0, 2.0, 3.0);
    private final static Point point1 = new Point(4.0, 5.0, 6.0);
    private final static Point point2 = new Point(7.0, 8.0, 9.0);

    @Test
    public void testToString() {
        assertEquals(point.toString(), "1.0 2.0 3.0");
        assertEquals(point1.toString(), "4.0 5.0 6.0");
        assertEquals(point2.toString(), "7.0 8.0 9.0");

    }

    @Test
    public void testGetX() {
        assertEquals(point.getX(), 1, 0.01);
        assertEquals(point1.getX(), 4, 0.01);
        assertEquals(point2.getX(), 7, 0.01);
    }

    @Test
    public void testGetY() {
        assertEquals(point.getY(), 2, 0.01);
        assertEquals(point1.getY(), 5, 0.01);
        assertEquals(point2.getY(), 8, 0.01);
    }

    @Test
    public void testGetZ() {
        assertEquals(point.getZ(), 3, 0.01);
        assertEquals(point1.getZ(), 6, 0.01);
        assertEquals(point2.getZ(), 9, 0.01);
    }

    @Test
    public void testLength() {
        assertEquals(point.length(),3.741,0.01);
        assertEquals(point1.length(), 8.774, 0.01);
        assertEquals(point2.length(), 13.928, 0.01);
    }
}