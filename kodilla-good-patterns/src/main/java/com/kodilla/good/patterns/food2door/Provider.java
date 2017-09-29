package com.kodilla.good.patterns.food2door;

public class Provider {
    private String name;
    private String address;
    private String nip;

    public Provider(String name, String address, String nip) {
        this.name = name;
        this.address = address;
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNip() {
        return nip;
    }
}
