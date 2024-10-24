package topic_3_stack_calculator;

public class Stack {
    private final int[] arr;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1; 
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= arr.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Cannot push " + value + "; stack is full.");
            return;
        }
        arr[++top] = value;
    }

    public int peek() {
        return isEmpty() ? -1 : arr[top];
    }

    public int pop() {
        return isEmpty() ? -1 : arr[top--];
    }
}
