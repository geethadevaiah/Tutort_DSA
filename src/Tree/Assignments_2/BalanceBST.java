package Tree.Assignments_2;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class BalanceBST {

	static List<Integer> list = new ArrayList<>();
	public static TreeNode balanceBST(TreeNode root) {
		// calling inorder
		list.clear();
		inorder(root);
		return balance(0, list.size() - 1);
	}
	
	public static void inorder(TreeNode root) {
		if(root == null) return;
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}
	
	public static TreeNode balance(int start, int end) {
		if (start > end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(list.get(mid));
		node.left = balance(start, mid - 1);
		node.right = balance(mid + 1, end);
		return node;
	}
}
