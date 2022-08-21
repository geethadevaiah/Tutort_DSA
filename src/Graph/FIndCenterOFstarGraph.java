package Graph;

public class FIndCenterOFstarGraph {

	public static int findCenter(int[][] edges) {
		int star = -1;
		if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
			star = edges[0][0];
		else star = edges[0][1];
		// no need to loop through all the edges ::IMP::
		// for(int i = 1 ; i < edges.length ; i++) {
		// star = star == edges[i][0] ? edges[i][0] :edges[i][1];
		// }
		return star;
	}
}
