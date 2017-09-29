package com.kodilla.good.patterns.food2door;

public class ProviderDto {

    public Provider provider;
    public Product product;

    public ProviderDto(final Provider provider,final Product product) {
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
