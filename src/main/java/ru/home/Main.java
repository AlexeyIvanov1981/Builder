package ru.home;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress(String.valueOf(Cities.TAGANROG))
                .build();
        System.out.println(mom);
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        mom.happyBirthday();
        System.out.println(mom);
        System.out.println(mom.hasAddress());
        System.out.println(mom.hasAge());
    }
}