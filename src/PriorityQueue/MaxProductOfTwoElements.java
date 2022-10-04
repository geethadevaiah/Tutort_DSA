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
	public int maxProd(int[] nums) {
		int max1 = 0;
        int max2 = 0;
        for(int i:nums){
            if(i>max1){
                max2 = max1;
                max1 = i;
            }
            else if(i>max2){
                max2 = i;
            }
        }
        return (max1-1)*(max2-1);
	}
}
