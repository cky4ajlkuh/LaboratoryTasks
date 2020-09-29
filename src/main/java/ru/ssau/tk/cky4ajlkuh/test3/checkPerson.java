package ru.ssau.tk.cky4ajlkuh.test3;

public class checkPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkName(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkName (Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }

}

/* Вызываем метод chechInt, передавая тудая значение переменной number = 5, но т.к. аргументы-примитивы мы можем
* передавать по значению, то значение переменной number переопределяется в самой функции. А передавая в checkPerson
* имя Аркадий, зная что это ссылочный тип, переопределяем ссылку с имени Аркадия на имя Олег. Потом мы вызываем
* метод println уже для переменной number = 5, и возвращаем значение имени person, которым является Олег, т.к.
* класс Person имеет ссылку только на имя Олег.*/