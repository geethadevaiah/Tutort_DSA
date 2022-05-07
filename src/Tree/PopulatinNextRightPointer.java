package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
}

public class PopulatinNextRightPointer {

	public static void populate(Node root) {

//		Queue<Node> q = new LinkedList<>();
//		Queue<Node> q1 = new LinkedList<>();
//
//		q.add(root);
//		while (!q.isEmpty()) {
//			Node treeNode = q.poll();
//			q1.add(treeNode);
//			//System.out.println(treeNode.val);
//			if (treeNode.left != null)
//				q.add(treeNode.left);
//			if (treeNode.right != null)
//				q.add(treeNode.right);
//		}
//		int i = 1;
//		while(!q1.isEmpty()) {
//			Node node = q1.poll();
//			if(i % 2 == 0) {
//				node.next = q1.poll();
//				i++;
//			}
//			i++;
//		}
		
		Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Node> list = new ArrayList<>();
            for(int i = 0;i<size;i++){
            	// whatever  added to q in here will all be in one line
            	// so point the next ptr to each next one in the q
                if(q.peek() != null && q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek() != null && q.peek().right != null){
                    q.add(q.peek().right);
                }
                list.add(q.remove());
            }
            for(int i = 1;i<list.size();i++){
                list.get(i-1).next = list.get(i);
            }
        }
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
		populate(root);
	}
}
