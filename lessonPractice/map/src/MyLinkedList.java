public class MyLinkedList {

    private static class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int index = 0;

    //TODO-> addFirst
    public void addFirst(int val) {
        Node node = new Node(val);
        if (first == null) {
            first = null;
            last = null;
            index++;
            return;
        }
        node.next = first;
        first = node;
        index++;
    }

    //TODO-> addLast
    public void addLast(int val) {
        Node node = new Node(val);
        if (first == null) {
            first = null;
            last = null;
            index++;
            return;
        }
        last.next = node;
        last = node;
        index++;
    }

    //TODO-> removeFirst
    public void removeFirst() {
        if (first == null) {
            return;
        }
        Node temp = first.next;
        first.next = null;
        first = temp;
        index--;
    }

    //TODO-> removeLast
    public void removeLast() {
        if (first == null) {
            return;
        }
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        last = temp;
        index--;
    }

    //TODO -> addIndex(int index);
    public void addIndex(int ind, int value) {
        Node temp = first;
        Node node = new Node(value);
        if (ind == 0) {
            node.next = first;
            first = node;
            index ++;
        }else {
            for (int i = 0; i <= ind; i++) {
                if (i == ind - 1) {
                    node.next = temp.next;
                    temp.next = node;
                    index ++;
                }
                temp = temp.next;
            }
        }
    }

    //TODO -> removeIndex(int index);
    public void removeIndex(int ind) {
        Node temp = first;
        Node help;
        if (ind == 0) {
            temp = first.next;
            temp.next = null;
            first = temp;
            index --;
        }else {
            for (int i = 0; i <= ind; i++) {
                if(i == ind - 1) {
                    help = temp.next.next;
                    temp.next.next = null;
                    temp.next = help;
                    index --;
                }
                temp = temp.next;
            }
        }
    }

    //TODO-> remove(obj);
  /*  public boolean remove(int val) {
            
    }*/

    //TODO-> get(int index);
    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }
}
