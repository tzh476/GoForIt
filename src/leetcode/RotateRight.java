package leetcode;
//递归解法
public class RotateRight {
	public static void main(String[] args){
		RotateRight rotateRight = new RotateRight();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		//head.next.next = new ListNode(0);
		rotateRight.rotateRight(head, 1);
	}
	private int nodenum = 0;
	private ListNode pHead = null;//临时的头部节点
	private ListNode tail = null;//尾节点
	private ListNode res;
	private int n = 0;   //实际上要翻转的个数，如果n大于链表的个数nodenum，则n%=nodenum
	int count = 0;		//递归执行中，所有节点进栈后   开始，由count来计数已出栈的元素个数
	public ListNode rotateRight(ListNode head, int n) {
    	if(head == null || n == 0 || head.next == null )
    		return head;
    	pHead = head;
    	res = head;
    	this.n = n;
    	
    	rotate(head);
		return res;
    }
	/**
	 * 
	 * @param head
	 * @param count 尾节点
	 */
	private void rotate(ListNode head) {
		if(head == null){	//计算节点数后取余
			n = n % nodenum;
			return;
		}
		nodenum++;
		if(head.next == null)
			tail = head;
		
		rotate(head.next);
		
		
		if(n == 0)	//n处理为0，即不用移动
			return ;
		
		if(count == n ){//count 为已出栈的个数，当已出栈个数为 n,当前节点为要移动链表的前一个指针
			res = head.next;
			head.next = null;
			tail.next = pHead; 
		}
		count ++;
	}
}
