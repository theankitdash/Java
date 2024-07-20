
class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class LowestCommonAncestor {
    Node root = null;

    public static void main(String[] args) {
        LowestCommonAncestor obj = new LowestCommonAncestor();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new Node(6);
        obj.root.right.right = new Node(7);

        Node lca = obj.findLCA(obj.root, 4, 5);
        if (lca != null)
            System.out.println("Lowest Common Ancestor: " + lca.key);
        else
            System.out.println("Lowest Common Ancestor not found.");
    }

    Node findLCA(Node p, int n1, int n2) {
        if (p == null)
            return null;

        if (p.key == n1 || p.key == n2)
            return p;

        Node leftLCA = findLCA(p.left, n1, n2);
        Node rightLCA = findLCA(p.right, n1, n2);

        if (leftLCA != null && rightLCA != null)
            return p;

        if (leftLCA != null)
            return leftLCA;
        
        return rightLCA;
    }
}
