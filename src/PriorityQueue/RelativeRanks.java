package PriorityQueue;

import java.util.PriorityQueue;

public class RelativeRanks {
	public static String[] findRelativeRanks(int[] score) {
		int n = score.length;

		String[] res = new String[n];
		// pQ such that given the indices in the q, value of which is in decreasing order
		// {10,3,8,9,4} PR: 0,3,2,4,1]
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> score[b]-score[a]);
		for(int i = 0 ; i < n ; i++) {
			pq.add(i);
		}
		int i = 1;
		while(!pq.isEmpty()) {
			int idx = pq.poll();
			if(i > 3 )res[idx] = Integer.toString(i);
			else if(i == 1) {
				res[idx] = "Gold Medal";
			}
			else if(i == 2) {
				res[idx] = "Silver Medal";
			}
			else if(i == 3) res[idx] = "Bronze Medal";
			i++;	
		}
		return res;
	}
	
	
	public static String[] findRelativeRanks1(int[] score) {
		int n = score.length;
		String[] res = new String[n];
		
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] score = {10,3,8,9,4};
		System.out.println(findRelativeRanks(score));
	}
}
