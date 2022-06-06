package sorting;

import LinkedList.ListNode;

public class sortList {
	public ListNode sortList1(ListNode head) {
		  if(head == null || head.next == null) 
	            return head;
	        // find the mid 
	        ListNode slow = head;
			ListNode fast = head;
			ListNode temp = slow;
			while(fast!= null && fast.next != null) {
				temp = slow;
				slow = slow.next;
				fast = fast.next.next;
			}
	        // divide the list
			temp.next = null;
			ListNode left = sortList1(head);
			ListNode right = sortList1(slow);
	        // merge the list
			return merge(left, right);
	}
	
	public ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode curr = dummy;
		while(list1 != null && list2 != null) {
			if(list1.val < list2.val) {
				curr.next = list1;
				list1 = list1.next;
			} else {
				curr.next = list2;
				list2 = list2.next;
			}
            curr = curr.next;
		}
		curr.next = (list1 != null) ? list1 : list2;
		return dummy;
	}
	
}
