package WarmupPracticeSet_I;

public class _6_PerfectArray {

	public static boolean isPerfect(int[] arr) {
		// array is perfect if it reads the same from the opposite end
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) 
			if(arr[i] != arr[n - 1 - i]) return false;
		
		return true;
	}
}
