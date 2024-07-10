
import model.Card;
import service.CardService;

import java.util.Scanner;

public class Main {
    static CardService cardService = new CardService();
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static Card currentUser;

    public static void main(String[] args) {
        welcomeCardMenu();
    }

    private static void welcomeCardMenu() {
        while (true) {
            System.out.println("Welcome to Card Service");
            System.out.println("1. Add Card");
            System.out.println("2. Delete Card");
            System.out.println("3. About Card");
            System.out.println("4. Update Card");
            System.out.println("5. Exit");
            System.out.print(" Enter your choice: ");
            int choice = scannerInt.nextInt();
            switch (choice) {
                case 1 -> addCard();
                case 2 -> deleteCard();
                case 3 -> aboutCard();
                case 4 -> updateCard();
                case 5 -> {
                    System.out.println(" Thank you for using this application! ");
                    System.exit(0);
                }
                case 6 -> cardService.viewEmp();
                default -> System.out.println("Please enter valid choice! ");
            }
        }
    }

    private static void addCard() {
        System.out.print("enter a card name: ");
        String cardName = scannerStr.nextLine();
        System.out.print("enter a card number: ");
        String cardNumber = scannerStr.nextLine();
        System.out.print("enter a card expiry date: ");
        String cardExpiryDate = scannerStr.nextLine();
        System.out.print("enter a card password: ");
        String cardPassword = scannerStr.nextLine();
        System.out.print("enter a card balance: ");
        double cardBalance = Double.parseDouble(scannerStr.nextLine());
        Card card = new Card(cardNumber, cardPassword, cardExpiryDate, cardName, cardBalance);
        if (cardService.addCard(card) == -1) {
            System.out.println("Card already exists");
        } else {
            System.out.println("Card successfuly added!");
        }
    }

    private static void deleteCard() {
        System.out.println("Are you sure you want to delete this card? 1/0");
        int choice1 = scannerInt.nextInt();
        if (choice1 == 1) {
            cardService.deleteCard(currentUser.id);
            welcomeCardMenu();
        }
    }

    private static void updateCard() {
        System.out.print("enter a card number: ");
        String cardNumber1 = scannerStr.nextLine();
        System.out.print("enter a card expiry date: ");
        String cardExpiryDate = scannerStr.nextLine();
        System.out.print("enter a card password: ");
        String cardPassow0rd = scannerStr.nextLine();
        if (cardService.hasCard(cardNumber1)) {
            System.out.println("Card already exists");
        } else {
            currentUser.cardPassword = cardPassow0rd;
            currentUser.cardExpiryDate = cardExpiryDate;
            cardService.updateUser(currentUser);
        }
    }

    public static void login() {
        System.out.print("Enter a card number: ");
        String number1 = scannerStr.nextLine();
        System.out.print("Enter a card password: ");
        String password1 = scannerStr.nextLine();
        System.out.println("Enter a card expiry date;");
        String expirydate = scannerStr.nextLine();
        Card card = cardService.login(number1, password1, expirydate);
        if (card == null) {
            System.out.println("User not found ?");
        } else {
            System.out.println("Welcome " + card);
            currentUser = card;
            welcomeCardMenu();
        }
    }

    private static void aboutCard() {
        Card[] card = cardService.getCards();
        int i = 1;
        for (Card card1 : card) {
            if (card1 != null) {
                System.out.println(i++ + " " + "Card " + ": " + card1);
            }
        }
    }
}