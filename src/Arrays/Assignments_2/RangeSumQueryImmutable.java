package Arrays.Assignments_2;

public class RangeSumQueryImmutable {
	int[] nums = null;

	public RangeSumQueryImmutable(int[] nums) {
		this.nums = new int[nums.length];
		this.nums = nums;
	}

	public int sumRange(int left, int right) {
		int sum = 0;
		for(int i = left ; i <= right ; i++) {
			sum += nums[i];
		}
		return sum;
	}
}
