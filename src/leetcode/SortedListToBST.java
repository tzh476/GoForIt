package leetcode;

public class SortedListToBST {
public TreeNode sortedListToBST(ListNode head) {
        
    	return binary(head);
    }
    /**
	 * 思路：找出当前链中间的元素作为二叉树的根结点
	 * 断开链表
	 * 在 左链表 重复得到左结点；
	 * 在 右链表 重复得到左结点；
	 */
	private TreeNode binary(ListNode head) {
		if(head == null)
			return null;
		if(head.next == null) return new TreeNode(head.val);
		//如果单单找Mid的话，是无法设置链表的这个地方为空的，画一下内存情况就知道了
		ListNode preMid = findPreMid(head);
		ListNode mid = preMid.next;
		
		TreeNode root = new TreeNode(mid.val);
		ListNode left_head = head;
		ListNode right_head = mid.next;
		
		preMid.next = null;
		root.left = binary(left_head);
		root.right = binary(right_head);
		
		return root;
	}
	/**
	 * 通过快慢指针找出中间结点
	 */
	private ListNode findPreMid(ListNode head) {
		ListNode mid = head;
		ListNode end = head;
		ListNode preMid = head;
		while(end != null && end.next != null){
			preMid = mid;
			mid = mid.next;
			end = end.next;
			end = end.next;
		}
		return preMid;
	}
}
