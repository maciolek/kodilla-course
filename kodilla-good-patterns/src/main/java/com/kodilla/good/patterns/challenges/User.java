package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String surname;
    private String userName;
    private String email;
    private char sex;

    public User(String name, String surname, String userName, String email) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.email = email;
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

    public String getEmail() {
        return email;
    }
}
