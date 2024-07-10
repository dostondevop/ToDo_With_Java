import model.Card;
import model.User;
import service.CardService;
import service.NotificationService;
import service.TransactionService;
import service.UserService;
import model.Notification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("enter users");
        int size = scannerInt.nextInt();

        UserService userService = new UserService(size); // arg constructor

        int stepCode = 90;
        while (stepCode != 0) {

            System.out.println("1. register, 2. login, 3. user list 0. exit");
            stepCode = scannerInt.nextInt();
            switch (stepCode) {
                case 1 -> {
                    User user = new User(); // model
                    System.out.println("enter username");
                    user.username = scannerStr.nextLine();
                    System.out.println("enter password");
                    user.password = scannerStr.nextLine();
                    System.out.println("enter age");
                    user.age = scannerInt.nextInt();
                    System.out.println("enter name");
                    user.name = scannerStr.nextLine();
                    System.out.println("how many cards");
                    int cardSize = scannerInt.nextInt();

                    User user1 = userService.addUser(user, cardSize);

                    if (user1 == null) {
                        System.out.println("user already exists");
                    } else {
                        System.out.println(user1.username + " user successfully added");
                    }

                }
                case 2 -> {
                    System.out.println("enter username");
                    String username = scannerStr.nextLine();
                    System.out.println("enter password");
                    String password = scannerStr.nextLine();
                    User login = userService.login(username, password);
                    if (login != null) {
                        System.out.println("user logged in");
                        int nextStep = 95;
                        CardService cardService = new CardService();
                        while (nextStep != 0) {


                            System.out.println("1.Add card,   2.Card List, 3.Add money,  4. Change password, 5.Transfer money,  6.Notification, " + login.notifyNumber + " 7.Message, 8.Delete user, 9.Delete card");
                            nextStep = scannerInt.nextInt();
                            switch (nextStep) {
                                case 1 -> {
                                    Card card = new Card();
                                    System.out.println("enter card name");
                                    card.name = scannerStr.nextLine();
                                    System.out.println("enter card number (16-digit number)");
                                    card.cardNumber = scannerStr.nextLine();
                                    System.out.println("enter card expiry");
                                    card.expiryDate = scannerStr.nextLine();
                                    System.out.println("enter card password");
                                    card.password = scannerStr.nextLine();
                                    System.out.println("enter card balance");
                                    card.balance = scannerInt.nextInt();
                                    System.out.println("the card successfully added");
                                    cardService.addCard(card, login);
                                }

                                case 2 -> {
                                    cardService.listCard(login);
                                }
                                case 3 -> {
                                    System.out.println("Karta tartib raqami orqali karta tanlang");


                                    for (int i = 0; i < login.cards.length; i++) {
                                        if (login.cards[i] != null)
                                            System.out.println(i + 1 + ". ---" + login.cards[i].cardNumber + "--- " + login.cards[i].name);
                                    }
                                    int n = scannerInt.nextInt();
                                    String passwordn = "";
                                    while(!passwordn.equals("q")) {
                                        System.out.println("parolni kiriting. q to quit");
                                        passwordn = scannerStr.nextLine();
                                        if (passwordn.equals(login.cards[n - 1].password)) {
                                            System.out.println("summani kiriting");
                                            int sum = scannerInt.nextInt();
                                            login.cards[n - 1].balance += sum;
                                            System.out.println(sum + " muvofaqiyatli qo'shildi. " + login.cards[n - 1].name + " ning balansi   :   " + login.cards[n - 1].balance);
                                            break;
                                        }else System.out.println(" parol noto'g'ri!!!");
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Karta tartib raqami orqali karta tanlang");
                                    for (int i = 0; i < login.cards.length; i++) {
                                        if (login.cards[i] != null)
                                            System.out.println(i + 1 + ". ---" + login.cards[i].cardNumber + "--- " + login.cards[i].name);
                                    }
                                    int n = scannerInt.nextInt();
                                    String passwordn = "";
                                    while(!passwordn.equals("q")) {
                                        System.out.println("parolni kiriting. q to quit");
                                        passwordn = scannerStr.nextLine();
                                        if (passwordn.equals(login.cards[n - 1].password)) {
                                            System.out.println("Yangi parolni kiriting :");
                                            login.cards[n - 1].password = scannerStr.nextLine();
                                            System.out.println("Password successfully changed ");
                                            break;
                                        }else System.out.println("Password is wrong ! ! !");
                                    }
                                }
                                case 5 -> {
                                    String cardNumberTo = "";
                                    while (!cardNumberTo.equals("q")) {
                                        TransactionService transactionService = new TransactionService();
                                        System.out.println("Enter the card number to send money : 'q' to quit");
                                        cardNumberTo = scannerStr.nextLine();
                                        if (cardNumberTo.equals("q")) break;
                                        User userTo = userService.check(cardNumberTo);
                                        if (userTo == null) {
                                            System.out.println("Bunday karta mavjud emas ");
                                            continue;


                                        } else
                                            System.out.println(userTo.username);
                                        System.out.println("Enter amount   : ");
                                        double sum = scannerInt.nextInt();
                                        boolean checkCards = transactionService.getAvailableCard(login, sum);
                                        if (!checkCards) {
                                            System.out.println("Kartalarda yetarli mablag' mavjud emas ");
                                            continue;
                                        }

                                        System.out.println("enter the card naumber   :");
                                        String cardNumberFrom = scannerStr.nextLine();
                                        cardService.chooseCard(cardNumberFrom, login.cards);
                                        transactionService.checkCard(cardNumberTo, userService.users);
                                        if (cardService.chooseCard(cardNumberFrom, login.cards) != null) {
                                            cardService.chooseCard(cardNumberFrom, login.cards).balance -= sum;
                                            transactionService.checkCard(cardNumberTo, userService.users).balance += sum;
                                            System.out.println("amaliyot muvofaqiyatli amalga oshirildi");
                                            Notification notification = new Notification();
                                            notification.userFrom = login.name;
                                            notification.cardNumber = cardNumberFrom;
                                            notification.amount = sum;
                                            notification.newAmount = transactionService.checkCard(cardNumberTo, userService.users).balance + sum;
                                            NotificationService addNotification = new NotificationService();
                                            addNotification.addNotification(notification, userTo);
                                        }
                                    }

                                }
                                case 6 -> {
                                    for (int i = 0; i < login.notifyNumber; i++) {
                                        System.out.println(login.notifications[i].toString());
                                    }
                                    login.notifyNumber = 0;
                                    login.notifications = new Notification[10];
                                }
                                case 7 -> {

                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    userService.userList();
                }
            }
        }
    }
}
