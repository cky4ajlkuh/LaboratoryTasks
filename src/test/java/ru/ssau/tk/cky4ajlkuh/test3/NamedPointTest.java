package ru.ssau.tk.cky4ajlkuh.test3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    NamedPoint first = new NamedPoint(5,5,5, "Bugagashen'ka");
    NamedPoint second = new NamedPoint(10,9,7);
    NamedPoint third = new NamedPoint(41.,51.,8937.,"Polly");

    @Test
    public void testSetName() {
        first.setName("Theory");
        second.setName("big");
        third.setName("bang");
        assertEquals(second.getName(), "big");
        assertEquals(third.getName(), "bang");
        assertEquals(first.getName(), "Theory");
    }

    @Test
    public void testGetName() {
        assertEquals(first.getName(), "Bugagashen'ka");
        assertNull(second.getName());
        assertEquals(third.getName(), "Polly");
    }
}