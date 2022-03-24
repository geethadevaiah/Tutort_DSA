package WarmupPracticeSet_III;

public class _10_SumofDigitsofStringAfterConvert {

	public static int getLucky(String s, int k) {
		int lucky = 0;
		
		// add each alphabet's number
		for(int i = 0 ; i < s.length() ; i++) {
			lucky += digitSum(s.charAt(i) - 'a' + 1);
		}
		// apply transform
		// already 1 done
		k--;
		while(k-- > 0) {
			lucky = digitSum(lucky);
		}
		
		return lucky;
	}
	
	// returns the sum of the digits
	private static int digitSum(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("returning sum ? "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		String s = "zbax";
		int k = 2; //--> transform= add all the digits in the resulting integer
		
		System.out.println(getLucky(s, k));
		
	}
}
