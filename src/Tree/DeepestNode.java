package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {

	public static TreeNode findDeep(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		TreeNode res = new TreeNode();
		
		while(!q.isEmpty()) {
			TreeNode treeNode = q.poll();
			res = treeNode;
			if(treeNode.left != null) q.add(treeNode.left);
			if(treeNode.right != null) q.add(treeNode.right);
		}
		return res;
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
		System.out.println(findDeep(root).val);
	}
	
}
