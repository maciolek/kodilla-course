package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student implements Observable {

    private final String name;
    private final ArrayDeque<Task> tasksQueue;
    private final List<Mentor> mentors;

    public Student(String name) {
        this.name = name;
        this.tasksQueue = new ArrayDeque<>();
        this.mentors = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasksQueue.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentor() {
        for (Mentor mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    public String getName() {
        return name;
    }

    public ArrayDeque<Task> getTasksQueue() {
        return tasksQueue;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }
}
