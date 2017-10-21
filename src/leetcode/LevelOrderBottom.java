package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBottom {
	//层次遍历
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
    	if(root == null)
    		return res;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	while(!queue.isEmpty()){
    		int size = queue.size();
    		ArrayList<Integer> list =new ArrayList<Integer>();
    		while(size-- > 0){
    			TreeNode cur = queue.poll();
    			list.add(cur.val);
    			
    			if(cur.left != null)
    				queue.add(cur.left);
    			if(cur.right != null)
    				queue.add(cur.right);
    		}
    		res.add(0, list);
    	}
    	
        return res;
    }
}
