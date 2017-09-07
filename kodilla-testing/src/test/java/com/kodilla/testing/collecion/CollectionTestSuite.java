package com.kodilla.testing.collecion;

import java.util.ArrayList;
import com.kodilla.testing.collecion.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        int result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(result == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(7);
        numbers.add(12);
        //When
        int result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing normal list");
        //Then
        Assert.assertTrue(result ==3);

    }

}
