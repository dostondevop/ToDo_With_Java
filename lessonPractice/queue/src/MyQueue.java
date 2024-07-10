public class MyQueue {
    private int[] arr;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        size = 0;
        front = 0;
        rear = capacity-1;
    }

    public void enqueue(int val) {
        if (size >= capacity) {
            return;
        }
        this.rear = (this.rear + 1) & capacity ;
        arr[this.rear] = val;
        size ++;
    }
    public int dequeue() {
        if (size <= 0){
            return 0;
        }
        int temp = arr[front];
        this.front = (this.front + 1) % capacity;
        size--;
        return temp;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
}