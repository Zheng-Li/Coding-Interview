package chapter_4;

import java.util.ArrayList;
import java.util.LinkedList;

import chapter_4.Node.Status;

public class DirectedGraph {
	public LinkedList<Node> nodes = new LinkedList<Node>();
	public DirectedGraph() {
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		Node n3 = new Node("C");
		Node n4 = new Node("D");
		Node n5 = new Node("E");
		Node n6 = new Node("F"); 
		Node n7 = new Node("G");
		
		n1.next.add(n2);
		n2.next.add(n3);
		n2.next.add(n7);
		n3.next.add(n5);
		n4.next.add(n2);
		n5.next.add(n6);
		n5.next.add(n4);
		n6.next.add(n4);
		
		nodes.add(n1);
		nodes.add(n2);
		nodes.add(n3);
		nodes.add(n4);
		nodes.add(n5);
		nodes.add(n6);
		nodes.add(n7);
	}
	
	public LinkedList<Node> getNodes() {
		return this.nodes;
	}
	
	public boolean search(DirectedGraph g, Node start, Node end) {
		//Initialize all the nodes in the graph
		LinkedList<Node> nodes = new LinkedList<Node>();
		for(Node n : g.getNodes()) {
			n.status = Status.Unvisited;
		}
		
		start.status = Status.Visiting;
		nodes.add(start);
		Node node;
		while(!nodes.isEmpty()) {
			node = nodes.removeFirst();
			if(node != null) {
				for(Node q : node.getAdjacent()) {
					if(q.status == Status.Unvisited) {
						if(q == end) {
							return true;
						} else {
							q.status = Status.Visiting;
							nodes.add(q);
						}
					}
				}
				node.status = Status.Visited;
			}
		}
		return false;
	}
}

class Node {
	private String value;
	public ArrayList<Node> next;
	public enum Status {Visited, Visiting, Unvisited}
	public Status status;
	
	public Node(String value) {
		this.value = value;
		this.next = new ArrayList<Node>();
	}
	
	public String getValue() {
		return this.value;
	}
	
	public ArrayList<Node> getAdjacent() {
		return this.next;
	}
	
}
