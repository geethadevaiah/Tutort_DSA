package WarmupPracticeSet_III;

import java.util.HashSet;
import java.util.Set;

public class _1_HappyNumber {

	public static int getNext(int n) {
		int sum = 0;
		while(n > 0) {
			int tmp = n % 10;
			sum += tmp * tmp;
			n = n / 10;
		}
		return sum;
	}
	public static boolean isHappy(int n ) {
		Set<Integer> seen = new HashSet<>();
		while(n != 1 && !seen.contains(n)) {
			seen.add(n);
			n = getNext(n);
		}
		return n == 1;
	}
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
