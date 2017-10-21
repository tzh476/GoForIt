package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSConnectTree {
	public void connect(TreeLinkNode root) {
		if(root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		TreeLinkNode node = new TreeLinkNode(0);
		while(!queue.isEmpty()){
			int broad_size  = queue.size();//每一层 的节点数目
			for(int i = 0; i < broad_size; i++){
				node = queue.poll();
				if(i == broad_size - 1){//若是当前层的最后一个元素手动指向null
					node.next = null;
				}else{
					node.next = queue.peek();
				}
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
		}
		
	}

}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}
