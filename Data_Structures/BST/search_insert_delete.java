import java.util.*;

class Node {
    public int key;
    public Node left;
    public Node right;
    
    public Node(int k) {
        key = k;
        left = null;
        right = null;
    }
}

public class Main {
    public static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (root.key > x) {
            root.left = insert(root.left, x);
        }
        else if (root.key < x) {
            root.right = insert(root.right, x);
        }
        return root;
    }
    
    public static boolean search(Node root, int target) {
        while (root != null) {
            if (root.key == target) {
                return true;
            }
            else if (root.key < target) {
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
        return false;
    }
    
    public static Node getSucc(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left; // left-most(least) node in the right subtree
        }
        return curr;
    }
    
    public static Node delNode(Node root, int x) {
        if (root == null) {
            return null;
        }
        if (root.key > x) {
            root.left = delNode(root.left, x);
        }
        else if (root.key < x) {
            root.right = delNode(root.right, x);
        }
        else {
            if (root.left == null) {
                return root.right;  //only
            }
            else if (root.right == null) {
                return root.left; // one child
            }
            else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
        }
        return root;
    }
    
    public static void main(String[] args) {
        // INSERT in BST
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
    
        // SEARCH in BST
        int target = 40;
        System.out.println(target + " is present: " + search(root, target));
    
        // DELETE in BST
        root = delNode(root, 40);
        System.out.println(target + " is present: " + search(root, target));
    }
}
