package leetcode;

public class IsBalanced {
	private boolean isBal = true;
	public boolean isBalanced(TreeNode root){
		isBalan(root);
		return isBal;
	}
	private int isBalan(TreeNode root) {
		if(root == null)
			return 0;
		int left = isBalan(root.left);
		int right = isBalan(root.right);
		if(Math.abs(right -left) > 1){
			isBal = false;
		}
		return 1 + Math.max(left, right);
	}
}
