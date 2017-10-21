package leetcode;

public class IsSameTree {
	//前序遍历
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null)
        	return p == q;
        if(q.val != p.val)
        	return false;
        return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
