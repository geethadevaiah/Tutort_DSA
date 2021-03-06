package Arrays.Assignments_1;

import java.util.Arrays;

public class _13_3SumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closest_sum = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				// comparing the sum of three numbers to the 'target' can cause overflow. So, we
				// will try to find a target difference
				int difference = target - nums[i] - nums[left] - nums[right];
				if (difference == 0)
					return target; // we've found a triplet with an exact sum, so we return sum of all the numbers
				// the second part of the above 'if' is to handle the smallest sum when we have
				// more than one solution
				if ((Math.abs(difference) == Math.abs(closest_sum) && difference > closest_sum)
						|| Math.abs(difference) < Math.abs(closest_sum)) {
					closest_sum = difference; // save the closest and the biggest difference
				}
				if (difference > 0)
					left++; // we need a triplet with a bigger sum
				else
					right--; // we need a triplet with a smaller sum
			}
		}
		return target - closest_sum;

	}
	
	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(nums, target));
	}
}
