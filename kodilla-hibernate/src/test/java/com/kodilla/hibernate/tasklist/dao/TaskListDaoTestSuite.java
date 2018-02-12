package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "2nd test Hibernate";
    private static final String LISTNAME = "List in progress";

    @Test
    public void testTaskListDao() {
        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        //when
        List<TaskList> actualList = taskListDao.findByListName(taskList.getListName());
        int actualTaskListSize = actualList.size();
        String actualTaskListName = taskList.getListName();

        //then
        Assert.assertEquals(1, actualTaskListSize);
        Assert.assertEquals(LISTNAME, actualTaskListName);

        //clean up
        taskListDao.delete(taskList);
    }
}
