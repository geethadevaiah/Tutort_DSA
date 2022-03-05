package WarmupClass;

public class PrintAllElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/**
	 1. Given an array print all the elements in the array
	
	i/p [1,2,3,4]
	o/p 1 2 3 4
	
	i/p []
	o/p -1 */
	
	
	public void printAllElementsOfArray(int[] arr){
		
	  int n = arr.length;
	  if(n > 0){
	  	for(int i = 0 ; i < n ; i++){
	    	System.out.print(arr[i]+" ");
	    }
	    return;
	  }
		System.out.println("-1");
	}
}
