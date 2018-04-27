package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface Observable {

    void registerMentor(Mentor mentor);
    void notifyMentor();
    void removeMentor(Mentor mentor);
}