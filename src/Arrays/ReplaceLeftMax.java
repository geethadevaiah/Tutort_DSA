package Arrays;

public class ReplaceLeftMax {

	public static void replaceMax(int[] arr) {
		int n = arr.length;
		int tempMax = arr[0];
		arr[0] = -1;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] > tempMax) {
				tempMax = arr[i - 1];
				arr[i] = arr[i - 1];
			} else {
				int tmp = tempMax;
				tempMax = arr[i];
				arr[i] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		replaceMax(arr);
	}
}
