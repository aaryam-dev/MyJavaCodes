import java.util.*;

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int k) {
        key = k;
        left = null;
        right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
    }
}
