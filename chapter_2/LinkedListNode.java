package chapter_2;

public class LinkedListNode {
	private LinkedListNode next = null;
	private int data;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	void add_node(int node_data) {
		LinkedListNode new_node = new LinkedListNode(node_data);
		LinkedListNode current_node = this;
		
		while(current_node != null) {
			current_node = current_node.next;
		}
		current_node.next = new_node;
	}
 }
