package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

        @Test
        public void testBeansExist() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
            //When
            boolean boardExists = context.containsBean(context.getBean(Board.class).toString());
            boolean toDoListExists = context.containsBean("taskToDoList");
            boolean inProgressList = context.containsBean("taskInProgressList");
            boolean doneList = context.containsBean("taskDoneList");
            //Then
            System.out.println("Bean BOARD was found in the container: " + boardExists);
            System.out.println("Bean taskToDoList was found in the container: " + toDoListExists);
            System.out.println("Bean taskInProgressList was found in the container: " + inProgressList);
            System.out.println("Bean doneList was found in the container: " + doneList);
        }
    }

