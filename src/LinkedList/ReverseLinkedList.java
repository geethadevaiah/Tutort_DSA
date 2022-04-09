package LinkedList;

public class ReverseLinkedList {

	 public static ListNode reverseList(ListNode head) {
			if(head == null || head.next == null) return head;
			ListNode tmp = null;
			ListNode n = head;
			
			while(head != null) {
				n = head.next;
				head.next = tmp;
				tmp = head;
				head = n;
			}
			return tmp;
	    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		ListNode res = reverseList(l1);
		printLL(res);
	}
	public static void printLL(ListNode l1) {
		System.out.println("Linked List :: ");
		ListNode tmp = l1;
		while(tmp != null) {
			System.out.print(tmp.val+" -> ");
			tmp = tmp.next;
		}
	}
}
