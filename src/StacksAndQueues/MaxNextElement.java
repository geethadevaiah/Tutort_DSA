package StacksAndQueues;

import java.util.Stack;
/**
	 * Given an array, print the next greater element on the
	 *  right for the Element
	If No NGE, print -1

	arr = [4,5,2,25]
	OP: [5, 25, 25, -1]
 * @author Geetha
 *
 */
public class MaxNextElement {

	public int[] maxNextElement(int[] arr, int n) {
		Stack<Integer> s = new Stack<>();
		int[] ans = new int[arr.length];
		
		for (int i = n - 1; i >= 0; i--) {
			while(!s.isEmpty() && arr[i] >= s.peek()) 
				s.pop();
			
			if(s.isEmpty()) 
				ans[i] = -1;
			
			else
				ans[i] = s.pop();
			
			s.add(arr[i]);
		}
		return ans;
	}
	/**
	 * 
	 (1) Go from R to L
	(2) Pop till get greater element on top or Stack becomes empty
	Intuition: Dont need smaller values
	(3) If stack Empty -> ans: -1
	(4) Else: ans: stack.top() - NGE
	 * 
	 */
}
