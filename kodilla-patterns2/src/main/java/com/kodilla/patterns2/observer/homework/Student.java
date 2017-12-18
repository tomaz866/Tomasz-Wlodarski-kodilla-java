package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements MentorsCheck {

    private final String name;
    private final List<StudentObserve> observers;
    private final Deque<String> homework;

    public Student(String name) {
        observers = new ArrayList<>();
        homework = new ArrayDeque<>();
        this.name = name;
    }

    public void addHomework(String work) {
        homework.offer(work);
        notifyObservers();
    }

    @Override
    public void registerObserver(StudentObserve studentObserve) {
        observers.add(studentObserve);
    }

    @Override
    public void notifyObservers() {
        for(StudentObserve studentObserve : observers) {
            studentObserve.update(this);
        }
    }

    @Override
    public void removeObserver(StudentObserve studentObserve) {
        observers.remove(studentObserve);
    }

    public String getName() {
        return name;
    }

    public Deque<String> getHomework() {
        return homework;
    }
}
