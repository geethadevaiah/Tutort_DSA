package Tree.Assignments_1;

import Tree.TreeNode;

public class PathSum {
	
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;
		if (targetSum - root.val == 0 && root.left == null && root.right == null) 
			return true;
		return hasPathSum(root.left, targetSum - root.val) ||
		
		 hasPathSum(root.right, targetSum - root.val);
	}

	// not working
	/*public static boolean hasPathSum(TreeNode root, int targetSum) {
		if(root == null) return false;
		return hasPathSumUtil(root, targetSum, root.val);
	}

	public static boolean hasPathSumUtil(TreeNode root, int targetSum, int currSum) {
		if (root == null)
			return false;
		if (targetSum == currSum) {
			return (root.left == null && root.right == null);
		}
		boolean ls = hasPathSumUtil(root.left, targetSum - root.val, currSum + root.val);
		if (ls)
			return ls;
		return hasPathSumUtil(root.right, targetSum - root.val, currSum + root.val);
	}*/

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(-2);
		TreeNode node3 = new TreeNode(-3);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(3);
		TreeNode node6 = new TreeNode(-2);
		TreeNode node7 = new TreeNode(-1);
		root.left = node2;
		root.right = node3;
		node2.right = node5;
		node2.left = node4;
		node4.left = node7;
		node3.left = node6;
		System.out.println(hasPathSum(root, -1));
	}
}
