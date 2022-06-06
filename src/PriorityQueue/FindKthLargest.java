package PriorityQueue;

import java.util.PriorityQueue;

public class FindKthLargest {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k + 1);
		for (int el : nums) {
			largeK.add(el);
			if (largeK.size() > k) 
				largeK.poll();
		}
		return largeK.poll();
	}
}
