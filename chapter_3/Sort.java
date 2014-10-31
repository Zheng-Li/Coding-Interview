package chapter_3;

import java.util.Stack;

public class Sort {
	public Stack<Integer> sort(Stack<Integer> original) {
		Stack<Integer> result = new Stack<Integer>();
		while(!original.isEmpty()) {
			int tmp = original.pop();
			while(!result.isEmpty() && result.peek() > tmp) {
				original.push(result.pop());
			}
			result.push(tmp);
		}
		System.out.println(result.toString());
		return result;
	}
}
