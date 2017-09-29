package com.kodilla.good.patterns.food2door;

public class OrderInformation {

    public void info(Provider provider, Product product) {

        System.out.println("Dostawca: " + provider.getName() + '\n' + provider.getAddress() + '\n' +
                "NIP - " + provider.getNip() + '\n' + product.toString());
    }
}
