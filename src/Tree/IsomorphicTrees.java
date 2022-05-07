package Tree;

public class IsomorphicTrees {

	
	public static boolean isIsomorphic(TreeNode node1, TreeNode node2) {
		
		if(node1 == null && node2 == null) {
			return true;
		}
		if(node1 == null || node2 == null) {
			return false;
		}
		
		return isIsomorphic(node1.left, node2.right) &&
				isIsomorphic(node1.right, node2.left) &&
				node1.val == node2.val;
						
	}
}
