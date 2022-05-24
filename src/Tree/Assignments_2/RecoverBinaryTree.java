package Tree.Assignments_2;

import Tree.TreeNode;

public class RecoverBinaryTree {

	// taking three pointers for help
	TreeNode prev = null;
	TreeNode first = null;
	TreeNode second = null;
	// keep track of prev node.. 
	// since in inorder prev is always less than root.. if it is not , 
	// then it is the exchanged node
	// so make it 'first' node and find second..

	public void findExchange(TreeNode root) {
		if (root == null)
			return;
		findExchange(root.left);
		if (prev != null && root.val < prev.val) {
			if (first == null)
				first = prev;
			second = root;
		}
		prev = root;
		findExchange(root.right);
	}

	public void recoverTree(TreeNode root) {
		findExchange(root);
		int tmp1 = first.val;
		int tmp2 = second.val;
		second.val = tmp1;
		first.val = tmp2;
	}
}
