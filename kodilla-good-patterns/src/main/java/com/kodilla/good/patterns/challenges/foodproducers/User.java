package com.kodilla.good.patterns.challenges.foodproducers;

public class User {

    private String firstName;
    private String surname;
    private String userName;
    private String adress;
    private String email;

    public User(String firstName, String surname, String userName, String adress, String email) {
        this.firstName = firstName;
        this.surname = surname;
        this.userName = userName;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }
}
