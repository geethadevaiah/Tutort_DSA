package Tree.Assignments_1;

import Tree.TreeNode;

public class DiameterOfABT {

	public int diameterOfBinaryTree(TreeNode root) {

		if (root == null)
			return 0;
		// find the depth of the left sub tree and right sub tree
		int n = depth(root.left) + depth(root.right);
		
		// find the diameter of left sub tree
		int ls = diameterOfBinaryTree(root.left);
		// find the diameter of right sub tree
		int rs = diameterOfBinaryTree(root.right);
		// get the max of both
		return Math.max(n, Math.max(ls, rs));
	}

	public static int depth(TreeNode node) {
		if (node == null)
			return 0;
		return 1 + Math.max(depth(node.left), depth(node.right));
	}
}
