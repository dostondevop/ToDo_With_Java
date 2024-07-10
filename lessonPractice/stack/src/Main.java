import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        /*tack.push("A");
        stack.push("B");

        System.out.println(stack);
        System.out.println(stack.peek());*/

        // oxirgi elementini o'chirib oladi stack.pop()
        MyStack myStack = new MyStack(10);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.push(12222));
    }
}