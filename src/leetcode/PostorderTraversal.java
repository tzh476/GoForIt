package leetcode;

import java.util.ArrayList;

public class PostorderTraversal {
	private ArrayList<Integer> res = new ArrayList<Integer>();
	//非递归
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	
    	if(root == null)
    		return res;
    	postorderTraversal(root.left);
    	
    	postorderTraversal(root.right);
    
    	res.add(root.val);
		return res;
        
    }
    //递归
   /* public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	
    	if(root == null)
    		return res;
    	postorderTraversal(root.left);
    	
    	postorderTraversal(root.right);
    
    	res.add(root.val);
		return res;
        
    }*/
}
