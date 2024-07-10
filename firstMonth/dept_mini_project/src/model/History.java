package model;

import java.util.UUID;

public class History {
    private UUID id;
    private double amount;
    private boolean s;
    public History() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public String toString() {
        return "History{" +
                "id=" + id +
                ", amount=" + amount +
                ", s=" + s +
                '}';
    }
}
