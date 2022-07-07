package Arrays.Assignments_1;

public class _10_MissingRanges {

	/**
	 * Input: nums = [0,1,3,50,75], lower = 0 and upper = 100 output:
	 * :["2","4->49","51"->"74","76"->"99"]
	 */

	public static String missing(int[] nums, int lower, int upper) {

		StringBuilder sb = new StringBuilder();
		int[][] res = new int[upper][2];
		int index = 0, n = nums.length, flag = 0;
		if (nums[0] > lower) {
			res[index][0] = lower;
			res[index++][1] = nums[0] - 1;
		}
		for (int i = 0; i < n; i++) {
			flag = 0;
			if (i < n - 1 && nums[i + 1] != nums[i] + 1) {
				res[index][0] = nums[i] + 1;
				flag = 1;
			}
			if (i < n - 1 && nums[i + 1] != nums[i] + 1) {
				res[index][1] = nums[i + 1] - 1;
				flag = 1;
			}
			if (flag == 1)
				index++;
		}
		if (upper > nums[n - 1]) {
			res[index][0] = nums[n - 1] + 1;
			res[index][1] = upper;
		}
		// format
		sb.append("[");
		for(int i = 0 ; i <= index ; i++) {
			if(res[i][0] == res[i][1])
				sb.append(res[i][0]);
			else
				sb.append(res[i][0]+"->"+res[i][1]);
			if(i != index)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 3, 50, 75 };
		System.out.println(missing(nums, 0, 100));
	}
}
