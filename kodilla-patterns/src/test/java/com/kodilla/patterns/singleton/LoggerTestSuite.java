package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //given
        Logger.getInstance().log("Pierwsze logowanie");
        //when
        String actualLog = Logger.getInstance().getLastLog();
        Assert.assertEquals("Pierwsze logowanie", actualLog);
    }

    @Test
    public void testGetInstanceOnlyOnce() {
        //given
        Logger excpectedInstance = Logger.getInstance();
        //when
        Logger actualInstance = Logger.getInstance();
        Assert.assertTrue(excpectedInstance == actualInstance);
    }
}
