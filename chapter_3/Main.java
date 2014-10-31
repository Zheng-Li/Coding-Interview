package chapter_3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
//		test();
		choose_question();
	}

	//Test case for questions
	public static void test() {
		Array_Stack array = new Array_Stack(10);
		int a=1; int b=3; int c=5; int d=4; int f=2;
		try {
			array.push(0, a);
			array.push(1, b);
			array.push(2, c);
			array.push(2, d);
			array.push(1, f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(array.pop(0));
			System.out.println(array.pop(1));
			System.out.println(array.pop(1));
			System.out.println(array.pop(2));
			System.out.println(array.pop(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Choose question from chapter
	public static void choose_question() {
		while(true) {
			System.out.println("Choose the question to check:");
			Scanner scan = new Scanner(System.in);
			int num = 0;
			try {
				num = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException efe){
				efe.printStackTrace();
			}
			
			switch(num) {
			case 0: 
				System.out.println("Finish questions");
				return;
			case 1: 
				question_1(scan);
				break;
			case 2: 
				question_2(scan);
				break;
			case 3: 
				question_3(scan);
				break;
			case 4: 
				question_4(scan);
				break;
			case 5:
				question_5(scan);
				break;
			case 6:
				question_6(scan);
				break;
			case 7:
				question_7(scan);
				break;
			default: 
				System.out.println("Invalid question number!");
				return;
			}
		}
	}
	
	//Question 1: Implement array for 3 stacks
	public static void question_1 (Scanner scan)  {
		System.out.println("Implement 3 stacks in 1 arraylist----------------");
		Array_Stack stack = new Array_Stack(10);
		System.out.println("Populate the first stack in the array:");
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			try {
				stack.push(0, value);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Populate the second stack in the array:");
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			try {
				stack.push(1, value);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Populate the third stack in the array:");
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			try {
				stack.push(2, value);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("The array of 3 stack is:");
		stack.show_result();
	}
	
	//Question 2: Stack with min()
	public static void question_2 (Scanner scan) {
		System.out.println("Stack that with min() method that returns minimum value---------------");
		System.out.println("Populate the stack:");
		Stack_With_Min stack = new Stack_With_Min();
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			stack.push(value);
		}
		System.out.println("The minimum value is " + stack.min());
	}
	
	//Question 3: Set of Stacks that creates new stack when old one exceeds threshold
	public static void question_3 (Scanner scan) {
		System.out.println("Set of stacks with fixed stack size------------------");
		System.out.println("Populate the stack with more than 10 numbers:");
		Set_Of_Stack stack_set = new Set_Of_Stack(10);
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			stack_set.push(value);
		}
		stack_set.show_all();
	}
	
	//Question 4: Classic game Tower of Hanoi
	public static void question_4 (Scanner scan) {
		System.out.println("The game of Hanoi----------------------------");
		Tower[] towers = new Tower[3];
		for(int i=0; i<3; i++) {
			towers[i] = new Tower(i);
		}
		System.out.println("How many disks are there in the Towers:");
		int num = scan.nextInt();
		for(int j=num-1; j>=0; j--) {
			towers[0].add_disk(j);
		}
		towers[0].move_disks_to(num, towers[2], towers[1]);
	}
	
	//Question 5: Implementing MyQueue by two stacks
	public static void question_5 (Scanner scan) {
		System.out.println("Implementing MyQueue by 2 stacks----------------------------------------");
		System.out.println("Populate the queue:");
		My_Queue<Integer> queue = new My_Queue<Integer>();
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			queue.enqueue(value);
		}
		System.out.println(queue.peek());
	}
	
	//Question 6: Sorting a stack without using other data structure
	public static void question_6 (Scanner scan) {
		System.out.println("Sorting a stack in ascending order-----------------------------------");
		System.out.println("Populate the original stack: ");
		Stack<Integer> stack = new Stack<Integer>();
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("done")) {
				break;
			}
			int value = Integer.parseInt(input);
			stack.push(value);
		}
		Sort sorting = new Sort();
		sorting.sort(stack);
	}
	
	//Question 7: Cat and Dog adoption problem.(Always adopt the oldest dog/cat)
	public static void question_7 (Scanner scan) {
		System.out.println("Fist-In-First-Out Animal Shelter---------------------------------------------");
		Animal_Queue aq = new Animal_Queue();
		System.out.println("Which kind of animal do you want to adopt? (Any:0 Dog:1 Cat:2)");
		int value = scan.nextInt();
		switch(value) {
		case 0: System.out.println(aq.dequeue_any().name);
				break;
		case 1: System.out.println(aq.dequeue_dog().name);
				break;
		case 2: System.out.println(aq.dequeue_cat().name);
				break;
		default : System.out.println("Error!");
				break;
		}
	}
}
