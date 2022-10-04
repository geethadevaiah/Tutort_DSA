package Graph;

public class FindtheTownJudge {

	public int findJudge(int n, int[][] trust) {
		
		int[] degree = new int[n+1];
		// count the indegree and outdegree for each nodes
		for(int t[] : trust) {
			degree[t[0]]--; // outdegree
			degree[t[1]]++; // indegree
		}
		// check if any nodes have in-out == n-1
		for(int i = 1 ; i <= n ; i++) {
			if(degree[i] == n-1)
				return i;
		}
		return -1;
	}
}
