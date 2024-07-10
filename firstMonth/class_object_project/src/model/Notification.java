package model;

public class Notification {
    public String userFrom;
    public double amount;
    public String cardNumber;
    public int numberOf;
    public double newAmount;


    public String toString() {
        return             "From\t\t\t\t:\t\t" + userFrom + "\n" +
                "Amount\t\t\t\t:\t\t" + amount + "\n" +
                "CardNumber\t\t\t\t:\t\t" + cardNumber + "\n" +
                "Now in your card\t\t\t\t:\t\t" + newAmount + "\n";
    }
}
