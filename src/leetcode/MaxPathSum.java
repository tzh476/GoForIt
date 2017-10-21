package leetcode;

public class MaxPathSum {
	private int max_value;
    public int maxPathSum(TreeNode root) {
        max_value = Integer.MIN_VALUE;
    	preOrder(root);
    	
    	return max_value;
    }
	private int preOrder(TreeNode root) {
		if(root == null)
			return 0;
		int left = Math.max(0, preOrder(root.left));
		int right = Math.max(0, preOrder(root.right)) ;
		max_value = Math.max(root.val + left + right, max_value);
		return root.val + Math.max(left , right);
	}
}	
