package com.kodilla.good.patterns.challenges;

public class User {

    private String firstName;
    private String surname;
    private String userName;
    private String email;

    public User(String firstName, String surname, String userName, String email) {
        this.firstName = firstName;
        this.surname = surname;
        this.userName = userName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
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
