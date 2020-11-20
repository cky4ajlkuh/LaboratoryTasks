package ru.ssau.tk.cky4ajlkuh.labs4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.cky4ajlkuh.test3.Person;

import static org.testng.Assert.*;

public class PracticeTest {

    @Test
    public void testGetNamePerson() {

        Person person = new Person("Мягкий", "Кинотеатр");
        Person person1 = new Person(null, null);
        Person person2 = new Person(null, "Ford");
        Person person3 = new Person("56", null);
        assertEquals(Practice.getNamePerson(person), "Мягкий Кинотеатр");
        Assert.assertThrows(NullPointerException.class, () -> {
            Practice.getNamePerson(person1);
        });
        Assert.assertThrows(NullPointerException.class, () -> {
            Practice.getNamePerson(person2);
        });
        Assert.assertThrows(NullPointerException.class, () -> {
            Practice.getNamePerson(person3);
        });
    }
}