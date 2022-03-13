package Arrays;

public class MultiplyPrevNext {

	public static void multiply(int[] arr) {
		
		int tmpPrev = arr[0], n = arr.length;
		// 1st
		arr[0] = arr[0] * arr[1];
		for(int i = 1; i < n-1 ; i++) {
			//(i > 0 && i < n) 
				int tmp = tmpPrev * arr[i+1];
				tmpPrev = arr[i];
				arr[i] = tmp;
		}
		// last
		arr[n-1] = arr[n-1] * tmpPrev;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6};
		multiply(arr);
	}//6, 8, 15, 24, 30

}
