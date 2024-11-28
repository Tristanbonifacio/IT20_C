package topic_4_queue;

import java.util.LinkedList;

/**
 * A simple implementation of a queue for Customer objects.
 * 
 * @author HP
 */
public class Queue {
    
    private final LinkedList<Customer> customers;

    public Queue() {
        customers = new LinkedList<>();
    }
    
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }
    
    public void enqueue(Customer customer) {
        customers.addLast(customer);
        System.out.println(customer.getName() + " has been added to the queue.");
    }
    
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {            
            System.out.print("Current queue: ");
            customers.forEach((customer) -> {
                System.out.print(customer.getName() + " | ");
            });
            System.out.println();
        }
    }
    
    public Customer dequeue() {
        if (!isEmpty()) {
            Customer customer = customers.removeFirst();
            System.out.println(customer.getName() + " has been served.");
            return customer;
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }
    
    public Customer peek() {
        if (!isEmpty()) {
            return customers.getFirst();
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }
}
