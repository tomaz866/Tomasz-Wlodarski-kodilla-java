package com.kodilla.patterns2.observer.homework;

public interface MentorsCheck {

    void registerObserver(StudentObserve studentObserve);
    void notifyObservers();
    void removeObserver(StudentObserve studentObserve);
}
