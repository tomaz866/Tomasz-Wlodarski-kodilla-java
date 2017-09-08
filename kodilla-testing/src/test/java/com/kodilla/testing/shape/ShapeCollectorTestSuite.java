package com.kodilla.testing.shape;


import com.kodilla.testing.Shape.Circle;
import com.kodilla.testing.Shape.Shape;
import com.kodilla.testing.Shape.Squer;
import com.kodilla.testing.Shape.Triangle;
import com.kodilla.testing.Shape.ShapeCollector;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Before
    public void beforeTest(){
        System.out.println("Start test");
    }
    @After
    public void afterTest(){
        System.out.println("Finish test");
    }
    @Test
    public void testAddFigure(){
        //Given
        ArrayList<Shape> figures = new ArrayList<Shape>();
        Squer squer = new Squer();
        //When
        figures.add(squer);
        //Then
        Assert.assertEquals(1,figures.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ArrayList<Shape> figures = new ArrayList<Shape>();
        Triangle triangle = new Triangle();
        figures.add(triangle);
        //When
        boolean result = figures.remove(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,figures.size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ArrayList<Shape> figures = new ArrayList<Shape>();
        Circle circle = new Circle();
        figures.add(circle);
        //When
        Shape retrieved = figures.get(0);
        //Then
        Assert.assertEquals(circle,retrieved);
    }
}
