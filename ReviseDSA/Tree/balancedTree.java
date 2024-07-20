class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class balancedTree {
    Node root = null;

    public static void main(String[] args) {
        balancedTree obj = new balancedTree();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);

        if (obj.isBalanced(obj.root))
            System.out.println("The binary tree is balanced.");
        else
            System.out.println("The binary tree is not balanced.");
    }

    boolean isBalanced(Node p) {
        if (p == null)
            return true;

        int leftHeight = height(p.left);
        int rightHeight = height(p.right);

        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;

        return isBalanced(p.left) && isBalanced(p.right);
    }

    int height(Node p) {
        if (p == null)
            return 0;

        int leftHeight = height(p.left);
        int rightHeight = height(p.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
