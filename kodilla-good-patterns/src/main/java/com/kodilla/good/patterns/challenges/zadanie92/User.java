package com.kodilla.good.patterns.challenges.zadanie92;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String nick;

    public User(String firstname, String lastname, int age, String nick) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.nick = nick;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname = '" + firstname + '\'' +
                ", lastname = '" + lastname + '\'' +
                ", age = " + age +
                ", nick = '" + nick + '\'' +
                '}';
    }
}
