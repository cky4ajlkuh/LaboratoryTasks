package ru.ssau.tk.cky4ajlkuh.test3;

public class Person {
    private String firstName;
    private String lastname;
    private int passportId;

    public Person(String firstName, String lastname, int passportId) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

class Test {
    public static void main(String[] args) {
        Person person = new Person("Горелых", "Даниил", 101112);
        Person secondPerson = new Person("Ищанов", "Гумир", 3615);
    }
}