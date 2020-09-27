package ru.ssau.tk.cky4ajlkuh.test3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person secondPerson = new Person();
    Person firstPerson = new Person();
    Person thirdPerson = new Person();
    Person person = new Person();

    @Test
    public void testFirstName() {
        firstPerson.setFirstName(null);
        secondPerson.setFirstName("Andrey");
        thirdPerson.setFirstName("Michail");
        assertNull(firstPerson.getFirstName());
        assertEquals(secondPerson.getFirstName(), "Andrey");
        assertEquals(thirdPerson.getFirstName(), "Michail");
        assertNull(person.getFirstName());
    }

    @Test
    public void testLastName() {
        firstPerson.setLastname(null);
        secondPerson.setLastname("Golovyshkin");
        thirdPerson.setLastname("Annin");
        assertNull(firstPerson.getLastname());
        assertEquals(secondPerson.getLastname(), "Golovyshkin");
        assertNotEquals(thirdPerson.getLastname(), "Konov");
        assertNull(person.getFirstName());
    }

    @Test
    public void testPassportId() {
        firstPerson.setPassportId(8800);
        secondPerson.setPassportId(5553535);
        thirdPerson.setPassportId(1);
        assertEquals(firstPerson.getPassportId(), 8800);
        assertNotEquals(secondPerson.getPassportId(), 65);
        assertEquals(thirdPerson.getPassportId(), 1);
    }
}
