import java.util.HashSet;
import java.util.Set;

public class MakeArrayZerobySubtractingEqualAmounts {
	public static int minimumOperations(int[] nums) {
		 Set<Integer> set = new HashSet<>();
	        for(int i : nums){
	            if(i > 0){
	                set.add(i);
	            }
	        }
	        return set.size();
	}
}
