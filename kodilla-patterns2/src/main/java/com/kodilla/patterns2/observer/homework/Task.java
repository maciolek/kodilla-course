package com.kodilla.patterns2.observer.homework;

import java.time.LocalDateTime;

public class Task {

    private final String name;
    private final LocalDateTime dateTime;
    private final int number;

    public Task(String name, int number) {
        this.name = name;
        this.dateTime = LocalDateTime.now();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
