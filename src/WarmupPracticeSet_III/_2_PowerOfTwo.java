package WarmupPracticeSet_III;

public class _2_PowerOfTwo {
	
	public static boolean isPowerOfTwo(int n) {
		
		if(n <= 0) return false;
		int ans = n & n-1;
		return ans == 0;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(256));
	}
}
