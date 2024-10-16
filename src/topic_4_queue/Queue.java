package topic_4_queue;
import java.util.LinkedList;

public class Queue {
	private LinkedList<Customer> customers;

    public Queue() {
        customers = new LinkedList<>();
    }
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }
    
   