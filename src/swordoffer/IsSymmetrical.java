package swordoffer;

public class IsSymmetrical {
	boolean isSymmetrical(TreeNode pRoot) {
		boolean res = true;

		if (pRoot == null)
			return true;
		res = isSame(pRoot.left, pRoot.right);
		return res;

	}

	private boolean isSame(TreeNode left_root, TreeNode right_root) {
		boolean isOutsideSame = false;
		boolean isInsideSame = false;
		if ((left_root.left != null && right_root.right == null)||
			(left_root.left == null && right_root.right != null)||
			(left_root.right != null && right_root.left == null)||
			(left_root.right == null && right_root.left != null)||
			 left_root.val != right_root.val) {
			return false;
		} else {
			if (left_root.left != null && right_root.right != null) {
				isOutsideSame = isSame(left_root.left, right_root.right);
			} else if (left_root.left == null && right_root.right == null) {
				isOutsideSame = true;
			}
			if (left_root.right != null && right_root.left != null) {
				isInsideSame = isSame(left_root.right, right_root.left);
			} else if (left_root.right == null && right_root.left == null) {
				isInsideSame = true;
			}
		}

		return isOutsideSame && isInsideSame;
	}
}
