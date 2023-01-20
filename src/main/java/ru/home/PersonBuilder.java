package ru.home;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String cities;

    public PersonBuilder name(String name){
        this.name = name;
        return this;
    }
    public PersonBuilder surname(String surname){
        this.surname = surname;
        return this;
    }
    public PersonBuilder age(int age){
        this.age = age;
        return this;
    }
    public PersonBuilder cities(String cities){
        this.cities = cities;
        return this;
    }

    public Person builder(){
        return new Person(name, surname, age, cities);
    }

}
