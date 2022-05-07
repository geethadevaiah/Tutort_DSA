package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VerticalSum {

	public static List<Integer> verticalsum(TreeNode root){
		List<Integer> list = new ArrayList<>();
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		vsum(root, map, 0);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			list.add(m.getValue().stream().mapToInt(Integer:: intValue).sum());
		}
		return list;
	}
	public static void vsum(TreeNode node, Map<Integer,ArrayList<Integer>> map, int hd) {
		
		if(node == null) return;
		vsum(node.left,map,hd-1);
		// update
		if(map.get(hd) != null) map.get(hd).add(node.val);
		else map.put(hd, new ArrayList<>(Arrays.asList(node.val)));
		vsum(node.right,map,hd+1);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		verticalsum(root);
	}
}
