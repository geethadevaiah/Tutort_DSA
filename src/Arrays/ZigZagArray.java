package Arrays;

public class ZigZagArray {

	// wiggle sort
	/**
	 * Given an array, rearrange the elements of array in zigzag fashion. i/p: 4 3 7
	 * 8 6 2 1 o/p: 3 7 4 8 2 6 1
	 **/

	public static int[] wiggleSort(int[] arr) {

		int n = arr.length, toggle = 0;// toggle = 0 is increasing order, 1 is increasing
		for (int i = 0; i < n - 1; i++) {
//			if (toggle == 0 && arr[i] > arr[i + 1]) { // it should be increasing if not exchange
//				swap(arr, i, i + 1);
//			} else if (toggle == 1 && arr[i + 1] > arr[i]) { // it should be decreasing exchange
//				swap(arr, i, i + 1);
//			}
			
			if ((toggle == 0 && arr[i] > arr[i + 1]) ||
					(toggle == 1 && arr[i + 1] > arr[i])) { 
				swap(arr, i, i + 1);
			}
			toggle = toggle ^ 1;
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
		wiggleSort(arr);
	}
}
