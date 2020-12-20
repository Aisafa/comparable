package ru.netology.domain;

public class Flight implements Comparable<Flight> {
    private int id;
    private int cost;
    private String from;
    private String to;
    private int Airtime;

    public Flight() {
    }

    public Flight(int id, int cost, String from, String to, int airtime) {
        this.id = id;
        this.cost = cost;
        this.from = from;
        this.to = to;
        Airtime = airtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getAirtime() {
        return Airtime;
    }

    public void setAirtime(int airtime) {
        Airtime = airtime;
    }

    @Override
    public int compareTo(Flight o) {
        return cost - o.cost;
    }
}
