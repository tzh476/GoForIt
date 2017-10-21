package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigzagLevelOrder {
	ArrayList<ArrayList<Integer>> res =new ArrayList<ArrayList<Integer>>();
	/**
	 * bfs，用isOrder来控制顺序还是逆序
	 */
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
        	return res;
        Queue<TreeNode> q =new LinkedList<TreeNode>();
        q.add(root);
        boolean  isOrder = true;
        while(!q.isEmpty()){
        	
        	int size =q.size();
        	ArrayList<Integer> list =new ArrayList<Integer>();
        	while(size-- > 0){
        		TreeNode cur = q.poll();
        		if(isOrder)
        			list.add(cur.val);
        		else
        			list.add(0,cur.val);
        		
        		if(cur.left != null)
        			q.add(cur.left);
        		if(cur.right != null)
        			q.add(cur.right);
        	}
        	res.add(list);
        	isOrder = !isOrder;
        }
        return res;
    }
}
