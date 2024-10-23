

package topic_3_stack;

import java.util.Scanner;

/**
 * Main class to demonstrate stack operations.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);

        System.out.println("Welcome to the Stack Operations!");

        while (true) {
            System.out.println("Choose an option: "
                    + "\n1. Check Size"
                    + "\n2. Push Element"
                    + "\n3. Pop Element"
                    + "\n4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current stack size: " + stack.size());
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                    break;
                case 2:
                    if (stack.isFull()) {
                        System.out.println("Stack is full! Cannot push more elements.");
                    } else {
                        System.out.print("Enter a number to push: ");
                        int num = sc.nextInt();
                        stack.push(num);
                        System.out.println("Pushed value: " + num);
                        System.out.println("~~~~~~~~~~~~~~~~~~");
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty! Cannot pop elements.");
                    } else {
                        System.out.println("Popped element: " + stack.pop());
                        System.out.println("~~~~~~~~~~~~~~~~~~");
                    }
                    break;
                case 4:
                    System.out.println("Thank you! Come back to use the stack again.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
