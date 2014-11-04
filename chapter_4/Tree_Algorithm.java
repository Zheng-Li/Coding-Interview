package chapter_4;


public class Tree_Algorithm {
	public boolean is_balanced(TreeNode root) {
		if(check_height(root) == -1) {
			return false;
		} else {
			return true;
		}
	}
	
	public int check_height(TreeNode node) {
		//height is zero
		if(node == null) {
			return 0;
		}
		
		int left_height = check_height(node.getLeft());
		if(left_height == -1) {
			return -1;
		}
		
		int right_height = check_height(node.getRight());
		if(right_height == -1) {
			return -1;
		}
		
		int diff = left_height - right_height;
		if(diff != 0) {
			return -1;
		} else {
			return Math.max(left_height, right_height) + 1;
		}
	}
}
