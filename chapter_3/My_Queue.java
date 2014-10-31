package chapter_3;

import java.util.Stack;

public class My_Queue<T> {
	private Stack<T> old_stack, new_stack;
	
	public My_Queue() {
		this.old_stack = new Stack<T>();
		this.new_stack = new Stack<T>();
	}
	
	public int size() {
		return this.old_stack.size() + this.new_stack.size();
	}
	
	public void enqueue(T data) {
		old_stack.push(data);
	}
	
	public T dequeue() {
		shift_stack();
		return new_stack.pop();
	}
	
	public void shift_stack() {
		if(new_stack.isEmpty()) {
			while(!old_stack.isEmpty()) {
				new_stack.push(old_stack.pop());
			}
		}
	}
	
	public T peek() {
		shift_stack();
		return new_stack.peek();
	}
	
}
