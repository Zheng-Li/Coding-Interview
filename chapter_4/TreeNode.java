package chapter_4;


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
	
	public void showTreeNode(TreeNode node) {
		//Unfinished to show the layout of the binary tree
	}
}
