package leetcode;
/**
 * 思路：正确的二叉排序树，中序必定是有序的
 * @author Rail
 *
 */
public class IsValidBST {
	private TreeNode pre = new TreeNode(Integer.MIN_VALUE);
	private boolean isBST = true;
    public boolean isValidBST(TreeNode root) {
    	
    	inOrder(root);
    	
        return isBST;
    }
	private void inOrder(TreeNode root) {
		if(root == null)
			return ;
		if(isBST)			//设置此条件是已证明为非有效二叉树时，剪枝不再递归
			inOrder(root.left);
		if(pre.val >= root.val)
			isBST = false;
		pre = root;
		if(isBST)
		inOrder(root.right);
	}
}
