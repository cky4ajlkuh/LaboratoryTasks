package ru.ssau.tk.cky4ajlkuh.labs4;

import ru.ssau.tk.cky4ajlkuh.test3.Person;

public class Practice {
    public static String getNamePerson(Person person) {
        if (person.getFirstName() == null || person.getLastname() == null) {
            throw new NullPointerException("Отсутствует Имя/Фамилия!");
        }
        return person.toString();
    }
}
