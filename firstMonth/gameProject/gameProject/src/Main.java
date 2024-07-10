import java.util.Scanner;

public class Main {
    static User users[] = new User[10];
    static int index = 0;

    public static void main(String[] args) {
        Scanner ScannerInt = new Scanner(System.in);
        Scanner ScannerStr = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter your username: ");
        user.username = ScannerStr.nextLine();
        register(user);
    }
    public static void register(User user) {
        if (user.username.equals(user.username)) {
            System.out.println("You are already registered");
            return;
        }
        users[index ++] = user;
    }
    public static boolean haseUser(String username) {
        for ( User user : users ){
            if( user != null) {
                if( user.username.equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

}