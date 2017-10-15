package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User tom = new Millenials("Tomasz");
        User ada = new YGeneration("Adriana");
        User ed = new ZGeneration("Edwart");

        //When
        String tomSharePost = tom.sharePost();
        System.out.println("Tomasz used " + tomSharePost);
        String adaSharePost = ada.sharePost();
        System.out.println("Ada used " + adaSharePost);
        String edSharePost = ed.sharePost();
        System.out.println("Edwart used " + edSharePost);

        //Then
        Assert.assertEquals("Facebook",tomSharePost);
        Assert.assertEquals("Twitter",adaSharePost);
        Assert.assertEquals("Snapchat",edSharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User tom = new Millenials("Tomasz");

        //When
        String tomSharePost = tom.sharePost();
        System.out.println("Tomasz used " + tomSharePost);
        tom.changeSharePost(new TwitterPublisher());
        tomSharePost = tom.sharePost();
        System.out.println("Tomasz use now " + tomSharePost);

        //Then
        Assert.assertEquals("Twitter",tomSharePost);
    }
}
