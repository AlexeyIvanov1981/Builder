package ru.home;

public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String cities;
//    protected final Cities CITIES;


    public Person(String name, String surname, int age, String cities) {
        this.name = name;
        this.surname = surname;
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
        if (this.cities != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCities() {
        return cities;
    }
}
