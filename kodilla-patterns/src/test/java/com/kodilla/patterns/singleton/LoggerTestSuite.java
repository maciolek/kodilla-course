package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //given
        Logger.INSTANCE.log("Pierwsze logowanie");
        //when
        String actualLog = Logger.INSTANCE.getLastLog();
        Assert.assertEquals("Pierwsze logowanie", actualLog);
    }

    @Test
    public void testGetInstanceOnlyOnce() {
        //given
        Logger excpectedInstance = Logger.INSTANCE;
        //when
        Logger actualInstance = Logger.INSTANCE;
        Assert.assertTrue(excpectedInstance == actualInstance);
    }
}
