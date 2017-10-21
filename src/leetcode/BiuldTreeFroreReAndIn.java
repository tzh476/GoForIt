package leetcode;

public class BiuldTreeFroreReAndIn {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if(preorder == null || preorder.length == 0){
    		return null;
    	}
    	return biuld(preorder, 0, preorder.length - 1,inorder, 0, inorder.length - 1);
    }

	private TreeNode biuld(int[] preorder, int start1, int end1, int[] inorder, int start2,
			int end2) {
		int root_val = preorder[start1];
		TreeNode root = new TreeNode(root_val);
		int mid;
		for(mid = start2; mid < end2; mid ++){
			if(inorder[mid] == root_val)
				break;
		}
		
		int left_num = mid - start2;//左子树节点数目
		int right_num = end2 - mid;//右子树节点数目
		
		if(left_num > 0){
			root.left = biuld(preorder, start1 + 1, start1 + left_num, inorder, start2, mid - 1);
		}
		if(right_num > 0){
			root.right = biuld(preorder, start1 + left_num + 1, end1, inorder, mid + 1, end2);
		}
		
		return root;
	}
}
