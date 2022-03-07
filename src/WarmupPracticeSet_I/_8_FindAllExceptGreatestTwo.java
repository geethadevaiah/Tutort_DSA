package WarmupPracticeSet_I;

import java.util.Arrays;

public class _8_FindAllExceptGreatestTwo {

	public static int[] findExceptGreatestTwo(int[] arr) {
		
		// sort
		Arrays.sort(arr);
		int returnArr[] = new int[arr.length - 2];
		returnArr = Arrays.copyOf(arr, arr.length-2);
		return returnArr;
	}
	public static void main(String[] args) {
		int[] arr = {2, 8, 7, 1, 5};
		findExceptGreatestTwo(arr);
	}
}
