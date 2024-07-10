package service;

import model.Card;
import model.User;


public class CardService {

    public Card addCard(Card card, User user) { // login qilingan user
        Card[] cards = user.cards;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                return card;
            }
        }
        return null;
    }

    public void listCard(User user) {
        for (Card card: user.cards) {
            if (card != null) {
                System.out.println(card);
            }
        }
    }

    public Card chooseCard(String cardNumberTo, Card []cards) {
        for (Card card: cards) {
            if (card != null) {
                if (card.cardNumber.equals(cardNumberTo)) {
                    return card;
                }
            }
        }
        return null;
    }

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
}
