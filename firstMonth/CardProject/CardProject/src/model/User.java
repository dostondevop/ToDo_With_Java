package model;

import java.util.UUID;

public class User {
    public UUID id;
    public String  name;
    public String username;
    public String password;
    public int age;

  public Card card[] = new Card[5];
    public User() {
        this.id = UUID.randomUUID();
    }

    public String toString(){
        return "user {" + "id=" + id + ", name=" + name + ", username=" + username + ", age=" + age + '}';
    }

}
