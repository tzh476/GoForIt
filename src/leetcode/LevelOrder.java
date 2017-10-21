package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	public ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        
    	if(root == null)
    		return res;
    	
    	Queue<TreeNode> broad_nodes = new LinkedList<TreeNode>();
    	
    	broad_nodes.add(root);
    	ArrayList<Integer> cur = new ArrayList<Integer>();
    	cur.add(root.val);
    	
    	while(!broad_nodes.isEmpty() ){
    		res.add(new ArrayList<Integer>(cur));
    		cur.clear();
    		int broad_size = broad_nodes.size();
    		for(int i = 0; i < broad_size; i++){
    			TreeNode node = broad_nodes.poll();
    			
    			if(node.left != null){
    				broad_nodes.add(node.left);
    				cur.add(node.left.val);
    			}
    			if(node.right != null){
    				broad_nodes.add(node.right);
    				cur.add(node.right.val);
    			}
    		}
    	}
    	
    	return res;
    }
}
