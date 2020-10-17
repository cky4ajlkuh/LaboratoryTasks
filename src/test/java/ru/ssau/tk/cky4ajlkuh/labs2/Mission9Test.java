package ru.ssau.tk.cky4ajlkuh.labs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission9Test {

    @Test
    public void testProgression() {
    double[] progression = Mission9.progression(3,1,10);
    assertEquals(progression[0], 1, 0.01);
    assertEquals(progression[1], 11, 0.01);
    assertEquals(progression[2], 21, 0.01);
    }
}