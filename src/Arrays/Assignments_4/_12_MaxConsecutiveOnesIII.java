package Arrays.Assignments_4;

public class _12_MaxConsecutiveOnesIII {

	// longest subarray with utmost k zeroes :: translation
    public static int longestOnes(int[] nums, int k) {
    	// sliding window
    	// j++ : window increasing , count of 0s <= K
    	// i++: window decreasing , count of 0s > K
    	int i = 0, j = 0; // two pointer
    	for( j = 0 ; j < nums.length ; j++) {
    		// decrement k only when 0 is found
    		if(nums[j] == 0) 
    			k--;
    		System.out.println("i:"+nums[i]+" j:"+nums[j]+" k:"+k);
    		// when k < 0, then increment i pointer (decreasing the window)
    		if(k < 0) {
    			if(nums[i] == 0) k++; // when k < 0 and ith is 0 increment k
    			i++;
    		}
    	}
		return j - i;
		// means window will determine the fixed width for containing only k number of 0s.
	}

    public static void main(String[] args) {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		longestOnes(nums, 2);
	}
}
