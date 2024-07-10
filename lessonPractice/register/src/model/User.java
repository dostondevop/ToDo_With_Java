package model;

import java.util.UUID;

public class User {
   private UUID id;
   private String name;
   private String username;
   private String password;

    public User() {
        this.id = UUID.randomUUID();
    }

    public User(String name, String username,String password) {
        this();
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
