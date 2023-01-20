package ru.home;

public class Person {
    private final String NAME;
    private final String SURNAME;
    private int age;
    private String address;


    public Person(String name, String surname, int age, String address) {
        this.NAME = name;
        this.SURNAME = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.getSURNAME())
                .setAddress(this.getAddress());
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        if (this.age >= 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (this.address != null) {
            return true;
        }
        return false;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name: " + NAME +
                ", surname: " + SURNAME +
                ", age: " + age +
                ", address: " + address;
    }
}
