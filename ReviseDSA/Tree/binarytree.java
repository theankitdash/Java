import java.util.*; 

class Node{
    
    int key;
    Node left, right;

    public Node(int key){
        
        this.key=key;
        left=right=null;
    }

    
}
public class binarytree {
    
    Node root=null;

    public static void main(String[] args) {
        binarytree obj = new binarytree();
        
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);

		System.out.println("Preorder traversal");
		obj.preorder(obj.root);

		System.out.println("\nInorder traversal");
		obj.inorder(obj.root);

		System.out.println("\nPostorder traversal");
		obj.postorder(obj.root);

        System.out.println("\nLevel order traversal");
        obj.levelOrder(obj.root);
    }

    

    void postorder(Node p){
        
        if(p==null)
            return;
        postorder(p.left);
        postorder(p.right);
        System.out.println(p.key+ " ");
    }   

    void inorder(Node p){
    
        if(p==null)
            return;
        inorder(p.left);
        System.out.println(p.key+ " ");
        inorder(p.right);
    }
    
    void preorder(Node p){
    
        if(p==null)
            return;
        System.out.println(p.key+ " ");
        preorder(p.left);
        preorder(p.right);
    }

    void levelOrder(Node p) {
        if (p == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(p);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.key + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
        }
    }
}
