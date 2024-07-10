import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hisobingizni biz bilan to'ldiring!");
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        // labeled loop
        menu:
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                break menu;
                case 1:
                  balance =   fillBalance(balance);
                    break;
                case 2:
                    balance = useMoney(balance);
                    break;
                case 3:
                showBalance(balance);
                    break;
            }
        }
    }

     static int useMoney(int balance) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Qancha pul yechmoqchisiz? ");
         int amount = scanner.nextInt();
         if(balance < amount){
             System.out.println("Mablag' yetarli emas");
             return balance;
         }
         balance -= amount;
         return balance;
    }

    static void showBalance(int balance) {
         System.out.println("Hisobingizda " + balance + " so'm pul bor");
         System.out.println("------------------------------------------");
    }

    static void displayMenu(){
        System.out.println("1. Balans to'ldirish");
        System.out.println("2. Balans yechish");
        System.out.println("3. Balans ko'rish");
        System.out.println();
        System.out.println("0. Dasturdan chiqish!");
        System.out.println("4. Yuqoridagi buyruqlardan birini tanlang: ");
    }
    static int fillBalance(int balance){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qancha pul tashlamoqchisiz: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Hisobingiz muvaffaqiyat to'ldirildi...");
        return balance;
    }
}