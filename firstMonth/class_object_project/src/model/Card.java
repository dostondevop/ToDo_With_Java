package model;

import java.util.UUID;

public class Card {
    public UUID id;
    public String name;
    public String cardNumber;
    public String expiryDate;
    public String password;
    public double balance;

    public Card() {
        this.id = UUID.randomUUID();
    }


    public String toString() {
        return "card: {" + "\n" +
                "id= " + id +
                "\nname= " + name +
                "\ncardNumber= " + cardNumber +
                "\nexpiryDate= " + expiryDate +
                "\nbalance= " + balance + "$" +
                "\n}";
    }

}
