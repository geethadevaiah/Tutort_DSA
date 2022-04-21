package Arrays.Assignments_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class IntersectionTwoArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map1 = new HashMap<>(nums1.length);
		for (int n : nums1)
			map1.put(n, map1.getOrDefault(n, 0) + 1);
		HashMap<Integer, Integer> map2 = new HashMap<>(nums2.length);
		for (int n : nums2)
			map2.put(n, map2.getOrDefault(n, 0) + 1);

		if (map1.size() > map2.size())
			return intersection_tmp(map1, map2, nums1.length > nums2.length ? nums2.length:nums1.length);
		return intersection_tmp(map2, map1, nums1.length > nums2.length ? nums2.length:nums1.length);
	}

	private static int[] intersection_tmp(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2, int size) {
		int[] result = new int[size];
		int index = 0;
		for(Entry<Integer, Integer> e : map2.entrySet()) {
			if(map1.containsKey(e.getKey())){
				int k = e.getValue() < map1.get(e.getKey()) ? e.getValue() : map1.get(e.getKey());
				while(k-- > 0) result[index++] = e.getKey();
			}
		}
		return Arrays.copyOf(result, index);
	}
}
