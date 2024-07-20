
class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class IdenticalTree {
    Node root = null;

    public static void main(String[] args) {
        IdenticalTree obj1 = new IdenticalTree();
        IdenticalTree obj2 = new IdenticalTree();

        obj1.root = new Node(1);
        obj1.root.left = new Node(2);
        obj1.root.right = new Node(3);
        obj1.root.left.left = new Node(4);
        obj1.root.left.right = new Node(5);

        obj2.root = new Node(1);
        obj2.root.left = new Node(2);
        obj2.root.right = new Node(3);
        obj2.root.left.left = new Node(4);
        obj2.root.left.right = new Node(5);

        if (obj1.isIdentical(obj1.root, obj2.root))
            System.out.println("The two trees are identical.");
        else
            System.out.println("The two trees are not identical.");
    }

    boolean isIdentical(Node p, Node q) {
        if (p == null && q == null)
            return true;

        if (p != null && q != null) {
            return (p.key == q.key && isIdentical(p.left, q.left) && isIdentical(p.right, q.right));
        }

        return false;
    }
}

