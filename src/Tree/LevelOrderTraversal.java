package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public void levelOrderTraversal(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode treeNode = q.poll();
			System.out.println(treeNode.val);
			if(treeNode.left != null) q.add(treeNode.left);
			if(treeNode.right != null) q.add(treeNode.right);
		}
	}
	
}
