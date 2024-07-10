package service;


import model.Card;
import model.Transaction;
import model.User;

public class TransactionService {
    public Card checkCard(String cardNumber, User []users) {
        for (User user: users) {
            for (int i = 0; i < user.cards.length; i++) {
                if(cardNumber.equals(user.cards[i].cardNumber)) {
                    return user.cards[i];
                }
            }
        }
        return null;
    }

    public boolean getAvailableCard(User user, double sum){
        int x = 0;
        for (int i=0; i<user.cards.length; i++){
            if(user.cards[i]!=null){
                if(user.cards[i].balance >= sum){
                    System.out.println( (i + 1) + ". " + user.cards[i]);
                    x++;
                }
            }
        }
        return x != 0;
    }



}
