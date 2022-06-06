package StacksAndQueues;

import java.util.Stack;

public class DailyTemperatures {

	public static int[] dailyTemperatures(int[] temperatures) {

		Stack<Integer> s = new Stack<>();
		int[] ans = new int[temperatures.length];

		// from l to r
		for (int i = 0; i < temperatures.length; i++) {

			// check each time whether the index element on stack is greater 
			// than the current element in hand
			while (!s.isEmpty() && temperatures[s.peek()] < temperatures[i]) {
				int index = s.pop(); // if so
				ans[index] = i - index; // update the top index element for the answer
				// ************ IMP ********
			}
			// else keep on pushing the current elements in hand
			s.push(i);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {6,5,4,3,1,2,7,5,3};
		dailyTemperatures(arr);
	}
}
