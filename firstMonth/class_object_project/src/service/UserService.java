package service;

import model.Card;
import model.User;

public class UserService {
    public User[] users;
    public static int index = 0;

    public UserService(int size) {
        this.users = new User[size];

    }

    public User addUser(User user, int cardSize) {
        if (hasUser(user.username)) {
            return null;
        } else {
            user.cards = new Card[cardSize];
            this.users[index++] = user;
            return user;
        }
    }


    public User login(String username, String password) {
        for (User user : users) {
            if (user != null) {
                if (user.username.equals(username) &&
                        user.password.equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }

    public boolean hasUser(String username) {
        for (User user : users) {
            if (user != null) {
                if (user.username.equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void userList() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i]);
            }
        }
    }

    public User check(String cardNumber) {
        for (User user: users) {
            if(user != null) {
                for (int i = 0; i < user.cards.length; i++) {
                    if (user.cards[i] != null) {
                        if (cardNumber.equals(user.cards[i].cardNumber)) {
                            return user;
                        }
                    }
                }
            }
        }
        return null;
    }

}
