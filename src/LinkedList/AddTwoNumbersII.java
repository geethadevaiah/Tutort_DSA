package LinkedList;

public class AddTwoNumbersII {
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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode l1_r = reverseList(l1);
        ListNode l2_r = reverseList(l2);
        
        ListNode result = new ListNode(0);
		ListNode curr = result;
		int carry = 0;
		while (l1_r != null || l2_r != null) {
			int l1Val = l1_r != null ? l1_r.val : 0;
			int l2Val = l2_r != null ? l2_r.val : 0;
			int val = l1Val + l2Val + carry;
			carry = val / 10;
			result.next = new ListNode(val % 10);
            result = result.next;
			if(l1_r != null) l1_r = l1_r.next;
			if(l2_r != null) l2_r = l2_r.next;
		}
        if (carry > 0) {
            result.next = new ListNode(carry);
        }
		return reverseList(curr.next);
        
    }
}
