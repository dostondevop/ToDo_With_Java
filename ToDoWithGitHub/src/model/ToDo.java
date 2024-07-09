package model;

import java.util.UUID;

public class ToDo {
    private UUID id;
    private UUID userId;
    private String toDo;
    private boolean isCompleted;

    public ToDo(String toDo) {
        this.id = UUID.randomUUID();
        this.toDo = toDo;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
