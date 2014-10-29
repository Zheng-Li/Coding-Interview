package chapter_3;

import java.util.ArrayList;
import java.util.Stack;

public class Set_Of_Stack {
	private int stack_size;
	private ArrayList<Stack> stacks;
	
	public Set_Of_Stack(int size) {
		this.stack_size = size;
		this.stacks = new ArrayList<Stack>();
	}
	
	public void push(int value) {
		Stack<Integer> last_stack = get_last_stack();
		if(last_stack != null && 
				last_stack.size() < stack_size) { 
			last_stack.push(value);
		} else {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(value);
			stacks.add(stack);
		}
	}
	
	public int pop() {
		Stack<Integer> last_stack = get_last_stack();
		int value = last_stack.pop();
		if(last_stack.size() == 0) {
			stacks.remove(stacks.size() - 1);
		}
		return value;
	}
	
	public Stack<Integer> get_last_stack() {
		Stack<Integer> last = new Stack<Integer>();
		if(stacks.size() == 0) {
			stacks.add(last);
			return last;
		} else {
			last = stacks.get(stacks.size() - 1);
			return last;
		}
	}
	
	public void show_all() {
		System.out.println("The Internal structure is:");
		for(Stack s : stacks) {
			System.out.println(s.toString());
		}
	}
}
