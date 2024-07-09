package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<User>();

    public User addUser(User user) {
        users.add(user);
        return user;
    }

    public List<User> getUsers() {
        return users;
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
