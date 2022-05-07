package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewTree {

	public static void leftView(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		List<Node> leftNodes = new ArrayList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			Node node = new Node(0);
			for(int i = 0 ; i < size ; i++) {
				if(q.peek().left != null) q.add(q.peek().left);
				if(q.peek().right != null) q.add(q.peek().right);
				Node tmp = q.remove();
//				if(node.val == 0) 
					node = tmp;
			}
			leftNodes.add(node);
		}
	}
	static int tmp = -1;
	public static void LeftRecursive(Node root, int level) {
		if(root == null) return ;
		if(tmp < level) {
			System.out.println(root.val);
			tmp = level;
		}
		LeftRecursive(root.right, level+1);
		LeftRecursive(root.left, level+1);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		Node node6 = new Node(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
//		leftView(root);
		LeftRecursive(root, 0);
	}
}
