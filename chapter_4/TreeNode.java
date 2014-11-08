package chapter_4;

import java.util.ArrayList;
import java.util.LinkedList;


public class TreeNode {
	private int value;
	protected TreeNode left;
	protected TreeNode right;
	
	public TreeNode(int value) {
		this.value = value;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode node) {
		left = node;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode node) {
		right = node;
	}
	
	public int getValue() {
		return value;
	}
	
	public ArrayList<LinkedList<TreeNode>> showTree(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> tree = new ArrayList<LinkedList<TreeNode>>();
		createTreeList(tree, 0, root);
		for(LinkedList<TreeNode> list: tree) {
			for(TreeNode tn : list) {
				System.out.print(tn.getValue() + " ");
			}
			System.out.println();
		} 
		return tree;
	}
	
	//Show result by LinkedList of each depth
	public void createTreeList(ArrayList<LinkedList<TreeNode>> tree, 
			int level, TreeNode root) {
		if(root == null) return;
		LinkedList<TreeNode> list;
	
		if(tree.size() == level) {
			//When the level is not in the arraylist
			list = new LinkedList<TreeNode>();
			tree.add(list);
		} else {
			list = tree.get(level);
		}
		list.add(root);

		createTreeList(tree, level+1, root.left);
		createTreeList(tree, level+1, root.right);
	}
}
