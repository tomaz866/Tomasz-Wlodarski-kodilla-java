package com.kodilla.patterns2.observer.homework;

public class Mentor implements StudentObserve {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + ": New homework from student: " + student.getName() + "\n" +
                " (total: " + student.getHomework().size() + " homework)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
