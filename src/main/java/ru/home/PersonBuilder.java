package ru.home;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    private String childName;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Вы ввели недопустимое значение возраста человека");
        } else this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null || age < -1 || address == null) {
            throw new IllegalStateException("Вы указали недостаточно данных для создания объекта Person");
        } else return new Person(name, surname, age, address);
    }


}
