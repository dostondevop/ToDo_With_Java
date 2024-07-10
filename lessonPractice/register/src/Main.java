import model.User;
import service.UserService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static UserService userService = new UserService();

    public static void main(String[] args) {
        int stepCode = 10;
        while (stepCode != 0) {
            System.out.println("1.Register, 2.Login, 0.Exit");
            System.out.print("Enter number: ");
            int stepCode1 = scannerInt.nextInt();
            switch (stepCode1) {
                case 0 -> stepCode = 0;
                case 1 -> register();
                case 2 -> login();
            }
        }
    }
    static void register() {
        System.out.print("Enter name: ");
        String name = scannerStr.nextLine();
        System.out.print("Enter username: ");
        String username = scannerStr.nextLine();
        System.out.print("Enter password: ");
        String password = scannerStr.nextLine();
        User user = new User(name,username,password);
        User user1 = userService.addUser(user);
        if (user1 == null ) {
            System.out.println("Error");
        }else{
            System.out.println("Registered is done!");
        }
    }
    static void login() {
        System.out.print("Enter username: ");
        String username = scannerStr.nextLine();
        System.out.print("Enter password: ");
        String password = scannerStr.nextLine();
        if (userService.login(username,password)){
            System.out.println("Welcome to our programm: " + username);
        }else{
            System.out.println("Login is incorrect!");
        }
    }
}