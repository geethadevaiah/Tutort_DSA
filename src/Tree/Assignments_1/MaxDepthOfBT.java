package Tree.Assignments_1;

import java.util.LinkedList;
import java.util.Queue;

import Tree.TreeNode;

public class MaxDepthOfBT {
	public static int maxDepth(TreeNode node) {
		if(node == null) return 0;
		// found leaf
		if(node.left == null && node.right == null) return 1;
		// there's no left subtree
		if(node.left == null) return 1 + maxDepth(node.right);
		// there's no right subtree
		if(node.right == null) return 1 + maxDepth(node.left);
		return 1 + Math.max(maxDepth(node.left), maxDepth(node.right)); 
	}
	// iterative
	
	public static int minD(TreeNode node) {
		if(node == null) return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		int i = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			i++;
			for(int j = 0 ; j < size ; j++) {
				TreeNode n = q.peek();
				if(q.peek().left != null) q.add(q.peek().left);
				if(q.peek().right != null) q.add(q.peek().right);
				q.poll();
//				if(n.left == null && n.right == null)
//					return i;
			}
		}
		return i;
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		root.right = node1;
		node1.right = node2;
//		node2.left = node3;
		node2.right = node3;
//		node2.left = node5;
		node3.right = node4;
		System.out.println(maxDepth(root));
	}
}
