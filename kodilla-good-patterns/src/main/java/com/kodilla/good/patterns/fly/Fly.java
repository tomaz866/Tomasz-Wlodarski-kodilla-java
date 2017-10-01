package com.kodilla.good.patterns.fly;

public class Fly {

    private String from;
    private String via;
    private String to;

    public Fly(String from, String via, String to) {
        this.from = from;
        this.via = via;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getVia() {
        return via;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Fly{ "
                 + from + " - "
                 + via + " - " +
                to +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if(from == o) {
            return true;
        }
        if(via == o) {
            return true;
        }
        if(to == o) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + via.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }
}
