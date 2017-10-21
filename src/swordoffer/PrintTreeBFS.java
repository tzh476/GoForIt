package swordoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeBFS {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		
		ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(pRoot != null)
			queue.add(pRoot);
		
		while(!queue.isEmpty()){
			ArrayList<Integer> array = new ArrayList<Integer>();// 保存当前层的所有子节点
			int breadth_num = queue.size(); //当前层的 节点数
			TreeNode treeNode = queue.poll();
			array.add(treeNode.val);
			while(breadth_num != 0){//遍历当前层的所有节点
				if(treeNode.left != null){//当前节点左子节点加入队列
					queue.add(treeNode.left);
				}
				if(treeNode.right != null){//当前节点右节点加入队列
					queue.add(treeNode.right);
				}
				breadth_num--; //表示当前层 节点数 遍历完成一个
				if(breadth_num > 0){ //如果当前层还存在未节点节点，将节点放到该层数组中
					treeNode = queue.poll();
					array.add(treeNode.val);
				}
			}
			res.add(array);
		}
		
		return res;
	    
    }
}
