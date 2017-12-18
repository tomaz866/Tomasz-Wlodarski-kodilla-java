package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuite {

    @Test
    public void testUpdateForCheck() {
        //Given
        Student tomHaz = new Student("Tom Haz");
        Student annaLip = new Student("Anna Lip");
        Student kimPaul = new Student("Kim Paul");
        Student zakGirh = new Student("Zak Girh");

        Mentor adamLiw = new Mentor("Adam Liw");
        Mentor lizaHart = new Mentor("Liza Hart");

        tomHaz.registerObserver(adamLiw);
        kimPaul.registerObserver(lizaHart);
        annaLip.registerObserver(lizaHart);
        zakGirh.registerObserver(adamLiw);

        //When
        tomHaz.addHomework("Zadanie 1");
        tomHaz.addHomework("Zadanie 2");
        zakGirh.addHomework("Zadanie 1");
        zakGirh.addHomework("Zadanie 2");
        zakGirh.addHomework("Zadanie 3");
        kimPaul.addHomework("Zadanie 3");
        annaLip.addHomework("Zadanie 1");
        annaLip.addHomework("Zadanie 3");

        //Then
        assertEquals(5, adamLiw.getUpdateCount());
        assertEquals(3, lizaHart.getUpdateCount());
    }
}
