package Arrays.Assignments_2;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		/*Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			if(map.containsKey(nums[i])) 
				if(Math.abs(map.get(nums[i]) - i) <= k) return true;
			map.put(nums[i], i);
		}
		return false;*/
		
		// using set and sliding window.
		if(k == 0 ) return false;
		Set<Integer> set = new HashSet<>();
		int start = 0;
		for(int i = 0; i < nums.length ;i++) {
				if(set.contains(nums[i])) return true;
				if(set.size() > k-1) 
					set.remove(nums[start++]);
				set.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}
}
