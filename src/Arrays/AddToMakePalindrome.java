package Arrays;

public class AddToMakePalindrome {

	public static int add(String A) {
		int n = A.length(), result = 0;
		if (n == 1)
			return result;
		if (n == 2)
			return A.charAt(0) == A.charAt(1) ? 0 : 1;

		char lastChar = A.charAt(n - 1);
		int firstOccurrence = A.indexOf(lastChar);
		if (firstOccurrence == -1)
			return n - 1;
		while (firstOccurrence < n - 1) {
			if (isPalindrome(A.substring(firstOccurrence, n))) {
				return firstOccurrence;
			}
			firstOccurrence = A.indexOf(lastChar,firstOccurrence+1);
		}
		return n - 1;
	}

	public static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(add("aabba"));
	}
}
