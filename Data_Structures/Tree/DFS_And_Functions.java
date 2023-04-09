import java.util.*;

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    TreeNode(int k) {
        key = k;
        left = null;
        right = null;
    }

    void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    void printKdist(TreeNode root, int k) {
        if (root == null)
            return;
        if (k == 0)
            System.out.print(root.key + " ");
        else {
            printKdist(root.left, k - 1);
            printKdist(root.right, k - 1);
        }
    }

    int getMax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
    }

    int getSize(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + getSize(root.left) + getSize(root.right);
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);

        // inorder traversal
        root.inorder(root);

        // height of binary tree
        System.out.println("\nHeight is: " + root.height(root));

        // print nodes at k distance
        int k = 2;
        System.out.print("Nodes at distance " + k + ": ");
        root.printKdist(root, k);
        System.out.println();

        // maximum in binary tree
        System.out.println("Maximum value in the tree: " + root.getMax(root));

        // size of binary tree (number of nodes)
        System.out.println("Size of the tree: " + root.getSize(root));
    }
}
