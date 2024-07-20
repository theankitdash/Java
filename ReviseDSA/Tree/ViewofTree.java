import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class ViewofTree {
    Node root = null;

    public static void main(String[] args) {
        ViewofTree obj = new ViewofTree();

        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.right = new Node(4);
        obj.root.right.left = new Node(5);
        obj.root.right.right = new Node(6);
        obj.root.right.left.left = new Node(7);
        obj.root.right.left.right = new Node(8);

        System.out.println("Top View:");
        obj.printTopView(obj.root);
        System.out.println();

        System.out.println("Bottom View:");
        obj.printBottomView(obj.root);
        System.out.println();

        System.out.println("Left View:");
        obj.printLeftView(obj.root);
        System.out.println();

        System.out.println("Right View:");
        obj.printRightView(obj.root);
        System.out.println();
    }

    void printTopView(Node p) {
        if (p == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<NodePosition> queue = new LinkedList<>();
        queue.add(new NodePosition(p, 0));

        while (!queue.isEmpty()) {
            NodePosition np = queue.poll();
            Node node = np.node;
            int position = np.position;

            if (!map.containsKey(position)) {
                map.put(position, node.key);
                System.out.print(node.key + " ");
            }

            if (node.left != null)
                queue.add(new NodePosition(node.left, position - 1));

            if (node.right != null)
                queue.add(new NodePosition(node.right, position + 1));
        }
    }

    void printBottomView(Node p) {
        if (p == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<NodePosition> queue = new LinkedList<>();
        queue.add(new NodePosition(p, 0));

        while (!queue.isEmpty()) {
            NodePosition np = queue.poll();
            Node node = np.node;
            int position = np.position;

            map.put(position, node.key);

            if (node.left != null)
                queue.add(new NodePosition(node.left, position - 1));

            if (node.right != null)
                queue.add(new NodePosition(node.right, position + 1));
        }

        for (int key : map.values()) {
            System.out.print(key + " ");
        }
    }

    void printLeftView(Node p) {
        if (p == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(p);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 1; i <= size; i++) {
                Node node = queue.poll();

                if (i == 1)
                    System.out.print(node.key + " ");

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }

    void printRightView(Node p) {
        if (p == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(p);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 1; i <= size; i++) {
                Node node = queue.poll();

                if (i == size)
                    System.out.print(node.key + " ");

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }

    static class NodePosition {
        Node node;
        int position;

        public NodePosition(Node node, int position) {
            this.node = node;
            this.position = position;
        }
    }
}

/* 
The printTopView method prints the top view of the binary tree. 
It uses a map to store the horizontal positions of the nodes. 
A queue is used for level order traversal, and for each node, its position is recorded in the map if it is encountered for the first time.

The printBottomView method prints the bottom view of the binary tree. 
It follows a similar approach to the top view, but instead of printing the nodes as encountered, it updates the map with the latest encountered node at each position. Finally, it prints the values of the map in ascending order of positions.

The printLeftView method prints the left view of the binary tree. 
It performs a level order traversal using a queue. At each level, the leftmost node is printed.

The printRightView method prints the right view of the binary tree. 
It also performs a level order traversal but prints the rightmost node at each level.

The NodePosition class is a helper class to store a node along with its horizontal position.

Note: The top-view and bottom-view are printed in a sorted order of positions using a TreeMap. The left-view and right-view are printed as encountered.
 */