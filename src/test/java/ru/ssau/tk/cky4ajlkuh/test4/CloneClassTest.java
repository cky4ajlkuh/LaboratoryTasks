package ru.ssau.tk.cky4ajlkuh.test4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CloneClassTest {

    @Test
    public void testTestClone() {
        CloneClass clone = new CloneClass();
        SecondCloneClass secondClone = new SecondCloneClass();
        Assert.assertThrows(CloneNotSupportedException.class, secondClone::clone);
        /*Assert.assertThrows(CloneNotSupportedException.class, clone::clone);
        * Класс, реализующий интерфейс Cloneable,
        * не выбрасил исключение, в отличие от класса,
        * не наследующегося от интерфейса..
        * */
    }
}