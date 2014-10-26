package chapter_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		test();
		choose_question();
	}
	
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
	
	public static void question_2 (Scanner scan) {
		
	}
	
	public static void question_3 (Scanner scan) {
		
	}
	
	public static void question_4 (Scanner scan) {
		
	}
	
	public static void question_5 (Scanner scan) {
		
	}
	
	public static void question_6 (Scanner scan) {
		
	}
	
	public static void question_7 (Scanner scan) {
		
	}
}
