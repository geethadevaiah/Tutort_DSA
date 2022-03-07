package WarmupPracticeSet_I;

public class _2_PrintIndex {

	public static void printIndex(int[] arr, int index) {
		
		if(index > arr.length){
			System.out.println("Index out of bound!");
			return;
		}
		System.out.println("element at index: "+index + " is "+arr[index]);
	}
	
}
