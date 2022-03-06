package WarmupPracticeSet_II;

import java.util.Arrays;

public class _7_MajorityElement {
	
	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
        return nums[nums.length/2];
    }

	public static void main(String[] args) {
		int arr[] = {3,2,3};
		System.out.println(majorityElement(arr));
	}

}
