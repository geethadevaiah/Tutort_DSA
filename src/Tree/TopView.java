package Tree;

public class TopView {
	public static void populate(Node root) {

		if(root == null) return;
		System.out.println(root.val);
		populateleft(root.left,0);
		populateleft(root.right,1);
	}
	public static void populateleft(Node root, int l) {
		if(root == null) return;
		System.out.println(root.val);
		if(l == 0)populateleft(root.left,0);
		else populateleft(root.right, 1);
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
