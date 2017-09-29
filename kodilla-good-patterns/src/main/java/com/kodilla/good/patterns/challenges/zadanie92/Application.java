package com.kodilla.good.patterns.challenges.zadanie92;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),new ProductOrderService(),new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
