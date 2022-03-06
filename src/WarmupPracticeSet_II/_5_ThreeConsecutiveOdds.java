package WarmupPracticeSet_II;

public class _5_ThreeConsecutiveOdds {

	public static boolean threeConsecutiveOdds(int[] arr) {
    
		int counter = 3;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) // it is even
				counter = 3; // resetting the counter
			else
				counter--;
			if(counter == 0) {
				return true;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,34,3,4,5,7,25,12};
		System.out.println(threeConsecutiveOdds(arr));
	}

}
