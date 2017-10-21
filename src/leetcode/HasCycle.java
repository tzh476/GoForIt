package leetcode;
class ListNode {
 int val;
	  ListNode next;
	  ListNode(int x) {
	        val = x;
	          next = null;
 }
}
/**
 * 思路：设置两个指针first和second，first每次走一步，second每次走两步。出现两种情况：
 * 1、second会出现null  -》 没有循环
 * 2、second在某个地方和first重合 -》 存在循环
 * @author Rail
 *
 */
public class HasCycle {
	boolean isCycle = false;
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second != null){
        	first = first.next;
        	if(second.next == null)
        		break;
        	second = second.next;
        	second = second.next;
        	if(first == second){
        		isCycle = true;
        		break;
        	}
        	
        }
        return isCycle;
    }
}
