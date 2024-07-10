package service;

import model.User;

public class UserService {
    public User[] users;
    public int index = 0;

    public UserService(int size){
        this.users = new User[size];
    }

    public User addUser(User user){
        if (hasUser(user.username)) {
            return null;
        }
        this.users[index ++] = user;
        return user;
    }

    public boolean login(String username, String password) {
        for (User user: this.users) {
            if (user != null) {
                if (user.username.equals(username) &&
                        user.password.equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasUser(String username) {
        for (User user : this.users) {
            if (user != null) {
                if (user.username.equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void userList() {
        for (User user: this.users) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }
}
