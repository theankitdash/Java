/*
Children sum property is a property of a binary tree, in which the sum of the value of left
child and right child is equal to their parent node. If only one child is present, then its
value should be equal to its parent node.
 */

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class childrenSumProperty {
    Node root = null;

    public static void main(String[] args) {
        childrenSumProperty obj = new childrenSumProperty();

        obj.root = new Node(10);
        obj.root.left = new Node(8);
        obj.root.right = new Node(2);
        obj.root.left.left = new Node(3);
        obj.root.left.right = new Node(5);
        obj.root.right.right = new Node(2);

        if (obj.isChildrenSumProperty(obj.root))
            System.out.println("The binary tree follows the Children Sum property.");
        else
            System.out.println("The binary tree does not follow the Children Sum property.");
    }

    boolean isChildrenSumProperty(Node p) {
        if (p == null)
            return true;

        if (p.left == null && p.right == null)
            return true;

        int leftValue = (p.left != null) ? p.left.key : 0;
        int rightValue = (p.right != null) ? p.right.key : 0;

        if (p.key == leftValue + rightValue && isChildrenSumProperty(p.left) && isChildrenSumProperty(p.right))
            return true;

        return false;
    }
}

