package Arrays.Assignments_2;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateIII {

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

		if (nums == null || nums.length == 0)
			return false;
		if (k < 1 || t < 0)
			return false;
		if (k == 0)
			return false;
		int start = 0, n = nums.length, i = 0;
		Set<Integer> set = new HashSet<>();

		for (; i < n; i++) {
			if (t == 0) { // avoiding TLE
				if (set.contains(nums[i]))
					return true;
			} else {

				for (int integer : set) {
                    if (Math.abs((long)(long)nums[i] - (long)integer) <= t)
						return true;
				}
			}
			if (set.size() > k - 1)
				set.remove(nums[start++]);
			set.add(nums[i]);
		}
		return false;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 5, 9, 1, 5, 9 };
		// [8,7,15,1,6,1,9,15]
		// change: long to this use case
		// [-2147483648,2147483647] , 1, 1
		System.out.println(containsNearbyAlmostDuplicate(nums, 2, 3));
	}
}
