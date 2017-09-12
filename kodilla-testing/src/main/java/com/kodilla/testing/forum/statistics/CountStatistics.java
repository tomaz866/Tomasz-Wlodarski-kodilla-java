package com.kodilla.testing.forum.statistics;

public class CountStatistics {

    public double[] calculateAdvStatistics(Statistics statistics){

        int users = statistics.usersNames().size();
        int posts = statistics.postsCount();
        int comments = statistics.commentsCount();

        double userss = (double) users;
        double postss = (double) posts;
        double commentss = (double) comments;

        double average1 = 0.0;
        if(users == 0) {
             average1 = 0.0;
        }
        if(users > 0) {
             average1 = postss / userss;
        }
        double average2 = 0.0;
        if(users == 0) {
             average2 = 0.0;
        }
        if(users > 0) {
            average2 = commentss/userss;
        }
        double average3 = 0.0;
        if(posts == 0) {
             average3 = 0.0;
        }
        if(posts > 0) {
             average3 = commentss / postss;
        }

        double[] average = {average1,average2,average3};

        return average;
    }

}
