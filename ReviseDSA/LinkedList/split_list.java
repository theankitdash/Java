package LinkedList;

public class split_list {
    
    // Define a Node class for the linked list
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Initialize the head of the linked list
    Node head;
    
    // Method to split the linked list into two parts based on the middle element
    public void splitList() {
        if (head == null) {
            return; // The list is empty
        }
        
        Node slow = head;
        Node fast = head.next;
        
        // Move the slow pointer one step at a time, and the fast pointer two steps at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // At this point, the slow pointer is pointing to the middle element of the list
        // Split the list into two parts by disconnecting the middle node from the rest of the list
        Node middle = slow;
        Node secondHalf = middle.next;
        middle.next = null;
        
        // Print the two linked lists
        System.out.println("First half:");
        printList(head);
        System.out.println("Second half:");
        printList(secondHalf);
    }
    
    // Method to insert a new node at the end of the linked list
    public void insertNode(int data) {
        Node newNode = new Node(data);
        
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Otherwise, traverse the list to the end and insert the new node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    // Method to print a linked list starting from a given node
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        split_list list = new split_list();
        
        // Insert some nodes into the list
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6);
        list.insertNode(7);
        list.insertNode(8);
        list.insertNode(9);
        list.insertNode(10);
        
        // Print the original list
        System.out.println("Original linked list:");
        list.printList(list.head);
        
        // Split the list into two parts
        list.splitList();
    }
}
