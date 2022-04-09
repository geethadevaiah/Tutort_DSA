package LinkedList;

public class ConvertBinaryToInt {
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode tmp = null;
		ListNode n = head;

		while (head != null) {
			n = head.next;
			head.next = tmp;
			tmp = head;
			head = n;
		}
		return tmp;
	}

	public int getDecimalValue(ListNode head) {
		if (head == null)
			return 0;
		if (head.next == null)
			return head.val * 1;
		ListNode reverse = reverseList(head);
		int total = 0, i = 0;
		while (reverse != null) {
			if (reverse.val > 0)
				total += reverse.val * Math.pow(2, i);
			reverse = reverse.next;
			i++;
		}
		return total;
	}
}
