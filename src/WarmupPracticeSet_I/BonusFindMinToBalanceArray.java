package WarmupPracticeSet_I;

import WarmupClass.FindMaxInArray;

/**
 * Given an array of even size N, task is to find minimum value that can be added to an element so that
	array become balanced. An array is balanced if the sum of the left half of the array elements is equal
	to the sum of right half.
	Example 1:
	Input:
	N = 4
	arr[] = {1, 5, 3, 2}
	Output: 1
	Explanation:
	Sum of first 2 elements is 1 + 5 = 6,
	Sum of last 2 elements is 3 + 2 = 5,
	To make the array balanced you can add 1.
 * @author Geetha
 *
 */
public class BonusFindMinToBalanceArray {

	public static int findMinToBalance(int[] arr) {
		int sum1 = 0, sum2 = 0, n = arr.length;
		// find the midpoint of the array and sum it up separately
		// the difference between the sum of left and right array will be the balance to add
		sum1 = findSum(arr, 0 , n / 2);
		sum2 = arr.length % 2 == 0 ? findSum(arr, n/2, n) : findSum(arr, n/2 + 1 , n);
		return Math.abs(sum1 - sum2); 
	}
	
	public static int findSum(int[] arr, int start, int end) {
		int sum = 0;
		for(int i = start ; i < end ; i++) 
			sum += arr[i];
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,2};
		System.out.println(findMinToBalance(arr));
	}
}
