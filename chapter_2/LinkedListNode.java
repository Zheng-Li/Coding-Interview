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
	}
 }
