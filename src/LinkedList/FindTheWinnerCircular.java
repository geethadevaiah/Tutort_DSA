package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class FindTheWinnerCircular {

	public static int findTheWinner(int n , int k) {
		// approach 1 create linked list circular n keep on deleting
		ListNode head = new ListNode(0);
		ListNode curr = head;
		int i = 1;
		while(i <= n) {
			head.next = new ListNode(i++);
			head = head.next;
		}
		curr = curr.next; // start from one
		head.next = curr; // making it circular
		ListNode prev = head;
		while(curr.next != curr) {
			i = 1;
			ListNode tmp = curr;
			while(i++ < k) {
				prev = tmp;
				tmp = tmp.next;
			}
			prev.next = tmp.next;
			curr = tmp.next;
		}
		return curr.val;
	}
	
	public static int findTHeWinner(int n , int k) {
		// arraylist method
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ; i <= n ; i++) 
			list.add(i);
		int index = 0;
		while(list.size() > 1) {
			index = index + k - 1;
			if(index >= list.size()) index = index % list.size();
			list.remove(index);
		}
		return list.get(0);
	}
	
	public static int foo(int a) {
		if(a == 0) return 0;
		a = foo(--a);
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		System.out.println(findTHeWinner(5, 2));
		
//		foo(5);
		
	}
}
