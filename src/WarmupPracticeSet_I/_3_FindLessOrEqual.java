package WarmupPracticeSet_I;

public class _3_FindLessOrEqual {

	public static int findlessOrEqual(int[] arr, int k) {
		
		int count = 0;
		for(int i = 0 ; i < arr.length ;i++) {
			if(arr[i] < k) count++;
		}
		return count;
	}
}
