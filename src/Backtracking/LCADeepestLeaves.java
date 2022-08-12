package Backtracking;

import Tree.TreeNode;

public class LCADeepestLeaves {

	// calculate the lca of the deepest leaves in the root.

	public static TreeNode lcaDeepestLeaves(TreeNode root) {

		if(root == null) return root;
		int leftDepth = countDepth(root.left);
		int rightDepth = countDepth(root.right);
		
		if(leftDepth == rightDepth) return root;
		if(leftDepth > rightDepth) return lcaDeepestLeaves(root.left);
		else
			return lcaDeepestLeaves(root.right);
	}

	public static int countDepth(TreeNode root) {
		if(root == null) return 0;
		int maxLeft = countDepth(root.left);
		int maxRight = countDepth(root.right);
		return 1 + Math.max(maxLeft, maxRight);
	}
}
