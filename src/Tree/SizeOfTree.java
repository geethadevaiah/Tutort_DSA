package Tree;

public class SizeOfTree {

	public static int findSIze(TreeNode root) {
		if(root == null) {
			return 0;
		}
		/*int ls = findSIze(root.left);
		int rs = findSIze(root.right);
		int curr_size = ls + rs + 1;
		return curr_size;*/
		
		return (findSIze(root.left) + findSIze(root.right) + 1);
	}
}
