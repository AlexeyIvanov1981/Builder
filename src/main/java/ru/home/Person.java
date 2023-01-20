package ru.home;

public class Person {
    private final String NAME;
    private final String SURNAME;
    private int age;
    private String cities;
//    protected final Cities CITIES;

    public Person(String name, String surname, int age, String cities) {
        this.NAME = name;
        this.SURNAME = surname;
        this.age = age;
        this.cities = cities;
    }

    public PersonBuilder newChildBuilder() {
        
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

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public int getAge() {
        return age;
    }

    public String getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name =" + NAME +
                ", surname =" + SURNAME +
                ", age =" + age +
                ", cities =" + cities;
    }
}
