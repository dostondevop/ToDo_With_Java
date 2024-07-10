public class MyQueueWithLinkedList {
    public static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node first;
    private Node last;
    private int index = 0;

    /*public void enqueue(int val) { // add
        Node node = new Node(val);
        if (first == null) {
            first = last = node;
            index ++;
            return;
        }
         .next = node;
        last = node;
        index ++;
    }*/

    public int dequeue() { //
        Node temp = first;
        first =  first.next;
        temp.next = null;

        return temp.val;
    }

    public int size() {
        return index;
    }
}
