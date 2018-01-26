package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task drivingTask = taskFactory.generateTask("DRIVINGTASK");
        boolean expectedIsTaskDoneBeforeExecuteTask = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean expectedIsTaskDone = drivingTask.isTaskExecuted();

        //then
        Assert.assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        Assert.assertEquals("Wyjazd", drivingTask.getTaskName());
        Assert.assertTrue(expectedIsTaskDone);
    }

    @Test
    public void testFactoryShoppingFactory() {

        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task shoppingTask = taskFactory.generateTask("SHOPPINGTASK");
        boolean expectedIsTaskDoneBeforeExecuteTask = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean expectedIsTaskDone = shoppingTask.isTaskExecuted();

        //then
        Assert.assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        Assert.assertEquals("Zakupy spożywcze", shoppingTask.getTaskName());
        Assert.assertTrue(expectedIsTaskDone);
    }

    @Test
    public void testFactoryPaintingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task paintingTask = taskFactory.generateTask("PAINTNGTASK");
        boolean expectedIsTaskDoneBeforeExecuteTask = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean expectedIsTaskDone = paintingTask.isTaskExecuted();

        //then
        Assert.assertFalse(expectedIsTaskDoneBeforeExecuteTask);
        Assert.assertEquals("Malowanie", paintingTask.getTaskName());
        Assert.assertTrue(expectedIsTaskDone);
    }
}
