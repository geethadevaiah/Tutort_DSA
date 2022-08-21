package sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutiveSequence(int[] nums) {
		// unique ones in set
		Set<Integer> set = new HashSet<>();
		for(int num: nums)
			set.add(num);
		int result = 0;
		for(Integer i : set) {
			
			// IMP:: TLE
			// check if the prev num was already checked
            if(set.contains(i-1)) continue;

            
			int currLen = 1; // one already counted
			// till u keep on getting incremented ones
			while(set.contains(currLen+i)) {
				currLen++;
				// have the max of temp vs global max
				result = Math.max(result, currLen);
			}
		}
		return result;
	}
	
    public static int longestConsecutive1(int[] nums) {
    	 if (nums.length == 0) {
             return 0;
         }
    	int count = 1;
    	int currCount = 1;
    	Arrays.sort(nums);
    	for(int i = 1 ; i < nums.length ; i++) {
    		if(nums[i] != nums[i-1]) {
    			if(nums[i] == nums[i-1] + 1) {
    				currCount++;
    			}
    			else {
    				count = Math.max(count, currCount);
    				currCount = 1;
    			}
    		}
    	}
    	return Math.max(count, currCount);
    }

    public static void main(String[] args) {
		
    	int[] nums = {0,3,7,2,5,8,4,6,0,1};
    	System.out.println(longestConsecutive1(nums));
	}
}
