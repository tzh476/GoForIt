package leetcode;
/**
 * @author Rail
 * 遍历两次，一次将小于x放入链表，一次将
 */
public class PartitionList {
	public static void main(String[] args){
		PartitionList partitionList = new PartitionList();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(0);
		partitionList.partition(head, 1);
	}
    public ListNode partition(ListNode head, int x) {
    	
    	ListNode resHead = new ListNode(0);
    	ListNode resCur = resHead;
    	
    	ListNode cur = head;
    	
    	while(cur != null){
    		if(cur.val < x){
    			resCur.next = new ListNode(cur.val);
    			resCur = resCur.next;
    		}
    		cur = cur.next;
    	}
    	cur = head;
    	while(cur != null){
    		if(cur.val >= x){
    			resCur.next = new ListNode(cur.val);
    			resCur = resCur.next;
    		}
    		cur = cur.next;
    	}
    	
		return resHead.next;
        
    }
}
