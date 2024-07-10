
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " -question:");
            int a = calculate();
            System.out.print("1) " +( a - 2) + "  " + "2)" + ( a - 1) + "  " + "3)" + a + "  " + "4)" + ( a + 1) )  ;
            System.out.println();
            System.out.println("Your answer:" );
            int res = sc.nextInt();
            if(res == a) {
                cnt ++;
            }
        }
        System.out.println(cnt + " out of 10");

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
}