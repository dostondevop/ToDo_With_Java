package linkedlist;

public class MyLinkedList {

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int index = 0;


    public void addFirst(int val) {
        Node node = new Node(val);

        if (first == null) {
            first = node;
            last = node;
            index ++;
            return;
        }

        node.next = first;
        first = node;
        index ++;
    }

    public void addLast(int val) {
        Node node = new Node(val);

        if (first == null) {
            first = node;
            last = node;
            index ++;
            return;
        }

        last.next = node;
        last = node;
        index ++;
    }

    public void removeFirst() {
        if (first == null) {
            return;
        }
//        first = first.next;
        Node temp = first.next;
        first.next = null;
        first = temp;
        index--;
    }

    public void removeLast() {
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        last = temp;
        index --;
    }
    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
