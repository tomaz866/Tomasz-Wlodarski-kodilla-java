package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    public Provider provider;
    public Product product;

    public OrderRequest(Provider provider, Product product) {
        this.provider = provider;
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }
}
