package service;

import model.ToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ToDoService {
    List<ToDo> list = new ArrayList<ToDo>();

    public ToDo add(ToDo todo) {
        list.add(todo);
        return todo;
    }

    public List<ToDo> getList() {
        return list;
    }

    public boolean complete(ToDo todo) {
        for (ToDo todo1 : list) {
            if (todo1.getId().equals(todo.getId())) {
                todo1.setCompleted(true);
                return true;
            }
        }
        return false;
    }

    public List<ToDo> getUserToDos(UUID UserId) {
        return null;
    }
}
