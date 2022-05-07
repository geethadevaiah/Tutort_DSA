package Arrays.Assignments_3;

import java.util.Arrays;

public class ThirdMaximumNumber {

	public int thirdMax(int[] arr) {
		
		int n = arr.length;
		if(n == 1) return arr[0]; 
		if(n == 2) return Math.max(arr[0], arr[1]);
		int curr = -1;
		Arrays.sort(arr);
		for(int i = 0 ; i < n ; i++) {
			// avoiding duplicates, copying only distinct
			while(i+1 < n && arr[i] == arr[i+1]) 
				i++;
			arr[++curr] = arr[i];
			
		}
		if(curr < 2) return arr[curr];
		return arr[curr-2];
	}

}
