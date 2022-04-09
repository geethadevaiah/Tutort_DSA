package Arrays.Assignments_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11_3Sum {
	public static List<List<Integer>> getThreeTripletsSum(int[] num) {

		List<List<Integer>> result = new ArrayList<>();

		// two pointer technique (with fixing one pointer to get the rest two pointer
		// traversing
		// Sort the array
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			// skip duplicates
			if (i != 0 && num[i] == num[i - 1])
				continue;
			// two pointers, pointing second and last index
			int j = i + 1, k = num.length - 1;

			while (j < k) {
				if (num[i] + num[j] + num[k] == 0) { // found the triplet
					result.add(Arrays.asList(num[i], num[j], num[k]));
					j++;
					// skip the duplicates
					while (j < k && num[j] == num[j - 1])
						j++;
				}
				// move the j pointer if the value is less than 0
				else if (num[i] + num[j] + num[k] < 0)
					j++;
				// move the k pointer left, if the value sum is greater
				else
					k--;
			}
		}

		return result;
	}
}
