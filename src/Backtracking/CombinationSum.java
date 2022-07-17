package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(candidates);
		combUtil(candidates, target, new ArrayList<>(), ans);
		return ans;
	}

	public static void combUtil(int[] num, int target, List<Integer> path, List<List<Integer>> ans) {
		if(target < 0) 
			return ;
		if(target == 0) {
			ans.add(path);
			return ;
		}
		// backtrack case
		for(int i = 0 ; i < num.length ; i++) {
			path.add(num[i]);
			combUtil(num, target-num[i], path, ans);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 5, 2 };
		combinationSum(arr, 16);
	}
}
