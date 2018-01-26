package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void test1() {
        Task drivingTask = new DrivingTask("Zlecenie wyjazdu", "Kraków", "AUDI A6");
        drivingTask.executeTask();
        System.out.println(drivingTask.getTaskName());
        System.out.println(drivingTask.isTaskExecuted());

    }
}
