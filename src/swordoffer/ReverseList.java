package swordoffer;

public class ReverseList {
	
public static void main(String[] args){
		ListNode list1 = new ListNode(1);
		ListNode temp1 = list1;
		temp1.next = new ListNode(3);
		temp1.next.next = new ListNode(5);
		System.out.println(list1.val+"　"+list1.next.val+" "+list1.next.next.val);
		ListNode res = new ReverseList().ReverseList(list1);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
			
	}
	ListNode temp;
    public ListNode ReverseList(ListNode head) {
    	ListNode res = new ListNode(1);
    	temp = res;
    	reverse(head);
    	return res.next;
    }

	private void reverse(ListNode head) {
		if(head == null)
    		return ;
		reverse(head.next);
		temp.next = head;
		temp = temp.next;
		temp.next = null;//避免造成循环链表
	}
}
