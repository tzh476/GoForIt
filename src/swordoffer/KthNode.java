package swordoffer;

public class KthNode {
	int pos = 0;
	TreeNode res = null;
	boolean isContine = true;
	TreeNode KthNode(TreeNode pRoot, int k){
		if(pRoot == null)
			return null;
		if(pRoot.left != null && isContine)
			KthNode(pRoot.left, k);
		pos ++;
		if(pos == k){
			isContine = false;
			res = pRoot;
			return res;
		}
		if(pRoot.right != null && isContine)
			KthNode(pRoot.right, k);
        return res;
        
    }
}
