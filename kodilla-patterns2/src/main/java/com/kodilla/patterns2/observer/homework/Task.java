package com.kodilla.patterns2.observer.homework;

import java.time.LocalDateTime;

public class Task {

    private final String name;
    private final LocalDateTime dateTime;

    public Task(String name) {
        this.name = name;
        this.dateTime = LocalDateTime.now();
    }
}
