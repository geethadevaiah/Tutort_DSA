package Tree.BST;

import Tree.TreeNode;

public class ValidateBST {
	
	public static boolean validate(TreeNode node) {
		return validateUtil(node, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean validateUtil(TreeNode node, long min, long max) {
		if(node == null) return true;
		if(node.val <= min || node.val >= max) return false;
		return validateUtil(node.left, min, node.val)
				&& validateUtil(node.right, node.val, max);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		System.out.println(validate(root));
	}
}
