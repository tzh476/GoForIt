package swordoffer;

public class ReConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		int start = 0, end = pre.length - 1;
		int rootValue = pre[0];
		TreeNode root = new TreeNode(rootValue);
		conBinaryTreeByPreAndIn(root, pre, in, start, end, start, end);

		return root;

	}

	private TreeNode conBinaryTreeByPreAndIn(TreeNode root, int[] pre, int[] in, int pre_start,
			int pre_end, int in_start, int in_end) {
		
		int i, in_pos = 0;
		// 找到先序中第一个元素在中序中的下标pos
		for (i = in_start; i <= in_end; i++) {
			if (in[i] == root.val) {
				in_pos = i;
				break;
			}
		}
		TreeNode leftNode = null, rightNode = null;
		int left_num = in_pos-in_start;//左子树数目
		
		// 当前根节点存在左子树
		if (in_pos > in_start) {
			leftNode = new TreeNode(pre[pre_start + 1]);
			root.left = leftNode;
		}
		// 当前根节点存在右子树
		if (in_pos < in_end) {
			rightNode = new TreeNode(pre[pre_start+(left_num+1)]);
			root.right = rightNode;
		}
		
		// 根节点左边子节点数大于1
		if (in_pos - in_start > 1) {
			conBinaryTreeByPreAndIn(leftNode, pre, in, pre_start + 1, pre_start + left_num,
					                         in_start , in_pos - 1);
		}
		// 根节点右边子节点数大于1
		if (in_end - in_pos > 1) {
			conBinaryTreeByPreAndIn(rightNode, pre, in, pre_start + left_num + 1, pre_end,
											 in_pos + 1, in_end);
		}
		return root;
	}
}
