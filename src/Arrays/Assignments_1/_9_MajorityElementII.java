package Arrays.Assignments_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _9_MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {

		int n = nums.length;
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int num = map.getOrDefault(nums[i], 0);
			if(num+1 > n/3 && !list.contains(nums[i])) 
				list.add(nums[i]);
			map.put(nums[i], num + 1);
			
		}
		return list;
	}
	
	//Follow up: Could you solve the problem in linear time and in O(1) space?
	
	
	public static void main(String[] args) {
		// find all elements that appear more than  n/3  times.
		int nums[] = {2,2};
		System.out.println(majorityElement(nums));
	}
}
