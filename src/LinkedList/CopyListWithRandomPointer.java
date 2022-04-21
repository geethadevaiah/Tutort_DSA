package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

	public static Node copyRandomList(Node head) {

		if (head == null)
			return head;
		// if(head.next == null) return new Node(head.val); // case is handled
		Node tmp = head;
		Map<Node, Node> map = new HashMap<>();
		Node result = new Node(0);
		Node curr = result;
		while (tmp != null) {
			result.next = new Node(tmp.val);
			map.put(tmp, result.next);
			tmp = tmp.next;
			result = result.next;
		}
		tmp = head;
		while (tmp != null) {
			map.get(tmp).random = map.get(tmp.random);
			tmp = tmp.next;
		}
		return curr.next;
	}

	public static Node copyRandom(Node head) {
		if (head == null)
			return null;
		Node temp = head;

		// Step 1
		// append the new nodes in between
		while (temp != null) {
			Node node = new Node(temp.val);
			node.next = temp.next;
			temp.next = node;

			temp = temp.next.next;
		}

		// Step 2
		// update the random nodes
		temp = head;
		Node newHead = head.next;

		while (temp.next.next != null) {
			Node node = temp.next;
			node.random = temp.random == null ? null : temp.random.next;
			temp = temp.next.next;
		}
		temp.next.random = temp.random == null ? null : temp.random.next;

		// Step 3
		// get only the new nodes link
		temp = head;
		while (temp.next.next != null) {
			Node node = temp.next;
			Node next = node.next;

			node.next = next.next;
			temp.next = next;
			temp = next;
		}

		temp.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		Node n1 = new Node(7);
		Node n2 = new Node(13);
		Node n3 = new Node(11);
		Node n4 = new Node(10);
		Node n5 = new Node(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n2.random = n1;
		n3.random = n5;
		n4.random = n3;
		n5.random = n1;
		copyRandomList(n1);
	}
}
