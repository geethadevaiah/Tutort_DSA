package PriorityQueue;

import java.util.PriorityQueue;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode head = new ListNode(0);
		ListNode point = head;

		PriorityQueue<ListNode> p = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
		for (ListNode l : lists) {
			if (l != null) {
				p.add(l);
			}
		}
		while (!p.isEmpty()) {
			point.next = p.poll();
			point = point.next;
			if(point.next != null)
				p.add(point.next);
		}
		return head.next;
	}
}
