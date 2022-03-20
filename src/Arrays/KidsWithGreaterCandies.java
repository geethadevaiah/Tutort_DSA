package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreaterCandies {
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<Boolean>();
		int highestCandy = Arrays.stream(candies).max().getAsInt();
//		for(int i = 0 ; i < candies.length ; i++) 
//			highestCandy = Math.max(highestCandy, candies[i]);
		for(int i = 0 ; i < candies.length ; i++) {
			res.add(i, candies[i]+extraCandies >= highestCandy);
		}
		return res;
	}

	public static void main(String[] args) {
		int candies[] = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		System.out.println(kidsWithCandies(candies, extraCandies));
	}
}
