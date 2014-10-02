package chapter_2;

import java.util.Hashtable;

public class LinkedListNode {
	LinkedListNode next = null;
	private int data;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public int get_data() {
		return this.data;
	}
	
	//append the new data into the LinkedList
	public void add_node(int node_data) {
		LinkedListNode new_node = new LinkedListNode(node_data);
		LinkedListNode current_node = this;
		
		while(current_node.next != null) {
			current_node = current_node.next;
		}
		current_node.next = new_node;
	}
	
	//remove node from the LinkedList and return the head
	public LinkedListNode delete_node(LinkedListNode head, int data) {
		LinkedListNode head_node = head;
		
		if(head_node.get_data() == data) {
			return head.next;
		}
		
		//didn't change the head of the original LinkedList
		while(head_node.next != null) {
			if(head_node.next.get_data() == data) {
				head_node.next = head_node.next.next;
				return head;
			}
			head_node = head_node.next;
		}
		return head;
	}
	
	//remove duplicate records in the LinkedList
	public void remove_duplicate(LinkedListNode head) {
		Hashtable node_table = new Hashtable();
		LinkedListNode tmp = head;
		LinkedListNode node = null;
		
		while(tmp != null) {
			if(node_table.containsKey(tmp.data)) {
				node.next = tmp.next;
			} else {
				node_table.put(tmp.data, true);
				node = tmp;
			}
			tmp = tmp.next;
		}
		
		head.show_linkedlist(head);
	}
	
	//Find the kth to last element in singly linked list
	public LinkedListNode kth_to_last(LinkedListNode head, int k) {
		LinkedListNode window_start = head;
		LinkedListNode window_end = head;
		
		//Set up a k length window
		for(int i=1; i<k; i++) {
			if(window_end.next != null) {
				window_end = window_end.next;
			} else {
				System.out.println("Not enough elements in LinkedLIst!");
			}
		}
		
		//Move the window to the end
		while(window_end.next != null) {
			window_start = window_start.next;
			window_end = window_end.next;
		}
		
		return window_start;
	}
	
	//Print out the result linkedlist
	public void show_linkedlist(LinkedListNode head) {
		while(head != null) {
			System.out.print(head.get_data() + " ");
			head = head.next;
		}
		System.out.println();
	}
 }
