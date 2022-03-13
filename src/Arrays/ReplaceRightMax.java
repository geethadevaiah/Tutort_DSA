package Arrays;

public class ReplaceRightMax {

	public static void replaceMax(int[] arr) {
		int n = arr.length;
		int tempMax = arr[n - 1];
		arr[n - 1] = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i + 1] > tempMax) {
				tempMax = arr[i + 1];
				arr[i] = arr[i + 1];
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
