package LinkedList;

public class NthNodeFromEndOfLinkedList {

	public static int findN(ListNode head, int n) {
		
		ListNode tmp = head;
		ListNode tmp1 = head;
		
		while( n > 0 && tmp1 != null) {
			tmp1 = tmp1.next;
			n--;
		}
		if(tmp1.next == null) return -1;
		while(tmp1 != null) {
			tmp = tmp.next;
			tmp1 = tmp1.next;
		}
		return tmp.val;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		System.out.println(findN(node1, 3));
		
	}
}
