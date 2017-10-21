package swordoffer;

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class TreeDepth {
    public int treeDepth(TreeNode root) {
       if(root == null){
           return 0;
       } 
       if(root.left == null && root.right == null){
           return 1;
       }
        return 1 + Math.max(treeDepth(root.left), treeDepth(root.right));
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}