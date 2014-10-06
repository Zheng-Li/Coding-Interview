package chapter_2;

import java.util.Hashtable;
import java.util.Stack;

public class LinkedListNode {
	LinkedListNode next = null;
	private int data;
	
	public LinkedListNode() {}
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public void set_data(int data) {
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
	
	//Delete node without access to the head
	public boolean delete_node(LinkedListNode n) {
		//copy the next node to overwrite this node and delete the next node
		if(n == null || n.next == null) {
			System.out.println("Invalid node...(Null node or Last node)");
			return false;
		}
		
		LinkedListNode next = n.next;
		n.set_data(next.get_data());
		n.next = next.next;
		return true;
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
	
	//Get the specified node by data
	public LinkedListNode get_node(int data) {
		LinkedListNode tmp = this;
		while(tmp.next != null) {
			if(tmp.get_data() == data) {
				return tmp;
			}
			tmp = tmp.next;
		}
		return null;
	}
	
	//Get the specified node
	public LinkedListNode get_tail_node() {
		LinkedListNode tail = this;
		while(tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}
	
	//Part the linkedlist by value x
	public LinkedListNode partition(LinkedListNode head, int x) {
		LinkedListNode less = null;
		LinkedListNode more = null;
		LinkedListNode merge_point = null;
		
		while(head != null) {
			if(head.get_data() < x) {
				if(less == null) {
					less = new LinkedListNode(head.get_data());
				} else {
					less.add_node(head.get_data());
				}
			} else {
				if(more == null) {
					more = new LinkedListNode(head.get_data());
				} else {
					more.add_node(head.get_data());
				}
			}
			head = head.next;
		}
		
		//Merge the two linkedlist
		merge_point = less.get_tail_node();
		merge_point.next = more;
		return less;
	}
	
	//Add two numbers by linkedlist
	public LinkedListNode add(LinkedListNode l1, LinkedListNode l2, int carry) {
		LinkedListNode result = new LinkedListNode();
		if(carry == 0 && l1 == null && l2 == null) {
			return null;
		}
		
		//Add value from carry, l1 and l2
		int value = carry;
		if(l1 != null) {
			value = value + l1.get_data();
		}
		if(l2 != null) {
			value = value + l2.get_data();
		}
		result.set_data(value%10);
		
		//Reverse 
		if(l1 != null || l2 != null) {
			LinkedListNode more = add(l1 == null ? null : l1.next,
					l2 == null ? null : l2.next,
					value >= 10 ? 1 : 0);
			result.next = more;
		}
	
		return result;
	}	
	
	//Find the loop start point in a linkedlist
	public LinkedListNode find_start_point(LinkedListNode head) {
		LinkedListNode slow_runner = head;
		LinkedListNode fast_runner = head;
		
		while(fast_runner != null && fast_runner.next != null) {
			slow_runner = slow_runner.next;
			fast_runner = fast_runner.next.next;
			if(fast_runner == slow_runner) break;
		}
		
		slow_runner = head;
		while(slow_runner != fast_runner) {
			slow_runner = slow_runner.next;
			fast_runner = fast_runner.next;
		}
	
		System.out.println("The start point of the loop is " + slow_runner.get_data());
		return slow_runner;
	}
	
	//Check if a linkedlist is a palindrome by using stack
	public boolean is_palindrome(LinkedListNode head) {
		//Only need to check half of the nodes in linkedlist, using fast_runner and slow_runner
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast != null && fast.next != null) {
			stack.push(slow.get_data());
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//Skip the middle node when there's odd number of nodes
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			if(slow.get_data() != stack.pop()) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
 }
