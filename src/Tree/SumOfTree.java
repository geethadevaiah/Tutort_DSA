package Tree;

public class SumOfTree {

	public static int findSum(TreeNode root) {
		if(root == null) {
			return 0;
		}
		/*int ls = findSIze(root.left);
		int rs = findSIze(root.right);
		int curr_size = ls + rs + 1;
		return curr_size;*/
		
		return (findSum(root.left) + findSum(root.right) + root.val);
	}
}
