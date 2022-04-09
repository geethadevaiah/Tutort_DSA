package Arrays;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {

	public static int[] decompress(int[] nums) {
		int n = nums.length;
		List<Integer> list = new ArrayList<>();
//		int res[] = new int[n];
//		int currIndex = 0, resultArraySize = 0;
//		for (int i = 0; i < nums.length; i += 2) {
//			resultArraySize += nums[i];
//		}

		for (int i = 0; i < n; i = i + 2) {
			while (nums[i] > 0) {
//				res[currIndex++] = nums[i + 1];
				list.add(nums[i + 1]);
				nums[i]--;
			}
		}

		return list.stream().mapToInt(i -> i).toArray();
	}

	public static int[] decompress1(int[] nums) {
		int n = nums.length, resultArraySize = 0, currIndex = 0;
		for (int i = 0; i < nums.length; i += 2) 
			resultArraySize += nums[i];
		
		int res[] = new int[resultArraySize];
		for (int i = 0; i < n; i = i + 2) {
			while (nums[i] > 0) {
				res[currIndex++] = nums[i + 1];
				nums[i]--;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4 };
		decompress(num);
	}

}
