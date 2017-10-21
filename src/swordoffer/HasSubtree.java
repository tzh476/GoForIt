package swordoffer;

public class HasSubtree {
	
	 boolean res = false;
	
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
        	return false;
        }
         
        res = isSubtree(root1,root2);
        
        if(res == true)
        	res = true;
        
        if(res != true && root1.left != null)
        	HasSubtree(root1.left,root2);
        
        if(res != true && root1.right != null)
        	HasSubtree(root1.right,root2);
       
        return res;
    }

	private boolean isSubtree(TreeNode root1, TreeNode root2) {
		if(root2 == null)
			return true;
		if(root1 != null && root2 != null){
			if(root1.val == root2.val){
				return isSubtree( root1.left,  root2.left)
					&isSubtree( root1.right,  root2.right);
			}
		}
		return false;
	}
}
