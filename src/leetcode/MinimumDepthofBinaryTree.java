package leetcode;

public class MinimumDepthofBinaryTree {

    public int run(TreeNode root) {
    	if(root == null)
    		return 0;
    	minimumDepth(root);
    	
		return 0;
        
    }
	
	private int minimumDepth(TreeNode root) {
		if(root.left == null && root.right == null){
			return 1;
		}
		if(root.left == null)
			return 1 + minimumDepth(root.right);
		if(root.right == null)
			return 1 + minimumDepth(root.left);
		return 1+Math.min(minimumDepth(root.left), minimumDepth(root.right));
	}

	public static void main(String[] args){
		MinimumDepthofBinaryTree min = new MinimumDepthofBinaryTree();
		TreeNode root = new TreeNode(0);
		System.out.println(min.minimumDepth(root));
	}
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
   TreeNode(int x) { val = x; }}
