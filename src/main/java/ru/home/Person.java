package ru.home;

public class Person {
    protected final String NAME;
    protected final String SURNAME;
    protected int age;
    protected String cities;
//    protected final Cities CITIES;

    public Person(String name, String surname, int age, String cities) {
        NAME = name;
        SURNAME = surname;
        this.age = age;
        this.cities = cities;
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        if (this.age > 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (this.cities != null){
            return true;
        }
        return false;
    }
}
