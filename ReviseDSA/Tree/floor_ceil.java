/*
floor of a node is the node that is immediately lesser than the entered node value. 
ceil of a node is the node that is immediately greater than the entered node value.
*/

import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class floor_ceil {
    Node root = null;

    public static void main(String[] args) {
        floor_ceil bst = new floor_ceil();

        Scanner scanner = new Scanner(System.in);

        // Insert nodes
        System.out.print("Enter the number of nodes to insert: ");
        int numNodes = scanner.nextInt();
        System.out.print("Enter the node values: ");
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }

        // Find floor
        System.out.print("Enter the value to find the floor: ");
        int floorValue = scanner.nextInt();
        Node floorNode = bst.findFloor(floorValue);
        if (floorNode != null)
            System.out.println("Floor of " + floorValue + " is: " + floorNode.key);
        else
            System.out.println("No floor node found for " + floorValue);

        // Find ceil
        System.out.print("Enter the value to find the ceil: ");
        int ceilValue = scanner.nextInt();
        Node ceilNode = bst.findCeil(ceilValue);
        if (ceilNode != null)
            System.out.println("Ceil of " + ceilValue + " is: " + ceilNode.key);
        else
            System.out.println("No ceil node found for " + ceilValue);

        scanner.close();
    }

    void insert(int value) {
        root = insertNode(root, value);
    }

    Node insertNode(Node p, int value) {
        if (p == null)
            return new Node(value);

        if (value < p.key)
            p.left = insertNode(p.left, value);
        else if (value > p.key)
            p.right = insertNode(p.right, value);

        return p;
    }

    Node findFloor(int value) {
        return findFloorNode(root, value);
    }

    Node findFloorNode(Node p, int value) {
        Node floorNode = null;

        while (p != null) {
            if (p.key == value) {
                floorNode = p;
                break;
            } else if (p.key > value) {
                p = p.left;
            } else {
                floorNode = p;
                p = p.right;
            }
        }

        return floorNode;
    }

    Node findCeil(int value) {
        return findCeilNode(root, value);
    }

    Node findCeilNode(Node p, int value) {
        Node ceilNode = null;

        while (p != null) {
            if (p.key == value) {
                ceilNode = p;
                break;
            } else if (p.key < value) {
                p = p.right;
            } else {
                ceilNode = p;
                p = p.left;
            }
        }

        return ceilNode;
    }
}
