package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + "! Today is red-letter day! - " + "Tasks are waiting for you in the queue." +
                " Student " + student.getName() + " has "+ student.getTasksQueue().size() +
                " tasks to check");
        System.out.println("By all means you have to check all of them immediately! :-)\n");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }


}
