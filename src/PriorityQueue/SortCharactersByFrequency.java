package PriorityQueue;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {
	public static String frequencySort(String s) {

		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		map = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, 
						(oldValue, newValue)-> newValue, LinkedHashMap::new));
		StringBuilder sb = new StringBuilder();	
		for(Map.Entry set : map.entrySet()) {
			for(int i = 0 ; i < (int)set.getValue() ;i++)
			sb.append(set.getKey());
		}
		return sb.toString();
	}
	
	public String frequencySort1(String s) 
    {
        Map<Character, Integer> map = new HashMap<>();
        // Key: charcater, Value: Frequency
        
        for (char c: s.toCharArray())
            map.put(c, map.getOrDefault(c,0) + 1);
        
 //       PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
   //     - Insert 5 and 6, Store in PQ: [6 5]
        
        // Max Heap - Priority Queue based upon Decreasing Values (Not Key) in Map
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        // e: 2, t: 1, r: 1
        // PQ: Stores Entry Set based on Decreasing Order of freq (Values)
        // PQ: [e: 2, t: 1, r:1]
        
        //         PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.Key() - a.Key());
        // e: 2, t: 1, r: 1
        // PQ: Stores Entry Set based on Decreasing Order of Keys
        // PQ: [t: 1, r: 1, e:2]

        
        
        // Add All at Once instead of loop
        pq.addAll(map.entrySet());
        
        StringBuilder ans = new StringBuilder();
        
        while (!pq.isEmpty())
        {
            // pq contains entrySet, hence poll should be assigned to entrySet
            Map.Entry temp = pq.poll();
            
            for (int i=0; i<(int) temp.getValue(); i++)
                ans.append(temp.getKey()); // String ans would contain characters (Keys), Not the frequency (values)
        }
        
        return ans.toString();
    }

	
	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));
	}
}
