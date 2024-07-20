import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root = null;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        Scanner scanner = new Scanner(System.in);

        // Insert nodes
        System.out.print("Enter the number of nodes to insert: ");
        int numNodes = scanner.nextInt();
        System.out.print("Enter the node values: ");
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }

        // Search node
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();
        if (bst.search(searchValue))
            System.out.println("Node " + searchValue + " found in the binary search tree.");
        else
            System.out.println("Node " + searchValue + " not found in the binary search tree.");

        // Insert node
        System.out.print("Enter the value to insert: ");
        int insertValue = scanner.nextInt();
        bst.insert(insertValue);
        System.out.println("Node " + insertValue + " inserted into the binary search tree.");

        // Delete node
        System.out.print("Enter the value to delete: ");
        int deleteValue = scanner.nextInt();
        bst.delete(deleteValue);
        System.out.println("Node " + deleteValue + " deleted from the binary search tree.");

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

    boolean search(int value) {
        return searchNode(root, value);
    }

    boolean searchNode(Node p, int value) {
        if (p == null)
            return false;

        if (value == p.key)
            return true;

        if (value < p.key)
            return searchNode(p.left, value);
        else
            return searchNode(p.right, value);
    }

    void delete(int value) {
        root = deleteNode(root, value);
    }

    Node deleteNode(Node p, int value) {
        if (p == null)
            return null;

        if (value < p.key)
            p.left = deleteNode(p.left, value);
        else if (value > p.key)
            p.right = deleteNode(p.right, value);
        else {
            if (p.left == null)
                return p.right;
            else if (p.right == null)
                return p.left;

            p.key = minValue(p.right);
            p.right = deleteNode(p.right, p.key);
        }

        return p;
    }

    int minValue(Node p) {
        int minVal = p.key;
        while (p.left != null) {
            minVal = p.left.key;
            p = p.left;
        }
        return minVal;
    }
}
