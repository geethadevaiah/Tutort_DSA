package Arrays.Assignments_2;

import java.util.Arrays;

public class NextGreaterElementII {

	public static int[] nextGreaterElement(int[] nums) {
		int n = nums.length;
		int[] nxtGreater = new int[n];
		Arrays.fill(nxtGreater, -1);
		// populate the nextGreater array, from the left side
		for (int i = 0; i < n; i++) {
			int k = (i + 1 == n) ? 0 : i + 1;
			while (k != i) {
				if (nums[k] > nums[i]) {
					nxtGreater[i] = nums[k];
					break;
				}
				k = (k + 1 == n) ? 0 : k + 1;
			}
		}
		return nxtGreater;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		nextGreaterElement(nums);
	}
}
