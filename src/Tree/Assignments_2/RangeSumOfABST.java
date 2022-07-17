package Tree.Assignments_2;

import Tree.TreeNode;

public class RangeSumOfABST {
	public int sum = 0;

	public int rangeSumBST1(TreeNode root, int low, int high) {
		if (root == null)
			return 0;
		if (root.val >= low && root.val <= high)
			sum += root.val;
		if (root.val > low)
			rangeSumBST(root.left, low, high);
		rangeSumBST(root.right, low, high);
		return sum;
	}

	public int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null)
			return 0;
		return (low <= root.val && root.val <= high ? root.val : 0) 
				+ rangeSumBST(root.left, low, high)
				+ rangeSumBST(root.right, low, high);
	}
}
