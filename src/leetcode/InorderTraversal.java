package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
	ArrayList<Integer> res = new ArrayList<Integer>();
	//非递归
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		if(root == null)
			return res;
		
    	Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pos = root;
    	while(!stack.empty() || pos != null){
			
			while(pos != null){
				stack.add(pos);
				pos = pos.left;
			}
			pos = stack.pop();
			res.add(pos.val);
			pos = pos.right;
		}
        return res;
    }
	
	//递归
	/*
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
    	if(root == null)
    		return res;
    	inorderTraversal(root.left);
    	res.add(root.val);
    	inorderTraversal(root.right);
    	return res;
        
    }*/
}
