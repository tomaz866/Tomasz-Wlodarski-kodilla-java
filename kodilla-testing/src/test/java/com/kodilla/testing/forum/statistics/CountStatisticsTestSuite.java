package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsPosts0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int n=0;n<10;n++){
            users.add("aaa" + n);
        }
        int post = 0;
        int comment = 0;

        double[] expected ={0.0,0.0,0.0};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
             wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
    @Test
    public void testCalculateAdvStatisticsPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int n=0;n<10;n++){
            users.add("aaa" + n);
        }
        int post = 1000;
        int comment = 10;

        double[] expected ={100.0,1.0,0.01};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
            wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
    @Test
    public void testCalculateAdvStatisticsComments0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int n=0;n<10;n++){
            users.add("aaa" + n);
        }
        int post = 10;
        int comment = 0;

        double[] expected ={1.0,0.0,0.0};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
            wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsLessPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int n=0;n<10;n++){
            users.add("aaa" + n);
        }
        int post = 100;
        int comment = 50;

        double[] expected ={10.0,5.0,0.5};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
            wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsMorePosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int n=0;n<10;n++){
            users.add("aaa" + n);
        }
        int post = 10;
        int comment = 100;

        double[] expected ={1.0,10.0,10.0};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
            wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
    @Test
    public void testCalculateAdvStatisticsUsers0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();

        int post = 0;
        int comment = 0;

        double[] expected ={0.0,0.0,0.0};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
            wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
    @Test
    public void testCalculateAdvStatisticsUsers100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for(int n=0;n<100;n++){
            users.add("aaa" + n);
        }
        int post = 10;
        int comment = 100;

        double[] expected ={0.1,1.0,10.0};

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        CountStatistics countStatistics = new CountStatistics();
        //When
        double[] adv = countStatistics.calculateAdvStatistics(statisticsMock);
        boolean wynik = false;
        if(Arrays.equals(expected,adv)){
            wynik = true;
        }
        //Then
        Assert.assertTrue(wynik);
    }
}
