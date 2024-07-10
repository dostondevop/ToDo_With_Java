import java.util.Scanner;

public class Main {
    static String usernames[];
    static String passwords[];

    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("how many users: ");
        int usersLen = scannerInt.nextInt();

        usernames = new String[usersLen];
        passwords = new String[usersLen];

        int stepCode = 10;
        while (stepCode != 0) {
            System.out.println("1. Register, 2.Sign In");
            stepCode = scannerInt.nextInt();

            switch (stepCode) {
                case 1 ->  {
                    System.out.print("username: ");
                    String username = scannerStr.nextLine();
                    System.out.print("password: ");
                    String password = scannerStr.nextLine();
                    int register = register(username, password);
                    if (register == 0) {
                        System.out.println(username + " successfully registered");
                    }else if (register == -1){
                        System.out.println(username + " already exists");
                    }else {
                        System.out.println("array is full");
                    }
                }
                case 2 -> {
                    System.out.print("username: ");
                    String username = scannerStr.nextLine();
                    System.out.print("password: ");
                    String password = scannerStr.nextLine();
                    if (signIn(username, password) == 0) {
                        System.out.println(username + " successfully sign in");
                    }else if (signIn(username, password) == -1){
                        System.out.println(username + " already exists");
                    }else {
                        System.out.println("array is full");
                    }
                }
            }
        }

    }

    public static int signIn(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return i;
            }
        }
        return -1;
    }

    public static int register(String username, String password) {
        boolean existUsername = hasUsername(username);
        if (existUsername) {
            return -1;
        }

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i] == null) {
                usernames[i] = username;
                passwords[i] = password;
                return 0;
            }
        }

        return 1; // array is full
    }


    public static boolean hasUsername(String username) {
        for (String s : usernames) {
            if (s != null) {
                if (s.equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

}
