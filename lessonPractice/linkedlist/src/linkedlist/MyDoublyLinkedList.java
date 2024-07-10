package linkedlist;

public class MyDoublyLinkedList<T> {
    private static class Node<T> {
        T t;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.t = t;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private  int index = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(T t) {
        Node<T> node = new Node<>(t);
        if (isEmpty()) {
            first = last = node;
            return;
        }

    }
}
