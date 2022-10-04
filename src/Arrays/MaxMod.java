package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMod {

	public static int solve(ArrayList<Integer> A) {
		int n = A.size();
        if (n == 1)
			return A.get(0);
		// sorting the nums
		Collections.sort(A);
		// finding the mod for the last two numbers
		// highest and second highest mod
		int highest = A.get(n - 1);
		int second_highest = A.get(n - 2);
		int mod = second_highest % highest;
		while (mod == 0 && n > 3)
			mod = A.get((n--) - 3) % highest;
		return mod;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(5);
		list.add(100);
		list.add(100);
		list.add(99);
		list.add(100);
		list.add(77);
		list.add(100);
		System.out.println(solve(list));
	}
}
