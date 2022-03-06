package WarmupPracticeSet_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find pairs of min differences
 * 
 * @author Geetha
 *
 */
public class _4_MinAbsDifference {
	
	
	public static List<List<Integer>> absDifferencePairs(int[] arr) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(arr);
		int small_diff = arr[1]-arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] - arr[i-1] < small_diff) {
				small_diff = arr[i] - arr[i-1];
				list.clear();
			}
			if(arr[i] - arr[i-1] == small_diff) {
				list.add(Arrays.asList(arr[i-1],arr[i]));
			}
		}
		
		
		return list;
	}
	

	public static void main(String[] args) {

		int[] arr = {-2, 5, -5, 3,1,4};
		absDifferencePairs(arr);
	}

}
