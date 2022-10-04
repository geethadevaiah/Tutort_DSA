package Arrays;

import java.util.ArrayList;

public class XORingSubarrays {

	public static int solve(ArrayList<Integer> A) {
		int ans = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			for(int j = i ; j < A.size() ; j++) {
				for(int k = i ; k <= j ; k++) {
					ans ^= A.get(k);
				}
			}
		}
		return ans;
		
		// another approach
		int val = 0;
		  for (int i = 1; i <= A.size(); i++) {
		    if (i % 2 != 0)
		      val = val ^ A.get(i - 1);
		  }
		  if (A.size() % 2 == 0)
		    return 0;
		  else
		    return val;
	}
}
