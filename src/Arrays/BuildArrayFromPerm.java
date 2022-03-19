package Arrays;
//https://leetcode.com/problems/build-array-from-permutation/
public class BuildArrayFromPerm {

	public static int[] buildArray(int[] nums) {
		int ans[] = new int[nums.length];
		for(int i = 0 ; i < nums.length ; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}
	// without using extra space
	public static void buildArr(int[] nums, int index) {
		if(index > nums.length-1)
			return;
		int val = nums[nums[index]];
		buildArr(nums, index+1);
		nums[index] = val;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,0,1,2,3,4};
		buildArr(arr, 0);
	}
}
