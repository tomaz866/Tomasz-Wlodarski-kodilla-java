package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Zakupy", "ziemniaki",3.5);
            case PAINTING:
                return new PaintingTask("Malowanie", "zielony","drzwi");
            case DRIVING:
                return new DrivingTask("Transport", "sklepu", "samochodem");
            default:
                return null;
        }
    }
}
