package chapter_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		choose_question();
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
				case 8:
					question_8(scan);
					break;
				case 9: 
					question_9(scan);
					break;
				default: 
					System.out.println("Invalid question number!");
					return;
			}
		}
	}
	
	//Question 1: Check if a tree is balanced
	public static void question_1(Scanner scan) {
		System.out.println("Check if a tree is balanced----------------------------------");
		
	}
	
	public static void question_2(Scanner scan) {
		Test test = new Test();;
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("ignore");
		list.add("456");
		list.add("ignore");
		list.add("123");
		list.add("789");
		test.parse(list);
	}

	public static void question_3(Scanner scan) {
		
	}
	
	public static void question_4(Scanner scan) {
		
	}
	
	public static void question_5(Scanner scan) {
		
	}

	public static void question_6(Scanner scan) {
		
	}
	
	public static void question_7(Scanner scan) {
		
	}
	
	public static void question_8(Scanner scan) {
		
	}
	
	public static void question_9(Scanner scan) {
		
	}
}
