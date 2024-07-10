import model.Deptor;
import model.History;
import service.DeptorService;
import service.HistoryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptorService deptorService = new DeptorService();
        HistoryService historyService = new HistoryService(deptorService);
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        int stepCode = 10;
        while (stepCode != 0) {
            System.out.println("1.Add Dept, 2.Reduce Dept, 3.List Dept, 4.History");
            stepCode = scannerInt.nextInt();
            switch (stepCode) {
                case 1 -> {
                    Deptor deptor = new Deptor();
                    System.out.println("Enter name: ");
                    deptor.setName(scannerStr.nextLine());
                    System.out.println("Enter amount: ");
                    deptor.setAmount(scannerInt.nextDouble());
                    if (deptorService.hasName(deptor.getName())) {
                        Deptor deptor1 = deptorService.addAmount(deptor);
                        History history = new History();
                        history.setAmount(deptor.getAmount());
                        history.setS(true);
                        historyService.addHistory(history, deptor.getName());
                        System.out.println("your dept: " + deptor1.getAmount());
                    } else {
                        Deptor deptor1 = deptorService.addDept(deptor);
                        System.out.println("your dept: " + deptor1.getAmount());
                    }

                }
                case 2 -> {
                    Deptor deptor = new Deptor();
                    System.out.println("Enter name: ");
                    deptor.setName(scannerStr.nextLine());
                    System.out.println("Enter amount: ");
                    deptor.setAmount(scannerInt.nextDouble());
                    if (deptorService.hasName(deptor.getName())) {
                        Deptor deptor1 = deptorService.reduceDept(deptor);
                        History history = new History();
                        history.setAmount(deptor.getAmount());
                        history.setS(false);
                        historyService.addHistory(history, deptor.getName());
                        System.out.println("your dept: " + deptor1.getAmount());
                    } else {
                        System.out.println("There is no like this man");
                    }
                }
                case 3 -> {
                    Deptor[] deptors = deptorService.listDept();
                    for (int i = 0; i < deptors.length; i++) {
                        if (deptors[i] != null) {
                            System.out.println(deptors[i]);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Enter your name: ");
                    String name1 = scannerStr.nextLine();
                    Deptor deptor = deptorService.getDeptorByName(name1);
                    if (deptor != null) {
                        History[] histories = historyService.listHistory(deptor);
                        for (History history : histories) {
                            if (history != null) {
                                System.out.println(history);
                            }
                        }
                    } else {
                        System.out.println("There is no like this deptor");
                    }

                }

            }


        }
    }
}