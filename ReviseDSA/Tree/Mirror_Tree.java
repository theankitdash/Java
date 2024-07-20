class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class Mirror_Tree {
    Node root = null;

    public static void main(String[] args) {
        Mirror_Tree obj = new Mirror_Tree();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);

        System.out.println("Original tree:");
        obj.printInorder(obj.root);

        obj.mirrorTree(obj.root);

        System.out.println("\nMirror tree:");
        obj.printInorder(obj.root);
    }

    void mirrorTree(Node p) {
        if (p == null)
            return;

        // Swap the left and right children
        Node temp = p.left;
        p.left = p.right;
        p.right = temp;

        // Recursively mirror the left and right subtrees
        mirrorTree(p.left);
        mirrorTree(p.right);
    }

    void printInorder(Node p) {
        if (p == null)
            return;

        printInorder(p.left);
        System.out.print(p.key + " ");
        printInorder(p.right);
    }
}

