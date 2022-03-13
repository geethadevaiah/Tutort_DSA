package Arrays;

public class ProductExceptSelf {

	// Input: nums = [1,2,3,4]
//	Output: [24,12,8,6]
	public static int[] productExceptSelf(int[] nums) {

		int n = nums.length;
		int res[] = new int[n];
		int lhs[] = new int[n];
		int rhs[] = new int [n];
		
		lhs[0] = rhs[n-1] = 1;
		for(int i = 1 ; i < n ; i++) {
			lhs[i] = lhs[i-1] * nums[i-1];
			rhs[n-i-1] = rhs[n-i] * nums[n-i];
		}
		for(int i = 0 ; i < n ; i++) {
			res[i] = lhs[i] * rhs[i];
		}
		return res;
	}
	

	// 2n space
	public static void product(int[] nums) {
		int n = nums.length;
		int res[] = new int[n];
		int lhs[] = new int[n];
		
		lhs[0] = 1;
		for(int i = 1 ; i < n ; i++) {
			lhs[i] = lhs[i-1] * nums[i-1];
		}
		for(int i = 0 ; i < n ; i++) {
			res[i] = lhs[i] * rhs[i];
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		productExceptSelf(arr);
	}
}
