import model.ToDo;
import model.User;
import service.ToDoService;
import service.UserService;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scStr = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);
    static UserService userService = new UserService();
    static ToDoService toDoService = new ToDoService();

    public static void main(String[] args) {
        int stepCode = 10;
        while (stepCode != 0) {
            System.out.println("1.Register, 2.Login, 0.Exit");
            int stepCode1 = scInt.nextInt();
            switch (stepCode1) {
                case 0 -> stepCode = 0;
                case 1 -> {
                    register();
                }
                case 2 -> {
                    login();
                }
            }
        }
    }

    private static void register() {
        System.out.println("Enter your username: ");
        String username=scStr.nextLine();
        System.out.println("Enter your password: ");
        String password=scStr.nextLine();
        User user = new User(username, password);
        User isAdded = userService.addUser(user);
        if (isAdded!=null) {
            System.out.println("User registered successfully.");
        }
        else {
            System.out.println("User not registered.");
        }
    }

    static void login() {
        System.out.println("Enter username: ");
        String username = scStr.nextLine();
        System.out.println("Enter password: ");
        String password = scStr.nextLine();
        User user = userService.login(username, password);
        if (user != null) {
            System.out.println(username + " is successfully logged in");
            int stepCodeLogin = 10;
            while (stepCodeLogin != 0) {
                System.out.println("1. Add todo, 2.Complete todo, 3.List todo");
                int stepCode2 = scInt.nextInt();
                switch (stepCode2) {
                    case 1 -> {
                        System.out.println("Enter todo: ");
                        String todo = scStr.nextLine();
                        ToDo toDo = new ToDo(todo, user.getId());
                        toDoService.add(toDo);
                    }
                    case 2 -> {
                        System.out.println("Which exercise you want to - 'complete'");
                        List<ToDo> ToDoList = toDoService.getUserToDos(user.getId());
                        for (int i = 0; i < ToDoList.size(); i++) {
                            System.out.println(i + 1 + ": " + ToDoList.get(i).getToDo());
                        }
                        int completeNum = scInt.nextInt();
                        ToDo toDo = ToDoList.get(completeNum  - 1);
                        if (toDoService.complete(toDo)) {
                            System.out.println("Exercise is successfully completed");
                        } else {
                            System.out.println("Exerice is not completed");
                        }
                    }
                    case 3 -> {
                        List<ToDo> ToDoList = toDoService.getUserToDos(user.getId());
                        for (int i = 0; i < ToDoList.size(); i++) {
                            ToDo toDo = ToDoList.get(i);
                            if (toDo.isCompleted()) {
                                System.out.println(i + 1 + ": " + toDo.getToDo() + "✅");
                            } else {
                                System.out.println(i + 1 + ": " + toDo.getToDo());
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println(username + "is exists");
        }
    }
}