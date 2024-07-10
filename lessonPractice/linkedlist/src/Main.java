import linkedlist.MyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(8);

        System.out.println("list: ");
        list.print();

        list.removeFirst();
         System.out.print("removeFirst: ");
        list.print();

        list.removeLast();
        System.out.println("removeLast: ");
        list.print();

    }
}