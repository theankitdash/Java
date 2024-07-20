package LinkedList;

public class two_linkedlist {
    
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
    
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // Method to merge two linked lists at alternate positions
    public static two_linkedlist mergeLists(two_linkedlist l1, two_linkedlist l2) {
        two_linkedlist mergedList = new two_linkedlist();
        
        // Traverse both lists simultaneously and add nodes to the merged list
        Node current1 = l1.head;
        Node current2 = l2.head;
        while (current1 != null && current2 != null) {
            mergedList.insertNode(current1.data);
            mergedList.insertNode(current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }
        
        // Add any remaining nodes from the first list to the merged list
        while (current1 != null) {
            mergedList.insertNode(current1.data);
            current1 = current1.next;
        }
        
        // Add any remaining nodes from the second list to the merged list
        while (current2 != null) {
            mergedList.insertNode(current2.data);
            current2 = current2.next;
        }
        
        return mergedList;
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        two_linkedlist l1 = new two_linkedlist();
        l1.insertNode(1);
        l1.insertNode(3);
        l1.insertNode(5);
        l1.insertNode(7);
        System.out.print("List 1: ");
        l1.printList();
        
        two_linkedlist l2 = new two_linkedlist();
        l2.insertNode(2);
        l2.insertNode(4);
        l2.insertNode(6);
        l2.insertNode(8);
        l2.insertNode(10);
        System.out.print("List 2: ");
        l2.printList();
        
        two_linkedlist mergedList = two_linkedlist.mergeLists(l1, l2);
        System.out.print("Merged List: ");
        mergedList.printList();
    }
}