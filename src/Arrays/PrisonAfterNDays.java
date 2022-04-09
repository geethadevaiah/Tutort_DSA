package Arrays;

import java.util.Arrays;

public class PrisonAfterNDays {

	public static int[] prisonAfterNDays(int[] cells, int n) {
		// TLE
		int res[] = new int[cells.length];
//		n = n % 4;
//		int anotherPart = 0;
//		if(n == 0) 
		while(n-- > 0) {
			for(int i = 1 ; i < cells.length - 1 ; i++) 
				res[i] = cells[i-1] ^ cells[i+1] ^ 1;
			System.out.println("\ncopying this ? ");
			for(int i = 0 ; i < res.length ; i++)
				System.out.print(" "+res[i]);
			cells = Arrays.copyOf(res, cells.length);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] cells = {0,1,0,1,1,0,0,1};
		int n = 10;
		prisonAfterNDays(cells, n);
	}
}
