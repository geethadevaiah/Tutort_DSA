package Arrays.Assignments_2;

import java.util.HashMap;
import java.util.Map;

public class RankTeamByVotes {
	public static String rankTeams(String[] votes) {

		if (votes.length == 1)
			return votes[0];
		StringBuilder result = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();

		// place each indices in the hashmap
		for (String s : votes) {
			char[] charArr = s.toCharArray();
			for (Character c : charArr) {
				/*if(map.containsKey(c))
					map.put(c, map.get(c) + s.indexOf(c));
				 else map.put(c, s.indexOf(c));*/
				map.put(c, map.getOrDefault(c, 0)+s.indexOf(c));
			}
		}
		// sort by value in the map
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(x -> result.append(x.getKey()));

		return result.toString();
	}

	public static void main(String[] args) {
		String[] votes = { "ABC", "ACB", "ABC", "ACB", "ACB"/* "WXYZ","XYZW" */ };
		System.out.println(rankTeams(votes));
	}

}
