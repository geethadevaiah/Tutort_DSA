package PriorityQueue;

import java.util.PriorityQueue;

public class MaxProductOfTwoElements {
	public static int maxProduct(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
		for(int i : nums) {
			pq.add(i);
		}
		
		int i =pq.poll();
		int j = pq.poll();
		return (i-1) * (j-1);
	}
}
