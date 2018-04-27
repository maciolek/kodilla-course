package com.kodilla.patterns2.observer.forum.homework;

import com.kodilla.patterns2.observer.homework.Mentor;
import com.kodilla.patterns2.observer.homework.Student;
import com.kodilla.patterns2.observer.homework.Task;
import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){

        //given
        Student janKowalski = new Student("Jan Kowalski");
        Student marekBrzeczyszczykiewicz = new Student("Marek Brzęczyszczykiewicz");
        Student sebastianPol = new Student("Sebiastian Pol");
        Mentor jamesGosling = new Mentor("James Gosling");
        Mentor adamMentor = new Mentor("Adam Mentor");
        janKowalski.registerMentor(jamesGosling);
        marekBrzeczyszczykiewicz.registerMentor(adamMentor);
        sebastianPol.registerMentor(adamMentor);

        //when
        Task task1 = new Task("Try, catch, finnaly");
        Task task2 = new Task("Spring AOP");
        Task task3 = new Task("Built facade pattern");
        janKowalski.addTask(task1);
        marekBrzeczyszczykiewicz.addTask(task1);
        marekBrzeczyszczykiewicz.addTask(task2);
        sebastianPol.addTask(task1);
        sebastianPol.addTask(task2);
        sebastianPol.addTask(task3);

        //then
        Assert.assertEquals(1, jamesGosling.getUpdateCount());
        Assert.assertEquals(5, adamMentor.getUpdateCount());
    }
}
