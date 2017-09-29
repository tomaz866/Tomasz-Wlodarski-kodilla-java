package com.kodilla.good.patterns.challenges.zadanie92;

public class MailService implements InformationService {

    public void inform(User user, Order order) {

        System.out.println("Mail wysłany do użytkownika - " + user.getNick() + '\n' + order.toString());
    }
}
