package Arrays.Assignments_2;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2) {

		// convert to set
		HashSet<Integer> set1 = new HashSet<>(nums1.length);
		for(int n : nums1) set1.add(n);
		HashSet<Integer> set2 = new HashSet<>(nums2.length);
		for(int n : nums2) set2.add(n);
		if(set1.size() > set2.size() ) return intersection_tmp(set1, set2);
		return intersection_tmp(set2, set1);
		
	}
	
	public static int[] intersection_tmp(HashSet<Integer> set1, HashSet<Integer> set2){
		int[] result = new int[set2.size()];
		int i = 0;
		for(int n : set2) {
			if(set1.contains(n)) result[i++] = n;
		}
		return Arrays.copyOf(result, i); // send a copy till ith index, might not be required to send the complete array
	}
	
	public static void main(String[] args) {
		int nums1[] = {1,2,2,1}, nums2[] = {2,2};
		intersection(nums1, nums2);
	}
}
