package Arrays.Assignments_1;

import java.util.HashMap;
import java.util.Map;

public class _1_twoSum {
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			// check for the target in map
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			// add to map
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No result found!");
	}

	public static void main(String[] args) {
		int numbers[] = { 2, 7, 11, 15 };
		int[] res = twoSum1(numbers, 9);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static int[] twoSum1(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int num = target - numbers[i];
			if (map.containsKey(num)) {
				return new int[] { map.get(num) + 1, i + 1 };
			}
			map.put(numbers[i], i);
		}
		return new int[] {};
	}
}
