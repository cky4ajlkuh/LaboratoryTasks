package ru.ssau.tk.cky4ajlkuh.test3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    NamedPoint first = new NamedPoint(5,5,5, "Bugagashen'ka");
    NamedPoint second = new NamedPoint(10,9,7);
    NamedPoint third = new NamedPoint(41.,51.,8937.,"Polly");
    NamedPoint fourth = new NamedPoint(1.,1.,1., null);

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
    @Test
    public void  testReset(){
        first.reset();
        second.reset();
        assertEquals(first.getName(), "Absent");
        assertEquals(second.getName(), "Absent");
    }

    @Test
    public void  testToString(){
        assertEquals(first.toString(), "Bugagashen'ka 5.0 5.0 5.0");
        assertEquals(fourth.toString(), "1.0 1.0 1.0");

    }
}