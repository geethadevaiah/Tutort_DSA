package Arrays.Assignments_3;

public class MinimumMovesToEqualArrayElements {

	/*public static int minMoves(int[] nums) { // TLE
		if(nums.length == 2)
			return Math.abs(nums[0] - nums[1]);
		int moves = 0;
		while(!equalElementsCheck(nums)) {
			int index = findMaxIndex(nums);
			for(int i = 0 ; i < nums.length ; i++) {
				if(index != i) nums[i]++;
			}
			moves++;
		}
		return moves;
	}
	private static int findMaxIndex(int[] nums) {
		int index = 0;
		for(int i = 1 ; i < nums.length ; i++) 
			if(nums[i] > nums[index]) 
				index = i;
		return index;
	}
	private static boolean equalElementsCheck(int[] nums) {
		int i = 0;
		while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
		return (i+1 == nums.length);
	}*/

	public static int minMoves(int[] nums) {
		// find the min number in the array
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < nums.length ; i++) {
			min = Math.min(min, nums[i]);
		}
		// find the diff between each num n min
		int moves = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			moves += nums[i] - min;
		}
		return moves;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,1,1};
		System.out.println(minMoves(nums));
	}
}
