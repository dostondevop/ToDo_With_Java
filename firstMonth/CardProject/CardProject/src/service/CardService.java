package service;

import model.Card;

import java.util.Scanner;
import java.util.UUID;

public class CardService {
    Card[] cards = new Card[5];
    int count = 0;
    private UUID id;

    public int addCard(Card card) {
        if (hasCard(card.cardNumber)){
            return -1;
        }
        cards[count++] = card;
        return 1;
    }
    public boolean hasCard(String cardNumber) {
        for (Card card : cards) {
            if(card != null) {
                if(card.cardNumber.equals(cardNumber)){
                    return true;
                }
            }
        }
        return false;
    }
    public Card login(String number, String password1,String expiryDate){
        for (Card user : cards) {
            if(user != null) {
                if (user.cardNumber.equals(number)) {
                    return user;
                }
            }
        }
        return null;
    }
    public void updateUser(Card currentUser) {
        for (int i = 0; i < count; i++) {
            if(cards[i] != null) {
                if (cards[i].id.equals(currentUser.id)) {
                    cards[i] = currentUser;
                    return;
                }
            }
        }
    }

    public void deleteCard(UUID id){
        for (int i = 0; i < count; i++) {
            if(cards[i] != null){
                if(cards[i].id.equals(id)){
                    cards[i] = null;
                    return ;
                }
            }
        }
    }
    public Card[] getCards() {
        return cards;
    }
    public void viewEmp(){
        boolean found = false;
        System.out.println("Enter id: ");
        Scanner scanner = new Scanner(System.in);
        String id1 = scanner.nextLine();
        for (Card card : cards){
            if (Card.getId(id) == id){
                System.out.println(card);
                found = true;
            }
        }
        if (!found){
            System.out.println("The card with this id is not present! ");
        }
    }
    public void updateCard(){
        System.out.println("Enter id: ");
        Scanner scanner = new Scanner(System.in);
        String id2 = scanner.nextLine();
        for (Card card : cards){
            if (Card.getId(id) == id){
                System.out.println("enter a card number: ");
                String card11 = scanner.nextLine();
                System.out.println("enter a card password: ");
                String cardPassword1 = scanner.nextLine();
                card.setCardNumber();
            }
        }
    }
}
