package WarmupPracticeSet_I;

import java.util.Arrays;

public class _7_ReduceMaxMinElement {

	// remove max and min in every step
	public static int removeMaxMin(int[] arr) {
		// sort
		Arrays.sort(arr);
		// remaining element is always the n/2 th element
		int n = arr.length / 2;
		return arr[n];
	}
}
