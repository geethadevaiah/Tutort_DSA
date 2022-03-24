package Arrays.Assignments_1;

public class _3_MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1; // ==> index of nums1 excluding zeroes at the end
		int j = n - 1; // ==> index of nums2
		int index = nums1.length - 1;
		if (m == 0) {
			while (index >= 0) {
				nums1[index--] = nums2[j--];
			}
			return;
		}
		while (index >= 0 && (i >= 0 || j >= 0)) {
			// System.out.println(nums1[i]+" "+nums2[j]);
			if (i >= 0 && j >= 0) {
				// System.out.println("i and j inside if "+i +" "+ j);
				if (nums1[i] >= nums2[j]) {
					nums1[index--] = nums1[i--];
				} else {
					nums1[index--] = nums2[j--];
				}
			} else if (i >= 0) {
				nums1[index--] = nums1[i--];
			} else if (j >= 0) {
				nums1[index--] = nums2[j--];
			}
		}

	}
}
