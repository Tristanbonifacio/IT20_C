package topic_4_queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue customerQueue = new Queue();

        System.out.println("Welcome to the Customer Queue System!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            /* Adding customers to the queue
             customerQueue.enqueue(new Customer("Joshua Eviota"));
             customerQueue.enqueue(new Customer("Dexter Silvnna"));
             customerQueue.enqueue(new Customer("Lyle subesa ));
	     
             System.out.println();
             customerQueue.displayQueue();
	     
             // Serve 
             customerQueue.dequeue();
	     
             System.out.println();
             customerQueue.displayQueue();
             */
            switch (choice) {
                case "1":
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();
                    customerQueue.enqueue(new Customer(customerName));
                    break;

                case "2":
                    customerQueue.dequeue();
                    break;

                case "3":
                    customerQueue.displayQueue();
                    break;

                case "4":
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close(); // Close the scanner
                    return; // Exit the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
    }
}