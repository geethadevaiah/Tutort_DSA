package Tree.Assignments_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import Tree.TreeNode;

public class AverageOfLevels {

	public List<Double> levelOrder(TreeNode root) {
		List<Double> list = new ArrayList<>();
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
			list.add(l.stream().collect(Collectors.averagingDouble(s->Double.parseDouble(s.toString()))));
		}
		return list;
	}
}
