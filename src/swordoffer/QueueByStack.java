package swordoffer;

import java.util.Stack;

public class QueueByStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    /*public int pop() {
    	int size = stack1.size();
    	int i;
    	//将stack1除了栈底的元素临时保存到stack2
    	for(i = 0; i < size - 1; i++){
    		stack2.add(stack1.pop());
    	}
    	int res = stack1.pop();
    	//将stack1原来的pop出来的元素放回去
    	for(i = 0; i < size - 1; i++){
    		stack1.add(stack2.pop());
    	}
    	return res;
    }*/
    
    public int pop() {
    	
    	if(stack2.isEmpty()){
    		while(!stack1.empty()){
    			stack2.add(stack1.pop());
    		}
    	}
    	
    	return stack2.pop();
    }
    
    
}
