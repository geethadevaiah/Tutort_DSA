package Arrays;

import java.util.ArrayList;

public class PrefixMatching {
	public ArrayList<Integer> solve(ArrayList<String> A, String B) {

		ArrayList<Integer> result = new ArrayList<>();
		result.add(-1);
		result.add(-1);
		int i = 0;
		for (String s : A) {
			if (s.startsWith(B)) {
				if (result.get(0) == -1)
					result.set(0, i);
				result.set(1, i);
			}
			i++;
		}
		return result;
	}
	// instead.. try to use binary search to find the first n last occurences
	// because after finding first, last to be found from right side of the array
}
