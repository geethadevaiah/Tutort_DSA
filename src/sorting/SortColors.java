package sorting;

public class SortColors {

	// faster 
	public void sortColors(int[] nums) {
		int l = 0, r = nums.length - 1, i = 0;

		for (; i <= r; i++) {
			// use while to put all the 2s to the right
			while (nums[i] == 2 && i < r) {
				swap(nums, i, r);
				r--;
			}
			while (nums[i] == 0 && i > l) {
				swap(nums, i, l);
				l++;
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}