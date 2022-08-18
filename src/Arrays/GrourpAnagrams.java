package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrourpAnagrams {
	public List<List<String>> groupAnagrams1(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = String.valueOf(ch);
			if (!map.containsKey(s)) {
				map.put(s, new ArrayList<String>());
			}
			map.get(s).add(str);
		}
		result.addAll(map.values());

		return result;
	}
}
