package Tree;

public class LevelOfANode {

	public static int findLevel(TreeNode root, TreeNode target) {
		return traversal(root,target, 0);
	}
	private static int traversal(TreeNode node, TreeNode target,int level) {
		if(node == null) return -1;
		if(target == node) return level;
		int ls = traversal(node.left, target, level+1);
		if(ls != -1) return ls;
		ls = traversal(node.right,target, level+1);
		return ls;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node4.left = node5;
		System.out.println(findLevel(root, node5));
	}
}
