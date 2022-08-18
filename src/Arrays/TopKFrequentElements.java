package Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class TopKFrequentElements {

	public static int[] topKFrequent(int[] nums, int k) {
		
		// frequency map
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : nums) map.put(i, map.getOrDefault(i, 0)+1);
		
		// collect the list in the desc order of values
		Collection<Integer> list = map.entrySet().stream()
		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new)).keySet();
		
		int size = list.size()  < k ? list.size() : k;
		int res[] = new int[size];
		Iterator<Integer> t = list.iterator();
		
		// picking top k values
		for(int i= 0 ; i<size && t.hasNext();i++) 
			res[i] = t.next();
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,3,3,3,3};
		int k = 2;
		topKFrequent(nums, k);
	}
}
