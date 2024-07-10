public class SimpleQueue {
    private static  int defaultCapacity = 10;
    private Object[] elements;
    public SimpleQueue() {
        this(defaultCapacity);
     //   this.elements = new Object[defaultCapacity];
    }
    public SimpleQueue(int capacity) {
        this.elements = new Object[capacity];
    }
    public boolean enqueue(Object element) {
        elements[index] = element;
        return true;

    }
    public Object dequeue() {
        elements[index] = null;
        return true;
    }
}
