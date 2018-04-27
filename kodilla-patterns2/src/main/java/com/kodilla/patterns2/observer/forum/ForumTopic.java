package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable{

    private final List<Observer> observers;
    private final List<String> messeges;
    private final String name;

    public ForumTopic(String name) {
        this.observers = new ArrayList<>();
        this.messeges = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messeges.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMesseges() {
        return messeges;
    }

    public String getName() {
        return name;


    }
}
