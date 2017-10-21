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
public class Mirror {
	public void Mirror(TreeNode root) {
        if(root == null) 
        	return ;
        TreeNode treeNode = root.left;
        root.left = root.right;
        root.right = treeNode;
        Mirror(root.left);
        Mirror(root.right);
    }
}
