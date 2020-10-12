package ru.ssau.tk.cky4ajlkuh.test5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    IntGeneratorImpl generator = new IntGeneratorImpl();
    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(),0, 0.001);
        assertEquals(generator.nextInt(),1, 0.001);
        assertEquals(generator.nextInt(),2, 0.001);
    }
}