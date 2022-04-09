package Arrays;

public class MissingNumber {

	public static int missingNumber(int[] nums) {

		int n = nums.length, actualSum = 0;
//		int sum = n * (n+1) / 2;
//		for(int i = 0 ; i < n ; i++) {
//			actualSum += nums[i];
//		}
//		return sum - actualSum;
		int res = 0;
		for(int i = 0 ; i < n ; i++) { 
			actualSum ^= i;
			res ^= nums[i];
		}
		actualSum ^= n; // including the range
		return actualSum ^ res;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,0};
		System.out.println(missingNumber(nums));
	}
}
