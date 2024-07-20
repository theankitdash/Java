class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BinaryTree1 {
    Node root = null;

    public static void main(String[] args) {
        BinaryTree1 obj = new BinaryTree1();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);

        System.out.println("Height of the binary tree: " + obj.height(obj.root));
        System.out.println("Diameter of the binary tree: " + obj.diameter(obj.root));
        System.out.println("Number of nodes in the binary tree: " + obj.countNodes(obj.root));
        System.out.println("Number of leaf nodes in the binary tree: " + obj.countLeafNodes(obj.root));
        System.out.println("Distance between nodes 4 and 5: " + obj.distanceBetweenNodes(obj.root, 4, 5));
    }

    int height(Node p) {
        if (p == null)
            return 0;
        else {
            int leftHeight = height(p.left);
            int rightHeight = height(p.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    int diameter(Node p) {
        if (p == null)
            return 0;

        int leftHeight = height(p.left);
        int rightHeight = height(p.right);

        int leftDiameter = diameter(p.left);
        int rightDiameter = diameter(p.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    int countNodes(Node p) {
        if (p == null)
            return 0;
        else
            return 1 + countNodes(p.left) + countNodes(p.right);
    }

    int countLeafNodes(Node p) {
        if (p == null)
            return 0;
        else if (p.left == null && p.right == null)
            return 1;
        else
            return countLeafNodes(p.left) + countLeafNodes(p.right);
    }

    int distanceBetweenNodes(Node p, int node1, int node2) {
        Node lca = findLowestCommonAncestor(p, node1, node2);
        int distance1 = findDistanceFromNode(lca, node1, 0);
        int distance2 = findDistanceFromNode(lca, node2, 0);
        return distance1 + distance2;
    }

    Node findLowestCommonAncestor(Node p, int node1, int node2) {
        if (p == null)
            return null;
        if (p.key == node1 || p.key == node2)
            return p;

        Node leftLCA = findLowestCommonAncestor(p.left, node1, node2);
        Node rightLCA = findLowestCommonAncestor(p.right, node1, node2);

        if (leftLCA != null && rightLCA != null)
            return p;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    int findDistanceFromNode(Node p, int node, int distance) {
        if (p == null)
            return -1;
        if (p.key == node)
            return distance;

        int leftDistance = findDistanceFromNode(p.left, node, distance + 1);
        if (leftDistance != -1)
            return leftDistance;

        int rightDistance = findDistanceFromNode(p.right, node, distance + 1);
        return rightDistance;
    }   
}