package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements ProviderProcess {

    public boolean process(Product product) {

        System.out.println("Realizacja zamówienia - START" + '\n' + "Zamówienie 1 - " + product.getName() + '\n' + "Ilość: " + product.getQuantity() +
                '\n' + "W realizacji... przetwarzanie");
        return true;
    }
}
