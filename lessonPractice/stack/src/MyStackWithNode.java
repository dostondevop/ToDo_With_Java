import javax.swing.*;
import java.util.EmptyStackException;

public class MyStackWithNode {

    private static class Node {
         int data;
         Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node first;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
        }
        node.next=first;
        first=node;
        size++;
    }

    public void peek(int capacity) {

    }

    public void pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Node temp=first;
    }

  /*  public void pop(int capacity) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int capacity = first.capacity;
    }*/
}
