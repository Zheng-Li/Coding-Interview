package chapter_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
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
	
	//Question 1: Remove duplicate record from the linkedlist
	public static void question_1(Scanner scan) {
		System.out.println("Remove duplicate records in a LinkedList-----------");
		LinkedListNode head = create_linkedlist(scan);
		head.remove_duplicate(head);
	}
	
	//Question 2: Find kth to last element in the linkedlist
	public static void question_2(Scanner scan) {
		System.out.println("Find the kth to last element in a LinkedList----------");
		LinkedListNode head = create_linkedlist(scan);
		
		System.out.println("Which element do you want from the last?");
		int k = Integer.parseInt(scan.next());
		
		int element = head.kth_to_last(head, k).get_data();
		System.out.println("The kth to last element is: " + element);
	}
	
	//Question 3: Delete a node in the middle of a LinkedList
	public static void question_3(Scanner scan) {
		System.out.println("Delete a node in the middle of the LinkedList-----------");
		LinkedListNode head = create_linkedlist(scan);
		
		System.out.println("Which element do you want to delete?");
		int k = Integer.parseInt(scan.next());
		
		
	}
	
	public static void question_4(Scanner scan) {
		
	}
	
	public static void question_5(Scanner scan) {
		
	}
	
	public static void question_6(Scanner scan) {
		
	}
	
	public static void question_7(Scanner scan) {
		
	}
	
	public static LinkedListNode create_linkedlist(Scanner scan) {
		System.out.println("The original LinkedList is: ");
		LinkedListNode head = new LinkedListNode(Integer.parseInt(scan.next()));
		
		while(scan.hasNext()) {
			String s = scan.next();
			if(s.equals("done")) {
				break;
			} else {
				head.add_node(Integer.parseInt(s));
			}
		}
		return head;
	}
}
