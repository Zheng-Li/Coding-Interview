package chapter_4;

public class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	
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
		
	}
}
