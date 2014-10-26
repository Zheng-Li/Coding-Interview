package chapter_3;

public class Array_Stack {
	private int stack_size;
	private int[] array;
	private int[] stack_pointer = {-1, -1, -1};
	
	public Array_Stack(int size) {
		this.stack_size = size;
		this.array = new int[stack_size*3];
	}
	
	public void push(int stack_num, int value) throws Exception {
		//Check if there's space available 
		if(stack_pointer[stack_num] + 1 >= stack_size) {
			throw new Exception("Out of space");
		} 
		
		stack_pointer[stack_num]++;
		array[absolute_loc(stack_num)] = value;
	}
	
	public int pop(int stack_num) throws Exception {
		//Check if there's data in stack
		if(stack_pointer[stack_num] == -1) {
			throw new Exception("Empty stack");
		}
		int value = array[absolute_loc(stack_num)];
		array[absolute_loc(stack_num)] = 0;
		stack_pointer[stack_num]--;
		return value;
	}
	
	public int peek(int stack_num) {
		int index = absolute_loc(stack_num);
		return array[index];
	}
	
	public boolean is_empty(int stack_num) {
		return stack_pointer[stack_num] == -1;
	}
	
	public int absolute_loc(int stack_num) {
		return stack_num*stack_size + stack_pointer[stack_num];
	}
	
	public void show_result() {
		System.out.println("First stack:");
		for(int i=0; i<=absolute_loc(0); i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Second stack:");
		for(int i=stack_size*1; i<=absolute_loc(1); i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Third stack:");
		for(int i=stack_size*2; i<=absolute_loc(2); i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
