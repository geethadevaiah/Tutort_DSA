package Arrays.Assignments_1;

import java.util.Arrays;

public class _8_MajorityElement {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
