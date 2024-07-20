package LinkedList;

public class palindrome_list {
    
    // Define a Node class for the linked list
    class Node {
        char data;
        Node next;
        
        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Initialize the head of the linked list
    Node head;
    
    // Method to check if a linked list is a palindrome
    public boolean isPalindrome() {
        // If the list is empty or contains only one node, it is a palindrome
        if (head == null || head.next == null) {
            return true;
        }
        
        // Reverse the second half of the list
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = slow.next;
        slow.next = null;
        Node prev = null;
        Node current = secondHalf;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;
        
        // Compare the first half of the list with the reversed second half
        Node node1 = head;
        Node node2 = secondHalf;
        while (node1 != null && node2 != null) {
            if (node1.data != node2.data) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        
        return true;
    }
    
    // Method to insert a new node at the end of the linked list
    public void insertNode(char data) {
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
        palindrome_list list = new palindrome_list();
        
        // Insert some nodes into the list
        list.insertNode('r');
        list.insertNode('a');
        list.insertNode('d');
        list.insertNode('a');
        list.insertNode('r');
        
        // Print the original list
        System.out.println("Original linked list:");
        list.printList(list.head);
        
        // Check if the list is a palindrome
        boolean isPalindrome = list.isPalindrome();
        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}

