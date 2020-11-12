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
    public void testByteString() {
        String firstString = "Hello";
        String secondString = "Мир";
        Mission1.byteString(firstString);
        Mission1.byteString(secondString);
    }

    @Test
    public void testComparisonString() {
        Mission1.comparisonString();
// в первом случае получается false, т.к. "==" сравнивает ссылки данных объектов
// во втором случает получается true, т.к. метод сравнивает значения данных объектов
    }

    @Test
    public void testPalindromeString() {
        String str = "мадам";
        String string = "казак";
        String str2 = "Дед";
        assertTrue(Mission1.palindromeString(str));
        assertTrue(Mission1.palindromeString(string));
        assertFalse(Mission1.palindromeString(str2));
    }

    @Test
    public void testComparisonIgnoredCaseString() {
        String str = "Hello";
        String str2 = "hello";
        String str3 = "world";
        String str4 = "!";
        assertFalse(Mission1.comparisonIgnoredCaseString(str3, str4));
        assertTrue(Mission1.comparisonIgnoredCaseString(str, str2));
        assertTrue(Mission1.comparisonIgnoredCaseString("Никита Казаков", "никита казаков"));
    }

    @Test
    public void testCheckEntry(){
        assertEquals(Mission1.checkEntry("Дома", "Доктор"), -1);
        assertEquals(Mission1.checkEntry("Три топора", "пора"), 6);
        assertEquals(Mission1.checkEntry("Давай", "ай"), 3);
    }
}