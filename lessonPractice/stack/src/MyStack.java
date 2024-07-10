import java.util.EmptyStackException;

public class MyStack {
    private int arr[];
    private int top;
    private int size;
    MyStack(int capacity) {
        arr = new int[capacity];
        size = 0;
        top = -1;
    }
    public int push(int n) {
        if (top == arr.length - 1) { // size == arr.length
            throw new IllegalArgumentException("Stack is full");
        }
        arr[ ++ top] = n;
        size ++;
        return n;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size --;
        return arr[top --];
    }

    public int peek() { // arraydagi oxirgi elementni olib beradi
        if (isEmpty()) {
         throw new EmptyStackException();
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1; // bo'sh degani
    }
}
