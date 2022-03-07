package WarmupPracticeSet_I;

public class _5_FindValEqToIndex {

	public static void printIndex(int[] arr) {
		// considering 1-based indexing
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == i+1) {
				System.out.println(arr[i]);
			}
		}
	}
}
