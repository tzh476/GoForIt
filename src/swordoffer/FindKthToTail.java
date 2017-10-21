package swordoffer;

public class FindKthToTail {
	
	public ListNode FindKthToTail(ListNode head,int k) {
		int  i, pos = k - 1;
		if(head == null || pos < 0)
			return null;
		
		ListNode first = head, second = head;
		//让探测指针先走k-1步
		for(i = 0; i < pos; i++){
			second = second.next;
			if(second == null){
				return null;
			}
		}
		
		while(second.next != null){
			first = first.next;
			second = second.next;
		}
		
		return first;
		
    }
}
