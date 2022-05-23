package Tree.Assignments_2;

import Tree.TreeNode;

public class LowestCommonAncestor {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		// rmbr the property of heap
		// all elements to the left of root are less than root
		// elements to the right of the tree with root is greater than root

		if (root.val < p.val && root.val < q.val)
			return lowestCommonAncestor(root.right, p, q);
		if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);
		return root;
	}

	public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode head = root;
		while (head != null) {
			if (head.val < p.val && head.val < q.val)
				head = head.right;
			else if (head.val > p.val && head.val > q.val)
				head = head.left;
			else
				return head;
		}
		return null;
	}

}
