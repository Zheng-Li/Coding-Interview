package chapter_4;

import java.util.ArrayList;
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
		TreeNode root = sampleTree();
		
		Tree_Algorithm ta = new Tree_Algorithm();
		if(ta.is_balanced(root)) {
			System.out.println("Balanced!!!");
		} else {
			System.out.println("Unbalanced!!!");
		}
	}
	
	//Question 2: Find route in directed graph
	public static void question_2(Scanner scan) {
		System.out.println("Find possible path within directed graph----------------------------------------");		
		DirectedGraph dg = new DirectedGraph();
		Node start = dg.getNodes().get(4);
		Node end = dg.getNodes().get(0);
		if(dg.search(dg, start, end)) {
			System.out.println("There's path between " + start.getValue() + " and " + end.getValue());
		} else {
			System.out.println("There's no path between " + start.getValue() + " and " + end.getValue());
		}
	}

	//Question 3: Binary search tree for sorted array
	public static void question_3(Scanner scan) {
		System.out.println("Create a binary search tree for sorted array---------------------------------------");
		Tree_Algorithm ta = new Tree_Algorithm();
		int[] nodes = {1,2,3,4,5,6,7,8,9,11,13,16,17,19,21};
		TreeNode root = ta.createMinHeightTree(nodes, 0, nodes.length-1);
		System.out.println(ta.getHeight(root));
	}
	
	//Question 4: Create LinkedList for TreeNodes of each depth
	public static void question_4(Scanner scan) {
		System.out.println("Representing the Tree with LinkedList----------------------------------------");
		TreeNode root = sampleTree();
		root.showTree(root);
	}
	
	//Question 5: Check if a binary tree is a binary search tree
	public static void question_5(Scanner scan) {
		System.out.println("Check if a binary tree is a binary search tree-----------------------------------------");
		Tree_Algorithm ta = new Tree_Algorithm();
		ArrayList<Integer> array = new ArrayList<Integer>();
		TreeNode root = sampleTree();
		ta.inOrderTraversal(root, array);
		System.out.println(ta.checkBST(array));
	}

	public static void question_6(Scanner scan) {
		
	}
	
	public static void question_7(Scanner scan) {
		
	}
	
	public static void question_8(Scanner scan) {
		
	}
	
	public static void question_9(Scanner scan) {
		
	}
	
	public static TreeNode sampleTree() {
		TreeNode root = new TreeNode(0);
		TreeNode lv1_1 = new TreeNode(1);
		TreeNode lv1_2 = new TreeNode(2);
		TreeNode lv2_1 = new TreeNode(3);
		TreeNode lv2_2 = new TreeNode(4);
		TreeNode lv2_3 = new TreeNode(5);
		TreeNode lv2_4 = new TreeNode(6);
//		TreeNode lv3 = new TreeNode(7);
		
		root.setLeft(lv1_1);
		root.setRight(lv1_2);
		lv1_1.setLeft(lv2_1);
		lv1_1.setRight(lv2_2);
		lv1_2.setLeft(lv2_3);
		lv1_2.setRight(lv2_4);
//		lv2_3.setLeft(lv3);
		
		return root;
	}
}
