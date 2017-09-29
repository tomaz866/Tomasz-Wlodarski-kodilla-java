package com.kodilla.good.patterns.food2door;



public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrderProcess orderProcess = new OrderProcess(new OrderInformation(), new ExtraFoodShop() ,new CheckOrder());
        orderProcess.process(orderRequest);
    }
}
