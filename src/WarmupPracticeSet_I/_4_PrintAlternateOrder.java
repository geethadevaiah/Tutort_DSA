package WarmupPracticeSet_I;

public class _4_PrintAlternateOrder {

	public static void print(int[] arr) {
		
		for(int i = 0 ; i < arr.length ; i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
