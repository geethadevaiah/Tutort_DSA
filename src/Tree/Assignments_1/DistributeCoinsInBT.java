package Tree.Assignments_1;

import Tree.TreeNode;

public class DistributeCoinsInBT {

	static int ans = 0;
	public static int distributeCoins(TreeNode root) {
		ans = 0;
		dfs(root);
		return ans;
	}
	public static int dfs(TreeNode node) {
		
		if(node == null) return 0;
		int L = dfs(node.left);
		int R = dfs(node.right);
		// count the moves with absolute
		ans += Math.abs(L) + Math.abs(R);
		return node.val + L + R - 1;
	}
}
