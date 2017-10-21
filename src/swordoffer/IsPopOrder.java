package swordoffer;

import java.util.Stack;

public class IsPopOrder {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		boolean isOrder = true;

		int len = popA.length;
		Stack<Integer> stack = new Stack<Integer>();
		int i, j = 0;

		for (i = 0; i < len; i++) {
			//判断栈顶是否和当前元素相等
			if (!stack.isEmpty() && stack.peek() == popA[i]) {
				stack.pop();
				continue;
			}
			//遍历push数组，将与当前元素不相等的的数放入栈中
			while (j < len && pushA[j] != popA[i]) {
				stack.add(pushA[j]);
				j++;
			}
			// 表示跳过需要放入栈中的元素
			if (j < len && pushA[j] == popA[i]) {
				j++;
				continue;
			}
			//按照要求找不到符合 当前数 的操作，退出循环
			isOrder = false;
			break;
		}

		return isOrder;
	}
}
