package ru.ssau.tk.cky4ajlkuh.labs3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mission1Test {

    @Test
    public void testOutStr() {
        String string = "Воздушно-Космические Войска";
        Mission1.outStr(string);
    }

    @Test
    public void testByteString(){
        String firstString = "Hello";
        String secondString = "Мир";
        Mission1.byteString(firstString);
        Mission1.byteString(secondString);
    }
}