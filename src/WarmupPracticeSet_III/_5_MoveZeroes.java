package WarmupPracticeSet_III;

public class _5_MoveZeroes {

	public static void moveZeroes(int[] nums) {
		 int i = 0 , curr = 0;
			// curr is the last non zero index
			// i is current index in the root
			while(i < nums.length && curr < nums.length) {
				if(nums[i] != 0) {
					nums[curr++] = nums[i];
				}
				i++;
			}
			// make all the remaining i as zero
			while( curr < nums.length) {
				nums[curr++] = 0;
			}
	}
	
	public static void main(String[] args) {
		int[] A = {1,0,1,0,2,3,4,0,0,10};
		moveZeroes(A); 
		for(int i =0 ; i < A.length ; i++) {
			System.out.println(A[i]);
		}
	}
}
