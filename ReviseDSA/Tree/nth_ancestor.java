
class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class nth_ancestor {
    Node root = null;

    public static void main(String[] args) {
        nth_ancestor obj = new nth_ancestor();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new Node(6);
        obj.root.right.right = new Node(7);

        int n = 2; // nth ancestor
        int nodeValue = 5; // node value to find ancestor for

        Node ancestor = obj.findNthAncestor(obj.root, nodeValue, n);
        if (ancestor != null)
            System.out.println(n + "th Ancestor of " + nodeValue + ": " + ancestor.key);
        else
            System.out.println("Ancestor not found.");
    }

    Node findNthAncestor(Node p, int nodeValue, int n) {
        if (p == null)
            return null;

        if (p.key == nodeValue || n == 0)
            return p;

        Node leftAncestor = findNthAncestor(p.left, nodeValue, n - 1);
        Node rightAncestor = findNthAncestor(p.right, nodeValue, n - 1);

        if (leftAncestor != null)
            return leftAncestor;

        return rightAncestor;
    }
}
