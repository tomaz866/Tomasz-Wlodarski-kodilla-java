package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retriever() {

        Provider provider = new Provider ("ExtraFoodShop","02-300 Walesie","43242423424");

        Product product = new Product("Kozie sery",30);

        return new OrderRequest(provider, product);

    }
}
