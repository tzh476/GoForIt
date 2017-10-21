package swordoffer;

import java.util.ArrayList;

public class FindPath {
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	if(root == null)
    		return res;
    	Integer root_val = root.val;
    	TreeNode left_node = root.left;
    	TreeNode right_node = root.right;
    	list.add(root_val);
    	
    	target -= root_val;
    	
    	if(target == 0 && left_node == null && right_node == null){
    		res.add(new ArrayList<Integer>(list));
    	}
    	
    	if(left_node != null)
    		FindPath(left_node, target);
    	if(right_node !=null)
    		FindPath(right_node, target);
    	
    	list.remove(list.size() - 1);
		return res;
    }
}
