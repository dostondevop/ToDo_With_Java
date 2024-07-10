import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("1. Ismingizni kiriting: ");
        String name = scanner.nextLine();
        System.out.println("2. Familiyangizni kiriting: ");
        String secondName = scanner.nextLine();
        System.out.println("Yilingizni kiriting: ");
        int year = scannerNum.nextInt();
        System.out.println("Nechinchi kursda o'qisiz?");
        int course = scannerNum.nextInt();
        System.out.println("Qaysi dasturlash tilida ishlaysiz? ");
        String dastur = scanner.nextLine();
        System.out.println("Ism: " + name);
        System.out.println("Familiyangiz: " + secondName);
        System.out.println("Tug'ilgan yilingiz: " + year);
        System.out.println("Siz " + course + "-kursda o'qiysiz");
        System.out.println("Siz " + dastur + " tilida ishlaysiz");
    }
}
