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

class Main {
    public static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }

        if (root.key > x) {
            root.left = insert(root.left, x);
        } else if (root.key < x) {
            root.right = insert(root.right, x);
        }

        return root;
    }

    public static boolean isBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        return (root.key > min && root.key < max && isBST(root.left, min, root.key) && isBST(root.right, root.key, max));
    }

    public static void main(String[] args) {
        Node root = null;

        // INSERT in BST
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);

        System.out.println("BST? : " + isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
