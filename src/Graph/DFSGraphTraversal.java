package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFSGraphTraversal {
	
	
	public static List<Integer> dfs(int v, List<List<Integer>> adj){
		List<Integer> result = new ArrayList<>();
		// visited array
		boolean[] vis = new boolean[v+1];
		
		// starting from 1 
		for(int i = 1 ; i <= v ; i++) {
			if(!vis[i])
			dfsUtil(i, adj, vis, result);
		}
		return result;
	}

	public static void dfsUtil(int curr, List<List<Integer>> adj, boolean[] vis, List<Integer> result) {
		
		// add to the list
		result.add(curr);
		vis[curr] = true;
		
		// hitting each adj nodes in the adj list --> DEPTH
		for(Integer i : adj.get(curr)) {
			if(vis[i] == false)
				dfsUtil(i, adj, vis, result);
		}
	}
	
	public static void main(String[] args) {
		
		List<List<Integer>> adj = new ArrayList<>();
		int v = 5;
		
		for(int i = 0 ; i <= v ; i++) {
			adj.add(new ArrayList<>());
		}
		
		// making edges

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(1).add(5);
        adj.get(2).add(4);
        adj.get(2).add(1);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(2);
        adj.get(5).add(1);

        
        List<Integer> result = dfs(v, adj);
        
        for(int i = 0;i<result.size();i++) {
            System.out.print(result.get(i)+" "); 
        }
	}

}
