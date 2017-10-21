package swordoffer;

public class MergeLink {
	
	public static void main(String[] args){
		
		ListNode list1 = new ListNode(1);
		ListNode temp1 = list1;
		temp1.next = new ListNode(3);
		temp1.next.next = new ListNode(5);
		System.out.println(list1.val+"　"+list1.next.val+" "+list1.next.next.val);
		
		
		ListNode list2 = new ListNode(2);
		ListNode temp2 = list2;
		temp2.next = new ListNode(4);
		temp2.next.next = new ListNode(6);
		System.out.println(list2.val+"　"+list2.next.val+" "+list2.next.next.val);
		
		
		ListNode res = new MergeLink().Merge(list1, list2);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
			
	}
	
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null && list2 == null)
			return null;
		ListNode head = new ListNode(1);
		
		ListNode process = head;
		while(list1 != null && list2 != null){
				if(list1.val < list2.val){
					process.next = list1;
					list1 = list1.next;
				}else{
					
					process.next = list2;
					list2 = list2.next;
				}
			process = process.next;
		}
		
		if(list1 != null && list2 == null){//list2到达末尾
			process.next = list1;
		}
		if(list1 == null && list2 != null){//list1到达末尾
			process.next =  list2;
		}
		
		return head.next;
    }
}
