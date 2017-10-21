package leetcode;

public class BiuldTreeFromInAndPost {
	public static void main(String[] args){
		BiuldTreeFromInAndPost test = new BiuldTreeFromInAndPost();
		test.buildTree(new int[]{1,2,3,4}, new int[]{3,4,2,1});
	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0)
        	return null;
        TreeNode root = biuld(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return root;
    }
	private TreeNode biuld( int[] inorder, int start1, int end1,
			int[] postorder, int start2, int end2) {
		int root_val = postorder[end2];
		TreeNode root = new TreeNode(root_val);
		int i;
		for(i = start1; i < end1; i++){
			if(root_val == inorder[i])
				break;
		}
		if(i - start1 > 0 ){
			root.left = biuld( inorder, start1, i - 1, postorder, start2, start2 + i - 1 - start1);
		}
		if(end1 - i > 0 ){
			root.right = biuld( inorder, i + 1, end1, postorder, end2 - end1 + i, end2 - 1);
		}
		return root;
	}
}
