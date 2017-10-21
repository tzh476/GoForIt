package leetcode;
/**
 思路：二叉搜索树是否出现错误结点可以转换为中序遍历的前一个元素是否一直小于当前元素。总共分为下面两种情况：
{0，1}
{2，3，1} 
如果出现前一个结点大于当前结点，将其记录下来即可。
参考 JacobGo！在本回答的答案，非常感谢！
 * @author Rail
 *
 */
public class RecoverSearchTree {
	public static void main(String[] args) {
		TreeNode root =new TreeNode(0);
		root.left = new TreeNode(1);
		RecoverSearchTree test = new RecoverSearchTree();
		test.recoverTree(root);
	}

	private TreeNode firstErrorNode = null;
	private TreeNode secondErrorNode = null;
	private TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int temp = firstErrorNode.val;
        firstErrorNode.val = secondErrorNode.val;
        secondErrorNode.val = temp;
    }
	private void inOrder(TreeNode root) {
		
		if(root == null)
			return;
		
		inOrder(root.left);
		
		if(preNode.val >= root.val ){
				if(firstErrorNode == null){
					firstErrorNode = preNode;
					secondErrorNode = root;
				}else{
					secondErrorNode = root;
				}
		}
		
		//为什么preNode = root可以记录上一个元素
		//因为打印的话是中序遍历的顺序，如果当前执行第一次preNode保存root
		//第二次执行到这句时就是当前root的上一个元素了
		preNode = root;
		
		inOrder(root.right);
		
	}
}
