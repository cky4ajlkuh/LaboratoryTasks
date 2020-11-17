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
    public void testCheckEntry() {
        assertEquals(Mission1.checkEntry("Дома", "Доктор"), -1);
        assertEquals(Mission1.checkEntry("Три топора", "пора"), 6);
        assertEquals(Mission1.checkEntry("Давай", "ай"), 3);
    }

    @Test
    public void testNewArrayString() {
        String[] array1 = new String[]{"Казаков", "Никита", "Николаевич", "16", "09", "2001"};
        String[] array2 = new String[]{"Голод", "Горный", "Город", "Жигулевск"};
        String[] array3 = new String[]{"Владимир", "Владимир", "Владимир"};

        assertEquals(Mission1.newArrayString(array3, "Вл", "мир"), 3);
        assertEquals(Mission1.newArrayString(array2, "Г", "од"), 2);
        assertEquals(Mission1.newArrayString(array1, "Ник", "6"), 0);
    }

    @Test
    public void testUnification() {
        String[] array = new String[]{"каждый охотник", "желает знать", "где"};
        String[] array2 = new String[]{"каждый охотник", "желает знать", "где?"};
        String[] array1 = new String[]{"жил да был", "помним любим скорбим"};
        assertEquals(Mission1.unification(array), "каждый охотник, желает знать, где");
        assertEquals(Mission1.unification(array2),"каждый охотник, желает знать, где?");
        assertEquals(Mission1.unification(array1), "жил да был, помним любим скорбим");
    }
}