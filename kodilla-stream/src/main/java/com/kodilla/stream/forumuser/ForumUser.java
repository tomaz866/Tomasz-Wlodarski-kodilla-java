package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String user;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(final int id,final String user,final char sex,final LocalDate birthDate,final int posts) {
        this.id = id;
        this.user = user;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
