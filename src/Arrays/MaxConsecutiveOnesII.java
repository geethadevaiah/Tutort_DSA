package Arrays;

public class MaxConsecutiveOnesII {

	/** Given a binary array, find the max no of consecutive 1's. 
		only single 0 flip is allowed 
		i/p: 0 1 1 1 0 1 0 1 0 1 0 1 
		o/p: 5  **/
	
	public static int maxOnes(int[] nums) { // with extra space
		int n = nums.length, maxOnes = 0;
		int[] zeroArr = new int[n];
		for(int i = 0 ; i < n ; i++) 
			if(nums[i] == 0)
				zeroArr[i] = i;
		for(int i = 1 ; i < n-1 ; i++) 
			maxOnes = Math.max(maxOnes, zeroArr[i+1] - zeroArr[i-1] + 1);
		return maxOnes;
	}
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1};
		System.out.println(maxOnes(nums));
	}

}
