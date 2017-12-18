package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;

public final class ForumUser {

    private final int userID;
    private final String name;
    private final char male;
//    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public enum male {
        M, F
    }

    public ForumUser(final int userID, final String name, final char male, final int numberOfPosts) {
        this.userID = userID;
        this.name = name;
        this.male = male;
 //       this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public char getMale() {
        return male;
    }

/*    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }*/

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return
                "userID: " + userID +
                ", name: '" + name + '\'' +
                ", male: " + male +
           //     ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts: " + numberOfPosts;
    }

}
