package topic_3_stack;

import java.util.Scanner;

/**
 * Main class for Stack operations
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);

        System.out.println("Hello there!");

        while (true) {
            System.out.println("Choose an option: "
                    + "\n1. Size"
                    + "\n2. Push"
                    + "\n3. Pop"
                    + "\n4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Stack size is: " + stack.size());
                    break;

                case 2:
                    System.out.print("Add a number: ");
                    int num = sc.nextInt();
                    stack.push(num);
                    System.out.println("Pushed value: " + num);
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped element: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty, cannot pop.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Come back and run it again!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println("~~~~~~~~~~~~~~~~~~");
        }
    }
}
