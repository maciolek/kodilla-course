package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskBoard {

    private final List<Task> listTaskToDO = new ArrayList<>();
    private final List<Task> listTaskDone = new ArrayList<>();

    public void changeTaskStatus(Task task){
        if(listTaskDone.contains(task)) {
            listTaskToDO.remove(task);
            listTaskDone.add(task);
        }
    }


}

