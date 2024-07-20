package LinkedList;
import java.util.Scanner;

class singly_advance {

    class Node { 
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node() {
        }
    }

    static Node head;

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void deleteNAfterM(int n, int m) {
        Node curr = head;
        int count;
        
        while (curr != null) {
            for (count = 1; count < n && curr != null; count++) {
                curr = curr.next;
            }
            
            if (curr == null) {
                return;
            }
            
            Node temp = curr.next;
            
            for (count = 1; count <= m && temp != null; count++) {
                Node next = temp.next;
                temp = next;
            }
            
            curr.next = temp;
            curr = temp;
        }
    }

    public Node findNthFromEnd(int n) {
        Node slow = head;
        Node fast = head;
        
        // Move the fast pointer n nodes ahead of the slow pointer
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // The list is shorter than n nodes
            }
            fast = fast.next;
        }
        
        // Move both pointers until the fast pointer reaches the end of the list
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // The slow pointer is now pointing to the nth node from the end
        return slow;
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
    
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        singly_advance list = new singly_advance();
        list.push(10);
        list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        while(true) {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Original Linked list:");
            System.out.println("2:delete N After M: ");
            System.out.println("3:Remove duplicates: ");
            System.out.println("4:Find Nth From End");
            System.out.println("5:Insert in Ending");
            System.out.println("Enter the choice");
            int choice=input.nextInt();
            switch(choice) {
                case 0:
                System.out.println("Exiting the Program"); 
                input.close();
                System.exit(0);
                case 1:
                    list.printList(); 
                    break; 
                case 2:
                    System.out.println("Enter n: ");
                    int n = input.nextInt();
                    System.out.println("Enter m: ");
                    int m = input.nextInt();
                    list.deleteNAfterM(n, m);
                    System.out.println("Linked list after deletion of " + m + " nodes after every " + n + " nodes:");
                    list.printList();
                    break; 
                case 3:
                    list.removeDuplicates();
                    System.out.println("Linked List after removing duplicates:");
                    list.printList();
                case 4:
                    System.out.print("Enter the value of n: ");
                    int k = input.nextInt();
                    Node nthFromEnd = list.findNthFromEnd(k);
                    System.out.println("Node from end: " + nthFromEnd.data);
                    break; 
                case 5:
                    System.out.println("Enter the data for the new node:");
                    int data = input.nextInt();
                    list.insertNode(data);
                    list.printList();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
