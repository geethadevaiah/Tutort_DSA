package sorting;

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
}
