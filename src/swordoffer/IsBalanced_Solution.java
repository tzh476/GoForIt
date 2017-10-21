package swordoffer;

public class IsBalanced_Solution {
	 public boolean IsBalanced_Solution(TreeNode root) {
		 if(root == null)
			 return true;
		 int state = isBalanced_Solution(root);
		 if(state == -1)
			 return false;
		 return true;
	 }

	private int isBalanced_Solution(TreeNode root) {
		 
		int left_high = 0, right_high = 0;
		 
		 if(root.left == null && root.right == null){
			 return 1;
		 }
		 
		 if(root.left != null){
			 left_high = isBalanced_Solution(root.left);
			 if( left_high == -1){
				 return -1;
			 }
		 }
		 if(root.right != null){
			 right_high = isBalanced_Solution(root.right);
			 if( right_high == -1){
				 return -1;
			 }
		 }
		 
		 if (Math.abs(left_high - right_high) > 1){
			 return -1;
		 }
		 
		 return 1 + Math.max(left_high, right_high);
	}
}
