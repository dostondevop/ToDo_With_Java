package model;

import java.util.UUID;

public class Card {
    public UUID id;
    public String cardName;
    public String cardNumber;
    public String cardPassword;
    public String cardExpiryDate;
    public Double balance;

    public static UUID getId(UUID id) {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName() {
        this.cardNumber = cardName;
    }

    public String getCardNumber() {
        return cardName;
    }

    public void setCardNumber() {
        this.cardNumber = cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword() {
        this.cardPassword = cardPassword;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardName='" + cardName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardPassword='" + cardPassword + '\'' +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Card(String cardNumber, String cardPassword, String cardExpiryDate, String cardName, Double balance) {
        this.id = UUID.randomUUID();
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.cardExpiryDate = cardExpiryDate;
        this.balance = balance;
    }
}
