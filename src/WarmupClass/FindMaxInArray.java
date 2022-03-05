package WarmupClass;

public class FindMaxInArray {

	/**2. Find Max

	Given an array of positive elements, find the maximum element in it   // its correct
	i/p : [2,3,4,1,5]
	o/p: 5

	i/p:[]
	o/p: -1**/

	public int findMaxInArray(int[] arr){
		
	  int n = arr.length, max = -1;
	  // if there is at least one element in the array
	  if(n > 0){ 
	    max = arr[0];
	    for(int i = 1; i < n ; i++){
	      if(arr[i] > max)
	        max = arr[i];
	    }
	  }
	  return max;
	}
	
}
