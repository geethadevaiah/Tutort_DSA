package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSubsequenceofLengthKWiththeLargestSum {
	public static int[] maxSubsequence(int[] nums, int k) {
		// Index Based Priority
		// pQ such that, given the indices, the values of it to be in increasing order
		// {-1,-2,3,4} pq = [1,0,2,3]
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> nums[i]));
                    
        for (int i=0; i<nums.length ; i++)
        {
            pq.offer(i); // Pushing Index Based Priority
            
        if (pq.size() > k) // No need for size > k, hence delete
                pq.poll();
        }
        
        // K largest Values and Converting PQ to Array
        // mapToInt(i -> nums[i]) : PQ Contains i, Store nums[i] in the Array instead of i
        return pq.stream().sorted().mapToInt(i -> nums[i]).toArray();
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,-2,3,4};
		maxSubsequence(nums, 3);
	}
}
