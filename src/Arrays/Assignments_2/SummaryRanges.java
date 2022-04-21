package Arrays.Assignments_2;

import java.util.ArrayList;
import java.util.List;

// Output: ["0->2","4->5","7"]
public class SummaryRanges {
	public static List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<String>();
		int n = nums.length, low = 0, high = 0;
		for(int i = 0 ; i < n ; i++) {
			low = nums[i]; high = 0;
			while(i+1 < n && nums[i+1] == nums[i]+1) i++;
			if(i != n && low != nums[i]) {
				high = nums[i];
			}
			result.add(high == 0 ? low+"" : low+"->"+high);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		summaryRanges(nums);
	}
}
