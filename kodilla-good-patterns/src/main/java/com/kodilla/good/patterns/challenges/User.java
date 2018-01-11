package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String surname;
    private String userName;

    public User(String name, String surname, String userName) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }
}
