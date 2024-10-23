
package topic_3_stack;


public class Stack {
    private final int maxSize;
    private final int[] stackArray;
    private int top;

    // Constructor to initialize the stack with a specified size
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Push a value onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Peek at the top value of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        return stackArray[top];
    }

    // Pop the top value off the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }
}
