import java.lang.Math;

class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int k) {
        key = k;
        left = null;
        right = null;
    }

    public int isBalanced(TreeNode root) {
        if (root == null) return 0;

        int lh = isBalanced(root.left);
        if (lh == -1) return -1;

        int rh = isBalanced(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1) return -1;

        return Math.max(lh, rh) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);

        System.out.println("Is this binary tree height balanced: " + root.isBalanced(root));
    }
}
