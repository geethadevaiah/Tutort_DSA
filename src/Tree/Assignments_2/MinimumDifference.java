package Tree.Assignments_2;

import Tree.TreeNode;

public class MinimumDifference {
	public int result = Integer.MAX_VALUE, curr = -1;
	 public int getMinimumDifference(TreeNode root) {
	        
	        if(root.left != null) 
	            getMinimumDifference(root.left);
	        
	        if(curr >= 0)
	            result = Math.min(result, root.val - curr);
	        
	        curr = root.val;
	        
	        if(root.right != null)
	            getMinimumDifference(root.right);
	        return result;
	        
	    }
}
