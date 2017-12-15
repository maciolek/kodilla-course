package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestCalculateAdvStatistics {

    private static int counter = 1;

    @Before
    public void before() {
        System.out.println("\nStart test" + counter);
    }

    @After
    public void after() {
        System.out.println("Koniec testu" + counter);
        counter++;

    }

    @Test
    public void numbersOfPosts0() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 0;
        int commentsCount = 500;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();
        int numberOfPostsIsNull =calculateStatistic.getNumberOfPosts();

        //then
        Assert.assertEquals(0, numberOfPostsIsNull);
        Assert.assertEquals(0, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(5.0, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(0, AverageNumbersPostOfUser, 0);

        System.out.println("Test gdy liczba postów = 0");
        calculateStatistic.showStatistics();
    }

    @Test
    public void numbersOfPosts1000() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 1000;
        int commentsCount = 500;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();

        //then
        Assert.assertEquals(0.5, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(5.0, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(10.0, AverageNumbersPostOfUser, 0);
        System.out.println("Test gdy liczba postów = 1000");
        calculateStatistic.showStatistics();
    }

    @Test
    public void numbersOfComments0() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 1000;
        int commentsCount = 0;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double numbersOfCommentsIsNull = calculateStatistic.getNumbersOfCommets();
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();

        //then
        Assert.assertEquals(0, numbersOfCommentsIsNull, 0);
        Assert.assertEquals(0.0, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(0.0, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(10.0, AverageNumbersPostOfUser, 0);
        System.out.println("Test gdy liczba komentarzu =0 ");
        calculateStatistic.showStatistics();
    }

    @Test
    public void numbersOfCommentsLessThanNumberOfPosts() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 100;
        int commentsCount = 50;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double numbersOfUsers = calculateStatistic.getNumbersOfUsers();
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();

        //then
        Assert.assertEquals(0.5, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(0.5, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(1.0, AverageNumbersPostOfUser, 0);
        System.out.println("Test gdy liczba komentarzy jest mniejsza niż liczba postów ");
        calculateStatistic.showStatistics();
    }

    @Test
    public void numbersOfCommentsMoreThanNumberOfPosts() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 100;
        int commentsCount = 500;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double numbersOfUsers = calculateStatistic.getNumbersOfUsers();
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();

        //then
        Assert.assertEquals(5.0, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(5.0, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(1.0, AverageNumbersPostOfUser, 0);
        System.out.println("Test gdy liczba komentarzy jest większa liczba postów ");
        calculateStatistic.showStatistics();
    }

    @Test
    public void numbersOfUsers0() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();

        int postCount = 100;
        int commentsCount = 500;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double numbersOfUsersIsNull = calculateStatistic.getNumbersOfUsers();
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();

        //then
        Assert.assertEquals(0.0, numbersOfUsersIsNull, 0);
        Assert.assertEquals(5.0, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(0.0, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(0.0, AverageNumbersPostOfUser, 0);
        System.out.println("Test gdy liczba użytkowników jest równa 0 ");
        calculateStatistic.showStatistics();
    }

    @Test
    public void numbersOfUsers100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 1000;
        int commentsCount = 200;

        CalculateStatistic calculateStatistic = new CalculateStatistic(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        //when
        double numbersOfUsers = calculateStatistic.getNumbersOfUsers();
        double AverageNumbersCommentsOfPost = calculateStatistic.getAverageNumbersCommentsOfPost();
        double AverageNumbersCommentsOfUser = calculateStatistic.getAverageNumbersCommentsOfUser();
        double AverageNumbersPostOfUser = calculateStatistic.getAverageNumbersPostOfUser();

        //then
        Assert.assertEquals(0.2, AverageNumbersCommentsOfPost, 0);
        Assert.assertEquals(2.0, AverageNumbersCommentsOfUser, 0);
        Assert.assertEquals(10.0, AverageNumbersPostOfUser, 0);
        System.out.println("Test gdy liczba użytkowników 100 ");
        calculateStatistic.showStatistics();
    }
}




