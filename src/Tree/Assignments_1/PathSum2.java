package Tree.Assignments_1;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class PathSum2 {

	/*
	 * public static boolean hasPathSum(TreeNode root, int targetSum) { if (root ==
	 * null) return false; if (targetSum - root.val == 0 && root.left == null &&
	 * root.right == null) return true; return hasPathSum(root.left, targetSum -
	 * root.val) || hasPathSum(root.right, targetSum - root.val); }
	 */

	static List<List<Integer>> list = null;

	public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		list = new ArrayList<List<Integer>>();
		getPathSum(root, targetSum, new ArrayList<Integer>());
		return list;
	}

	public static void getPathSum(TreeNode root, int targetSum, List<Integer> l) {
		if (root == null)
			return;
		if (targetSum - root.val == 0 && root.left == null && root.right == null) {
			l.add(root.val);
			list.add(new ArrayList<>(l)); // add the new arraylist- complete
			l.remove(l.size() - 1); // backtracking
			return;
		}
		l.add(root.val);
		getPathSum(root.left, targetSum - root.val, l);
		getPathSum(root.right, targetSum - root.val, l);
		l.remove(l.size() - 1); // backtracking
	}

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
		System.out.println(pathSum(root, -1));
	}
}
