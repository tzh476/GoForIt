package leetcode;

public class PathSum {
	boolean isFound = false;
	
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root == null){
    		return false;
    	}
        preOder(root, sum, 0);
        return isFound;
    }
	private void preOder(TreeNode root, int sum, int path_sum) {
		if(root == null)
			return ;
		path_sum += root.val;
		if(root.left == null && root.right == null){
			if(sum == path_sum){
				isFound = true;
			}
		}
		preOder(root.left, sum, path_sum);
		preOder(root.right, sum, path_sum);
		 
	}
}
