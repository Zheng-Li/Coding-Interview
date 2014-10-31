package chapter_3;

import java.util.Stack;

public class Stack_With_Min extends Stack<Integer>{
	private Stack<Integer> min_stack;
	public Stack_With_Min() {
		min_stack = new Stack<Integer>();
	}
	
	public void push(int value) {
		super.push(value);
		if(value < min()) {
			min_stack.push(value);
		}
	}
	
	public Integer pop() {
		int value = super.pop();
		if(value == min()) {
			min_stack.pop();
		}
		return value;
	}
	
	public int min() {
		if(min_stack.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return min_stack.peek();
		}
	}
}
