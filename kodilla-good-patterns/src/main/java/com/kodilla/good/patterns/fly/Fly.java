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

    public boolean check (String town) {
        if(from == town) {
            return true;
        }
        if(via == town) {
            return true;
        }
        if(to == town) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fly fly = (Fly) o;

        if (!from.equals(fly.from)) return false;
        if (!via.equals(fly.via)) return false;
        return to.equals(fly.to);
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + via.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }
}
