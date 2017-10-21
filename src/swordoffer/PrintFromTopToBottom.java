package swordoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 
		 if(root != null)
			 queue.add(root);
		 
		 while(!queue.isEmpty()){
			 TreeNode treeNode = queue.poll();
			 res.add(treeNode.val);
			 if(treeNode.left != null)
				 queue.add(treeNode.left);
			 if(treeNode.right != null)
				 queue.add(treeNode.right);
		 }
		 
		 return res;
    }
}
