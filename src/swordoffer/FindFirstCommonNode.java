package swordoffer;

public class FindFirstCommonNode {
public static void main(String[] args){
		
		ListNode list1 = new ListNode(1);
		ListNode temp1 = list1;
		temp1.next = new ListNode(2);
		temp1.next.next = new ListNode(3);
	//	System.out.println(list1.val+"　"+list1.next.val+" "+list1.next.next.val);
		
		
		ListNode list2 = new ListNode(4);
		ListNode temp2 = list2;
		temp2.next = new ListNode(5);
		
		ListNode list3 = new ListNode(6);
		ListNode temp3 = list3;
		temp3.next = new ListNode(7);
		
		temp1.next.next.next =list3;
		temp2.next.next = list3;
		
		ListNode res = new FindFirstCommonNode().FindFirstCommonNode(list1, list2);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
			
	}
	/**
	 * 法1，还有一种方法算出长度差，然后一起走
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	ListNode pro1 = pHead1, pro2 = pHead2;
    	boolean isFind = false;
    	while(pro1 != null){
    		isFind = false;
    		pro2 = pHead2;
    		while(pro2 != null){
    			if(pro1 == pro2){
    				isFind = true;
    				break;
    			}
    			pro2 = pro2.next;
    		}
    		if(isFind){
    			break;
    		}
    		pro1 = pro1.next;
    	}
    	
    	return pro1;
    	 
    }
}	
