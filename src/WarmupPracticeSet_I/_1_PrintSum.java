package WarmupPracticeSet_I;

public class _1_PrintSum {

	public static void printSum(int[] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("Sum = "+sum);
	}
	
	public static void main(String[] args) {
		int[] arr = {5 ,8 ,3 ,10 ,22 ,45};
		printSum(arr);
	}
}
