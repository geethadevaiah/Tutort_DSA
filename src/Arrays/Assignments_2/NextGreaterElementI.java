package Arrays.Assignments_2;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] nxtGreater = new int[nums2.length];
		Map<Integer, Integer> map = new HashMap<Integer,Integer>(); 
		int[] result = new int[nums1.length];
		
		// populate the nextGreater array.. from the right side of the array
		nxtGreater[nums2.length-1] = -1; // last element
		map.put(nums2[nums2.length - 1], -1);
		for(int i = nums2.length-2 ; i >= 0 ; i--) {
			//nxtGreater[i] = nums2[i+1] > nums2[i] ? nums2[i+1] : nxtGreater[i+1];
			if(nums2[i+1] > nums2[i]) {
				nxtGreater[i] = nums2[i+1];
			} else {
				// find the next greatest value than nums2[i]
				int k = i+1;
				while( k < nxtGreater.length) {
					if(nxtGreater[k] > nums2[i]) {
						nxtGreater[i] = nxtGreater[k];
						break;
					} else nxtGreater[i] = -1;
					k++;
				}
				/*while( k < nxtGreater.length && nxtGreater[k++] < nums2[i])
					nxtGreater[i] = -1;
				if(k != nxtGreater.length)
					nxtGreater[i] = nxtGreater[k-1];*/
			}
			map.put(nums2[i], nxtGreater[i]);
		}
		int index = 0;
		for(int n : nums1) {
			result[index++] = map.get(n);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums1 = {4,1,2}, nums2= {1,3,4,2};
		nextGreaterElement(nums1, nums2);
	}
}
