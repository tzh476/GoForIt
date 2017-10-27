package leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode cur = head;
    	while(l1 != null && l2 != null){
    		cur.next = new ListNode((l1.val+l2.val) % 10);
    		cur = cur.next;
    		l1 = l1.next;
    		l2 = l2.next;
    	}
    	
		return head.next;
        
    }
}
