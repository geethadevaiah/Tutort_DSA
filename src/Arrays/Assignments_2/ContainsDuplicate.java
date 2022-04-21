package Arrays.Assignments_2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		/*for(int i = 0; i < nums.length ; i++) {
		for(int j = i+1 ; j < nums.length ;j++) {
			if(nums[i] == nums[j]) return true;
		}
	}
	return false;*/
    
    /*Arrays.sort(nums);
    for(int i = 0 ; i < nums.length - 1 ; i++)
        if(nums[i] == nums[i+1]) return true;
    return false;*/
    
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]))
            return true; 
        map.put(nums[i],1);
    }
    return false;
	}
}
