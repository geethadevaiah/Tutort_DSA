package Tree.Assignments_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class LevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if(root == null) return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			List<Integer> l = new ArrayList<Integer>();
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode treeNode = q.peek();
				if (treeNode.left != null)
					q.add(treeNode.left);
				if (treeNode.right != null)
					q.add(treeNode.right);
				l.add(q.remove().val);
			}
			list.add(l);
		}
		return list;
	}
}
