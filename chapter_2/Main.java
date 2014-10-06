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
		
		LinkedListNode x = head.get_node(k);
		head.delete_node(x);
		head.show_linkedlist(head);
	}
	
	//Question 4: Partition a linkedlist by value x, so that small nodes come before large ones
	public static void question_4(Scanner scan) {
		System.out.println("Partition a linkedlist by a given value--------------------");
		LinkedListNode head  = create_linkedlist(scan);
		
		System.out.println("The paritition value is:");
		int x = Integer.parseInt(scan.next());
		
		LinkedListNode new_head = head.partition(head, x);
		head.show_linkedlist(new_head);
	}
	
	//Question 5: Use linkedlist to achieve mathematical add function
	public static void question_5(Scanner scan) {
		System.out.println("Use linkedlist to to add two numbers-------------------");
		int number_1 = Integer.parseInt(scan.next());
		int number_2 = Integer.parseInt(scan.next());
		
		System.out.println("The result is:");
		LinkedListNode l1 = int_to_linkedlist(number_1);
		System.out.print("+ ");
		LinkedListNode l2 = int_to_linkedlist(number_2);
		System.out.print("= ");
		LinkedListNode result = l1.add(l1, l2, 0);
		result.show_linkedlist(result);
	}
	
	//Find the loop point within a linkedlist
	public static void question_6(Scanner scan) {
		System.out.println("Find out the loop point within a linkedlist----------------");
		LinkedListNode loop_list = create_linkedlist(scan);
		LinkedListNode loop_tail = loop_list.get_tail_node();
		loop_tail.next = loop_list.next.next.next.next; // random test loop point
		
		loop_list.find_start_point(loop_list);
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
	
	//Transfer from a number to a linkedlist
	public static LinkedListNode int_to_linkedlist(int num) {
		LinkedListNode num_node;
		
		if(num <= 0) {
			System.out.println("Zero and Negative numbers not supported!");
			return null;
		}
		
		num_node = new LinkedListNode(num%10);
		System.out.print(num%10 + " ");
		num = num/10;
		while(num != 0) {
			num_node.add_node(num%10);
			System.out.print(num%10 + " ");
			num = num/10;
		}
		
		return num_node;
	}
	
}
