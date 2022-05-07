package Tree;

public class IdenticalTrees {

	
	public static boolean isIdentical(TreeNode node1, TreeNode node2) {
		
		if(node1 == null && node2 == null) {
			return true;
		}
		if(node1 == null || node2 == null) {
			return false;
		}
		
		return isIdentical(node1.left, node2.left) &&
				isIdentical(node1.right, node2.right) &&
				node1.val == node2.val;
						
	}
}
