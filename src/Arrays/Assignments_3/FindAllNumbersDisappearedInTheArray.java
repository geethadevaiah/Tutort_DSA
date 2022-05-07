package Arrays.Assignments_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInTheArray {

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();
		
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		for(int i = 1 ; i <= nums.length; i++) {
			if(!set.contains(i))
				list.add(i);
		}
		return list;
	}
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}

}
