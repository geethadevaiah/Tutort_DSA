package Tree.Assignments_2;

import Tree.TreeNode;

public class ConvertSortedArrayToBST {

	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0)
			return null;
		return helper(nums, 0, nums.length - 1);
	}

	public static TreeNode helper(int[] nums, int start, int end) {
		if (start > end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, start, mid - 1);
		node.right = helper(nums, mid + 1, end);
		return node;
	}
}
