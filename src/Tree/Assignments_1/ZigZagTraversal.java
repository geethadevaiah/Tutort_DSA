package Tree.Assignments_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class ZigZagTraversal {

	public static List<List<Integer>> minD(TreeNode node) {
		List<List<Integer>> list = new ArrayList<>();
		if (node == null)
			return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		int i = 0;
		boolean flag = false;
		while (!q.isEmpty()) {
			int size = q.size();
			i++;
			List<Integer> l = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				TreeNode n = q.peek();
				if (q.peek().left != null)
					q.add(q.peek().left);
				if (q.peek().right != null)
					q.add(q.peek().right);
				l.add(q.poll().val);
			}
			if(i % 2 == 0) Collections.reverse(l);
			list.add(l);
		}
		return list;
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
//		System.out.println(maxDepth(root));
	}
}
