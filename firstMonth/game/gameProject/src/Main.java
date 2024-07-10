import java.util.Random;
import java.util.Scanner;

public class Main {
    static String usernames[];
    static String passwords[];
    static int points[];
    static int currentUser;

    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("how many users: ");
        int usersLen = scannerInt.nextInt();

        usernames = new String[usersLen];
        passwords = new String[usersLen];

        int stepCode = 10;
        while (stepCode != 0) {
            System.out.println("1. Register, 2.Sign In, 3. All results");
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
                    int index = signIn(username);
                    if (index == -1) {
                        System.out.println("username is incorrect");
                    } else  {
                        currentUser = index;
                        String dbPassword = passwords[index];
                        if (dbPassword.equals(password)) {
                            System.out.println("==== WELCOME TO THE GAME ====");
                        }else {
                            System.out.println("wrong password");
                        }
                    }
                    int cnt = 0;
                    Scanner sc = new Scanner(System.in);
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + " - question:");
                        int a = calculate();
                        System.out.print("1) " +( a - 2) + "  " + "2)" + ( a - 1) + "  " + "3)" + a + "  " + "4)" + ( a + 1) )  ;
                        System.out.println();
                        System.out.println("Your answer:" );
                        int res = sc.nextInt();
                        if(res == a) {
                            cnt ++;
                        }
                    }
                    points[currentUser] = cnt;
                    System.out.println(cnt + " out of 3");
                }
                case 3 ->{
                    for (int i = 0; i < usersLen; i++) {
                        System.out.println(usernames[i] + " has " + points[i] + " points out of 3");
                        System.out.println();
                    }
                }
            }
        }
    }

    public static int signIn(String username) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username)) {
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
    public static char getSign() {
        char[] symbols = {'*', '+', '-'};
        Random random = new Random();
        int randomInt = random.nextInt(symbols.length);
        return symbols[randomInt];
    }
    public static byte getRandomNumber() {
        Random random = new Random();
        byte randomInt = (byte) random.nextInt(1, 11);
        return randomInt; // 1 ~ 10
    }
    public static int calculate() {
        int res;
        int a = getRandomNumber();
        int b = getRandomNumber();
        if (getSign() == '+') {
            res = a + b;
            System.out.println(a + " + " + b);
        } else if (getSign() == '-') {
            res = a - b;
            System.out.println(a + " - " + b);
        } else {
            res = a * b;
            System.out.println(a + " * " + b);
        }
        return res;

    }
    /*public static void checkResult() {

    }*/
}
