package Tree.Assignments_2;

import Tree.TreeNode;

public class InsertIntoBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		TreeNode node = new TreeNode(val);
		if (root == null) return node;
		TreeNode head = root;
		while (head != null) {
			if (val < head.val) {
				if (head.left == null) {
					head.left = node;
					return root;
				} else
					head = head.left;
			} else {
				if (head.right == null) {
					head.right = node;
					return root;
				} else
					head = head.right;
			}
		}
		return root;
	}

	// recursive
	public TreeNode insertIntoBST1(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (root.left == null && root.val > val) {
			TreeNode curr = new TreeNode(val);
			root.left = curr;
		}
		if (root.right == null && root.val < val) {
			TreeNode curr = new TreeNode(val);
			root.right = curr;
		}
		if (root.left != null && root.val > val) {
			insertIntoBST(root.left, val);
		}
		if (root.right != null && root.val < val) {
			insertIntoBST(root.right, val);
		}
		return root;
	}
}
