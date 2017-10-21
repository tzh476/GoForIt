package swordoffer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
	/*
	 * 利用栈来实现
	 */
	/*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		Stack<Integer> stack = new Stack<Integer>();

		while (listNode != null) {
			stack.add(listNode.val);
			listNode = listNode.next;
		}

		while (!stack.isEmpty()) {
			res.add(stack.pop());
		}

		return res;
	}*/

	// 利用递归
	ArrayList<Integer> res = new ArrayList<Integer>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

		if (listNode != null) {
			printListFromTailToHead(listNode.next);
			res.add(listNode.val);
		}

		return res;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}