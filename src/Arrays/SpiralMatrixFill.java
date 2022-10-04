package Arrays;

import java.util.ArrayList;

public class SpiralMatrixFill {

	public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
	
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i = 0; i < A ; i++) {
			a.add(new ArrayList<Integer>());
		}
		int rev = 0;
		for(int i = 0 ; i < A ; i++) {
			for(int j = 0 ; j < A - i ; j++) {
				if(rev == 0) {
					a.get(i).add(j+1);
					a.get(index)
				}
			}
		}
	}
}
