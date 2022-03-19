package WarmupPracticeSet_III;

import java.util.Arrays;

public class _7_ThirdMaxNumber {

	public static int thirdMax(int[] arr) {
		int n = arr.length;
		if(n == 1) return arr[0];
		if(n == 2) return Math.max(arr[0], arr[1]);
		Arrays.sort(arr);
		int curr = -1;
		for(int i = 0 ; i < n ; i++) {
			while(i+1 < n && arr[i] == arr[i+1]) i++;
			arr[++curr] = arr[i];
		}
		if(curr < 2) return arr[curr];
		else return arr[curr - 2];
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2};
		System.out.println(thirdMax(arr));
	}
}
