package Tree.Assignments_2;

import Tree.TreeNode;

public class BalancedBST {
	public boolean result = true;
    public boolean isBalanced(TreeNode root) {
          maxDepth(root);
        return result;
    }
    
    public int maxDepth(TreeNode root){
        if(!result) return 0;
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1)
            result = false;
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
