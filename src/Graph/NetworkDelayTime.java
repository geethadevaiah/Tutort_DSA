package Graph;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*class Pair
{
    // Return a map entry (key-value pair) from the specified values
    public static <T, U> Map.Entry<T, U> of(T first, U second) {
        return new AbstractMap.SimpleEntry<>(first, second);
    }
}*/
public class NetworkDelayTime {
	
	

	public static int networkDelayTime(int[][] times, int n, int k) {

		Map<Integer, List<Map<Integer,Integer>>> adj = new HashMap<>();
		// prepare a adj list
		for(int[] time : times) {
			int src = time[0];
			int dest = time[1];
			int travelTime = time[2];
			
			adj.putIfAbsent(src, new ArrayList<>());
			Map<Integer, Integer> mapTmp = new HashMap<>();
			mapTmp.put(travelTime, dest);
			adj.get(src).add(mapTmp);
		}
		
		// sort the edges connecting to every node
		for(int node : adj.keySet()){
			Collections.sort(adj.get(node), 
					(a,b) -> a.keySet().iterator().next() - b.keySet().iterator().next());
		}
		return 0;
	}
	public static void main(String[] args) {
		int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
		networkDelayTime(times, 4,2);
	}
}
