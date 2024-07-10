package service;

import model.User;

import java.util.ArrayList;

public class UserService {
    ArrayList<User> users = new ArrayList<>();

    //TODO -> addUser();
    public User addUser(User user) {
        if (!hasUser(user.getUsername())) {
            users.add(user);
            return user;
        }
        return null;
    }

    // TODO -> hasUser();
    public boolean hasUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    //TODO-> login();
    public boolean login(String username, String password) {
        for(User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    //TODO -> list();

    public ArrayList<User> list() {
        return users;
    }
}

