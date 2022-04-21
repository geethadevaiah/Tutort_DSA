package Arrays.Assignments_2;

import java.util.Arrays;

public class NextGreaterElementIII {
	public static int nextGreaterElement(int n) {

		int len = String.valueOf(n).length();
		// convert to int[]
		int arr[] = new int[len];
		int index = len;
		while (index > 0) {
			arr[--index] = n % 10;
			n = n / 10;
		}
		// check whether all numbers are in increasing order from right side.
		int j = len - 1;
		while (j > 0 && arr[j] <= arr[j - 1]) {
			j--;
		}
		j--;
		if (j == -1)
			return -1; // no greater number exists
		// find the greater number between j and last digit
		int i = len - 1;
		while(i>j && arr[i] <= arr[j]) {
			i--;
		}
		swap(arr, i, j); // swap i , j
		Arrays.sort(arr, j+1, len); // sort all digits after j
		// convert int[] to whole integer
		int prev = arr[0], k = 0;
		while (k + 1 < len) {
			if(prev > Integer.MAX_VALUE / 10) return -1; // Max conditions
			if(prev == Integer.MAX_VALUE/10 && arr[i] > 7) return -1;
			prev = prev * 10 + arr[++k];
		}
		return prev;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		System.out.println(nextGreaterElement(21));// 214748348
	}
	
	/*12
4324
6574
345666
2474
852573568
357463
462636
46
857925
4635673
873457345
23564
937546
3756*/
}
