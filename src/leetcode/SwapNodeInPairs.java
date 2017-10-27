package leetcode;

public class SwapNodeInPairs {
	public static void main(String[] args){
		SwapNodeInPairs rotateRight = new SwapNodeInPairs();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		//head.next.next = new ListNode(0);
		rotateRight.swapPairs(head);
	}
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode preCur = preHead;
        while(head != null && head.next != null){
        	ListNode temp = head.next.next;
        	preCur.next = head.next;
        	preCur.next.next = head;
        	head.next = temp;
        	
        	preCur = preCur.next.next;
        	head = temp;
        }
        return preHead.next;
    }
}
