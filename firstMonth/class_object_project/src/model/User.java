package model;

import java.util.UUID;

public class User {
    public UUID id;
    public String name;
    public int age;
    public String username;
    public String password;
    public Card[] cards;
    public Notification[] notifications;
    public int notifyNumber = 0;

    public String toString() {
        return "User: {" + "\n" +
                "id= " + id +
                "\nname= " + name +
                "\nage= " + age +
                "\nusername= " + username +
                "\npassword= " + password +
                "\n}";
    }
}
