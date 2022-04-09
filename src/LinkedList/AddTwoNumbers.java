package LinkedList;

public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode curr = result;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1Val = l1 != null ? l1.val : 0;
			int l2Val = l2 != null ? l2.val : 0;
			int val = l1Val + l2Val + carry;
			carry = val / 10;
			result.next = new ListNode(val % 10);
            result = result.next;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
        if (carry > 0) {
            result.next = new ListNode(carry);
        }
		return curr.next;
	}
}
