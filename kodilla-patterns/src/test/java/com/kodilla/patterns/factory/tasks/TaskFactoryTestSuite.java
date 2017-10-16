package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.doTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Zakupy",shopping.getTaskName());
        Assert.assertEquals(true,shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.doTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("Malowanie",painting.getTaskName());
        Assert.assertEquals(false,painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Transport",driving.getTaskName());
        Assert.assertEquals(true,driving.isTaskExecuted());
    }
}
