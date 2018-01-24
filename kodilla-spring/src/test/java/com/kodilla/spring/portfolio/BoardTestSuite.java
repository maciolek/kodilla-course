package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testBeansExist() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        boolean boardExists = context.containsBean("getBoard");
        boolean toDoListExists = context.containsBean("taskToDoList");
        boolean inProgressList = context.containsBean("taskInProgressList");
        boolean doneList = context.containsBean("taskDoneList");

        //Then
        System.out.println("Bean Board was found in the container: " + boardExists);
        System.out.println("Bean taskToDoList was found in the container: " + toDoListExists);
        System.out.println("Bean taskInProgressList was found in the container: " + inProgressList);
        System.out.println("Bean doneList was found in the container: " + doneList);
    }

    @Test
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When

        Board board = (Board)context.getBean("getBoard");

        ArrayList<String> taskToDoList = (ArrayList)board.getToDoList().getTasksList();
        taskToDoList.add("Pierwsze zadanie zostało przyjęte do realizacji");

        ArrayList<String> taskInProgressList = (ArrayList)board.getInProgressList().getTasksList();
        taskInProgressList.add("Drugie zadanie w trakcie realizacji");

        ArrayList<String> taskDoneList = (ArrayList)board.getDoneList().getTasksList();
        taskDoneList.add("Zadanie 3 wykonane");

        //Then

        Assert.assertEquals("Pierwsze zadanie zostało przyjęte do realizacji",taskToDoList.get(0));
        Assert.assertEquals("Drugie zadanie w trakcie realizacji",taskInProgressList.get(0));
        Assert.assertEquals("Zadanie 3 wykonane",taskDoneList.get(0));
    }
}

