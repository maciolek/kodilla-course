package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistic {

    private Statistics statistics;
    private int numbersOfUsers;
    private int numberOfPosts;
    private int numbersOfCommets;
    private double averageNumbersCommentsOfPost;
    private double averageNumbersCommentsOfUser;
    private double averageNumbersPostOfUser;

    public CalculateStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numbersOfCommets = statistics.commentsCount();
        if (numbersOfUsers == 0) {
            averageNumbersPostOfUser = 0.0;
            averageNumbersCommentsOfUser = 0.0;
        } else {
            averageNumbersPostOfUser = (double) numberOfPosts / (double) numbersOfUsers;
            averageNumbersCommentsOfUser = (double) numbersOfCommets / (double) numbersOfUsers;
        }
        if (numberOfPosts == 0) {
            averageNumbersCommentsOfPost = 0.0;
        } else {
            averageNumbersCommentsOfPost = (double) numbersOfCommets / (double) numberOfPosts;
        }
    }
    public void showStatistics() {
        System.out.println("Ilość użytkowników " + numbersOfUsers);
        System.out.println("Ilość postów " + numberOfPosts);
        System.out.println("Ilość komentarzy " + numbersOfCommets);
        System.out.println("Srednia ilość postów na użytkownika " + averageNumbersPostOfUser);
        System.out.println("Srednia ilość komentarzy na użytkownika " + averageNumbersCommentsOfUser);
        System.out.println("Srednia ilość korzymenta na post " + averageNumbersCommentsOfPost);
    }

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public double getAverageNumbersCommentsOfPost() {
        return averageNumbersCommentsOfPost;
    }

    public double getAverageNumbersCommentsOfUser() {
        return averageNumbersCommentsOfUser;
    }

    public double getAverageNumbersPostOfUser() {
        return averageNumbersPostOfUser;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumbersOfCommets() {
        return numbersOfCommets;
    }
}
