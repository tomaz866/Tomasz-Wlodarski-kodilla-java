package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(111,"Tom",'M',LocalDate.of(1986,6,19),4));
        userList.add(new ForumUser(112,"Mon",'K',LocalDate.of(1995,4,17),12));
        userList.add(new ForumUser(113,"Kodi",'K',LocalDate.of(2010,3,14),6));
        userList.add(new ForumUser(114,"Tomi",'M',LocalDate.of(1995,8,23) ,0));
        userList.add(new ForumUser(115,"Fixi",'K',LocalDate.of(1954,9,30) ,3));
        userList.add(new ForumUser(116,"Teke",'M',LocalDate.of(1997,10,12) ,42));
        userList.add(new ForumUser(117,"Pater",'M',LocalDate.of(2001,12,26) ,4));
        userList.add(new ForumUser(118,"Tima",'K',LocalDate.of(1986,5,23) ,1));
        userList.add(new ForumUser(119,"Pat",'M',LocalDate.of(1992,6,7) ,0));
        userList.add(new ForumUser(120,"Timi",'M',LocalDate.of(1990,9,8) ,9));
        userList.add(new ForumUser(121,"Lidi",'K',LocalDate.of(1999,9,24) ,4));
        userList.add(new ForumUser(122,"Toki",'M',LocalDate.of(1992,8,25) ,1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
