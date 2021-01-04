package ru.ssau.tk.cky4ajlkuh.labs4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.cky4ajlkuh.test3.Person;

import java.io.*;

import static org.testng.Assert.*;

public class PracticeTest {

    @Test
    public void testSerializationPerson() {
        Person person = new Person("Anton", "Frolov");
        String str = "";
        Assert.assertThrows(FileNotFoundException.class, () -> Practice.serializationPerson(new ObjectOutputStream(new FileOutputStream(str)), person));
        Assert.assertThrows(ClassCastException.class, () -> Practice.serializationPerson(new ByteArrayOutputStream(), person));
    }

    @Test
    public void testGetNamePerson() {

        Person person = new Person("Мягкий", "Кинотеатр");
        Person person1 = new Person(null, null);
        Person person2 = new Person(null, "Ford");
        Person person3 = new Person("56", null);
        assertEquals(Practice.getNamePerson(person), "Мягкий Кинотеатр");
        Assert.assertThrows(NullPointerException.class, () -> Practice.getNamePerson(person1));
        Assert.assertThrows(NullPointerException.class, () -> Practice.getNamePerson(person2));
        Assert.assertThrows(NullPointerException.class, () -> Practice.getNamePerson(person3));

    }

    @Test
    public void testGetArrayChars() {
        String[] strings = new String[]{"bird", "Mood", "Versions", "Premier"};

        String[] strings2 = new String[]{null, "Mood", "Versions", "Pro"};

        String[] strings3 = new String[]{"Big", "Theory", "Bang", "Pepe"};

        assertEquals(Practice.getArrayChars(strings, 2), new String[]{"r", "o", "r", "e"});
        Assert.assertThrows(NullPointerException.class, () ->
                Practice.getArrayChars(strings2, 2));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () ->
                Practice.getArrayChars(strings3, 4));

    }

    @Test
    public void testDivisionStr() {
        assertEquals(Practice.divisionStr("2", "1"), 2, 0.001);
        assertEquals(Practice.divisionStr("6", "2"), 3, 0.001);
        Assert.assertThrows(NumberFormatException.class, () -> Practice.divisionStr("K", "2"));
        Assert.assertThrows(NullPointerException.class, () -> Practice.divisionStr(null, "2"));
        Assert.assertThrows(ArithmeticException.class, () -> Practice.divisionStr("1", "0"));
        Assert.assertThrows(NumberFormatException.class, () -> Practice.divisionStr("2", "l"));
        Assert.assertThrows(NumberFormatException.class, () -> Practice.divisionStr("2", "l"));

    }

}
