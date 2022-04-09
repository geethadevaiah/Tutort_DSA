package LinkedList;

public class RemoveDuplicatesFromSortedList {

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode tmp = head;
		while (tmp.next != null) {
			if (tmp.val == tmp.next.val)
				tmp.next = tmp.next.next;
			else
				tmp = tmp.next;
		}
		return head;
	}
}
