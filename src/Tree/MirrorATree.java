package Tree;

public class MirrorATree {

	public static void mirror(TreeNode root) {
		// postorder
		
		if(root == null) return;
		mirror(root.left);
		mirror(root.right);
		
		// exchange
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
	}
}
