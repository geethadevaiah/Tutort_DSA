package PriorityQueue;

import java.util.PriorityQueue;

public class FindSubsequenceofLengthKWiththeLargestSum {
	public int[] maxSubsequence(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
		
		for(int i : nums) {
			pq.add(i);
		}
		int[] sum = new int[k];
		int i =0;
		while(i < k) {
			sum[i] = pq.poll();
			i++;
		}
		return sum;
	}
}
