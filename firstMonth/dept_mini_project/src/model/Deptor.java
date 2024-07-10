package model;

import java.util.UUID;

public class Deptor {
    private UUID id;
    private String name;
    private double amount;
    public  History[] histories = new History[100];

    public Deptor() {
        this.id = UUID.randomUUID();
    }

    public Deptor(UUID id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void getAmount(double amount) {
        this.amount += amount;
    }
    public void reduceAmount(double amount){
        this.amount -= amount;
    }

    public String toString() {
        return "{ "  + " id: " + id + ", name:  " + name + ", amount: " + amount + "$ }";
    }
}
