package ru.ssau.tk.cky4ajlkuh.test3;

public class Person {
    private String firstName;
    private String lastname;
    private int passportId;

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
        Person person = new Person();
        String lastname = "Ищанов";
        String firstname = "Даниил";
        int passportId = 101112;
        person.setFirstName(firstname);
        person.setLastname(lastname);
        person.setPassportId(passportId);
        Person secondPerson = new Person();
        String secondLastname = "Горелых";
        String secondFirstname = "Гумир";
        int secondPassportTd = 3615;
        person.setFirstName(secondFirstname);
        person.setLastname(secondLastname);
        person.setPassportId(secondPassportTd);
    }
}