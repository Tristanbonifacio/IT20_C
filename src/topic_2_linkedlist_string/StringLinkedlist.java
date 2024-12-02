package topic_2_linkedlist_string;

public class StringLinkedlist {

    private Node head;

    // Method to add an element to the linked list
    public void add(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to delete an element by its value
    public void deleteByValue(String value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the value to delete is the first node
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(value)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found in the list.");
        } else {
            temp.next = temp.next.next; // delete the node
        }
    }

    // Method to move or swap nodes at given indexes
    public void moveNodePointer(int index1, int index2) {
        if (head == null || index1 == index2) {
            return;
        }

        Node temp = head;
        Node node1 = null;
        Node node2 = null;
        int i = 0;

        // Find the nodes at index1 and index2
        while (temp != null) {
            if (i == index1) node1 = temp;
            if (i == index2) node2 = temp;
            temp = temp.next;
            i++;
        }

        // Swap the values of the nodes
        if (node1 != null && node2 != null) {
            String tempValue = node1.data;
            node1.data = node2.data;
            node2.data = tempValue;
        }
    }

    // Method to print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Node class to represent each element in the list
    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}
