package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelSum {

	public static int populate(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<>();
		int sum = 0, maxSum = Integer.MIN_VALUE, maxLevel = -1, level = 1;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;
            List<TreeNode> list = new ArrayList<>();
            for(int i = 0;i<size;i++){
                if(q.peek() != null && q.peek().left != null)
                    q.add(q.peek().left);
                if(q.peek() != null && q.peek().right != null)
                    q.add(q.peek().right);
                list.add(q.remove());
            }
            for(int i = 0 ; i < list.size() ; i++) {
            	sum += list.get(i).val;
            }
           
            if(sum > maxSum ) {
                 System.out.println(sum+"  "+maxSum+"  "+level+"  "+maxLevel);
            	maxSum = sum;
            	maxLevel = level;
            }
            level++;
        }
        return maxLevel;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		populate(root);
	}
}
