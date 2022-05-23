package Tree.Assignments_2;

import Tree.TreeNode;

public class BstToGst {

	static int val = 0;
	public static TreeNode bstToGst(TreeNode root) {
		if(root == null) return null;
		bstToGst(root.right);
		root.val += val;
		val = root.val;
		bstToGst(root.left);
		return root;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(0);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(3);
		TreeNode node8 = new TreeNode(8);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node4.right = node7;
		node6.right = node8;
		System.out.println(bstToGst(root));
	}
}
