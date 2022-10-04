package Arrays;

import java.util.ArrayList;

public class SearchINRotatedArray {

	public static int search(ArrayList<Integer> A, int B) {
		
		// find the pivot
		int pivot = 0, n = A.size();
		int left = 0, right = n-1;
		while(left < right) {
			int mid = left = (right -left) / 2;
			if(A.get(mid) < A.get(right))
				right = mid;
			else left = mid + 1;
		}
		// found pivot
		pivot = left;
		left = 0; right = n -1 ;
		// check whether to search in the right or left of pivot
		if(A.get(pivot) <= B && B <= A.get(right) ) 
			left = pivot;
		else right = pivot;
		// search
		while(left < right) {
			int mid = left = (right -left) / 2;
			if(A.get(mid) == B) return mid;
			if(A.get(mid) > B)
				right = mid;
			else left = mid + 1;
		}
		return -1;
	}
}
