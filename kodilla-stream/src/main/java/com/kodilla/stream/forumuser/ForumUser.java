package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public final class ForumUser {

    private final int userID;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int userID, final String name, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        if (sex != 'M' && sex != 'F') throw new IllegalArgumentException("bad argument");
        this.userID = userID;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return
                ", name: '" + name + '\'' +
                        ", sex: " + sex +
                        ", dateOfBirth=" + dateOfBirth +
                        ", numberOfPosts: " + numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID &&
                sex == forumUser.sex &&
                numberOfPosts == forumUser.numberOfPosts &&
                Objects.equals(name, forumUser.name) &&
                Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userID, name, sex, dateOfBirth, numberOfPosts);
    }
}
