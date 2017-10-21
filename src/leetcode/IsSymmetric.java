package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 思路：(树的结点值都为个位数)
	      1
	     / \
	    3   3
	   / \ / \
	  4  5 5  4
	 /\ /\ /\ /\
	9 7 62 26 7 9
  ...
 假如树在一张纸上，对折纸后结点重合，重合处值相等，满足这样的树就是如题所说的“对称”。
 以上图为例：
  以 左3 作为根结点做前序遍历（根、左、右）依次遍历是 
 	            3、4、9、7、5、6、2 （这些元素都在1为根节点左子树）
  以 右3 作为根节点做“对称前序遍历”（根、右、左）依次遍历是
 	   			3、4、9、7、5、6、2 （这些元素都在1为根节点右子树）
 	可以看出如果对称的话 前序遍历 和 “对称前序遍历”（根、右、左）的结果是一样的
 	（如果单单是先序遍历，然后对比该结点是不够的，因为先序遍历确定后，树的形状也可能是不同，故而还需要比较当前结点的左右结点情况）
从而也可以利用
	中序遍历（左、根、右）和“对称中序遍历”（右、根、左）
 或      
 	后序遍历（左、右、根）和“对称后序遍历”（右、左、根）
来解这道题
 * @author Rail
 *
 */
public class IsSymmetric {
	boolean isSame = true;
    public boolean isSymmetric(TreeNode root) {
    	if(root == null)
    		return true;
    	reverse(root.left, root.right);
    	
        return isSame;
    }
	private void reverse(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return ;
		if((left != null && right == null) || (left == null && right != null)
				|| (left.val != right.val)){
			isSame = false;
			return ;
		}else{
			if(isSame){//避免在已经不相同的情况还继续遍历
				reverse(left.left, right.right);
				reverse(left.right, right.left);
			}
		}
	}
	/*非递归
	 * public boolean isSymmetric(TreeNode root) {
    	if(root == null)
    		return true;
    	
    	boolean isMirror = true;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	if(root.left == null || root.right == null){
    		return root.left == root.right;
    	}
    	queue.add(root.left);
    	queue.add(root.right);
    	
    	while(!queue.isEmpty()){
    		int size = queue.size();
    		while(size > 0){
    			TreeNode left = queue.poll();
    			TreeNode right = queue.poll();
    			size -= 2;
    			
    			if((left == null || right == null) && left != right)//不能删除里面的括号，&&优先级高于||
    				return false;
    			if(left == null || right == null)
    				continue;
    			if(left.val != right.val)
    				return false;
    			
    			queue.add(left.left);
    			queue.add(right.right);
    			queue.add(left.right);
    			queue.add(right.left);
    		}
    	}
    	
        return isMirror;
    }*/
}	
