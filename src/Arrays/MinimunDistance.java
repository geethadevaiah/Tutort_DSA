package Arrays;

public class MinimunDistance {

	public static int solve(String A) {
		int d = Integer.MAX_VALUE;
		int x = -1, o = -1;
		for(int i = 0 ; i < A.length() ; i++) {
			if(A.charAt(i) == 'x') {
				x = i;
				if(o != -1)
					d = Math.min(d, Math.abs(x-o));
			}
			else if(A.charAt(i) == 'o') {
				o = i; 
				if(x != -1)
					d = Math.min(d, Math.abs(x-o));
			}
		}
		return (x != -1 && o != -1) ? d : -1;
	}
	public static void main(String[] args) {
		String s = "x.....x...o";
		System.out.println(solve(s));
	}
}
