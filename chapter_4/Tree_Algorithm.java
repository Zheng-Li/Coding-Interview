package chapter_4;

import java.util.ArrayList;


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
	
	public TreeNode createMinHeightTree(int[] nodes, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (end + start)/2;
		TreeNode root = new TreeNode(nodes[mid]);
		root.left = createMinHeightTree(nodes, start, mid-1);
		root.right = createMinHeightTree(nodes, mid+1, end);
		return root;
	}
	
	public int getHeight(TreeNode root) {
		int leftHeight;
		int rightHeight;
		
		if(root.left != null) {
			leftHeight = getHeight(root.left);
		} else {
			leftHeight = 0;
		}
		if(root.right != null) {
			rightHeight = getHeight(root.right);
		} else {
			rightHeight = 0;
		}
		
		if(leftHeight >= rightHeight) {
			return leftHeight+1;
		} else {
			return rightHeight+1;
		}
	}
	
	public void inOrderTraversal(TreeNode root, ArrayList<Integer> array) {
		TreeNode n = root;
		if(root == null) return;
		inOrderTraversal(n.left, array);
		array.add(n.getValue());
		inOrderTraversal(n.right, array);
	}
	
	public boolean checkBST(ArrayList<Integer> array) {
		//Assuming there's no duplicate records in the tree
		for(int i=1; i<array.size(); i++) {
			if(array.get(i) <= array.get(i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public TreeNode getNextNode(TreeNode root, TreeNode node) {
		if(node == null) {
			return null;
		}
		
		if(node.getRight() != null) {
			return getLeftMost(node.getRight());
		} else {
			TreeNode n = node;
			TreeNode p = n.getParent();
			while(p != null && p.getLeft() != n) {
				n = p;
				p = p.getParent();
			}
			return p;
		}
	}
	
	public TreeNode getLeftMost(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		TreeNode tmp = root;
		while(root.getLeft() != null) {
			tmp = root.getLeft();
		}
		return tmp;
	}
	
}
