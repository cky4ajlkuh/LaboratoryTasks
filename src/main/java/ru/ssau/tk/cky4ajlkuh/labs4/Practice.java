package ru.ssau.tk.cky4ajlkuh.labs4;

import ru.ssau.tk.cky4ajlkuh.test3.Person;

public class Practice {
    public static String getNamePerson(Person person) {
        if (person.getFirstName() == null || person.getLastname() == null) {
            throw new NullPointerException("Отсутствует Имя/Фамилия!");
        }
        return person.toString();
    }

    public static String[] getArrayChars(String[] array, int n) {
        String[] arrayChar = new String[array.length];
        for (String string : array) {
            if (n > string.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        for (String string : array) {
            if (string == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            arrayChar[i] = array[i].substring(n, n + 1);
        }
        return arrayChar;
    }

    public static int divisionStr(String str1, String str2) {
        if (str2 == null && Integer.parseInt(str2) == 0) {
            throw new ArithmeticException();
        }
        if (!Character.isDigit(str1.charAt(0)) || !Character.isDigit(str2.charAt(0))) {
            throw new NumberFormatException();
        }
        return Integer.parseInt(str1) / Integer.parseInt(str2);
    }
}
