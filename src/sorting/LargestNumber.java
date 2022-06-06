package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {
	public static String largestNumber(int[] nums) {

		String result = "";

		List<String> list = new ArrayList<>();
		for (int n : nums)
			list.add(String.valueOf(n));
		

		// sort in lexicographical order String
		// b+a > a+b ("3"+"30" > "30" +"3")
		//list.sort((a, b) -> Integer.compare(Integer.parseInt(b + a), Integer.parseInt(a + b)));

		// other methods to sort 
		// cannot use Collections.reverseOrder in IntStream
//		list.stream().mapToInt(Integer :: parseInt)
//				.sorted(Collections.reverseOrder())
//				.mapToObj(String::valueOf)
//				.collect(Collectors.joining());
		
		// trying directly with arrays
//		result = Arrays.asList(nums).stream()
//		.map(String::valueOf)
//		.sorted(Collections.reverseOrder())
////		.mapToObj(String::valueOf)
//		.collect(Collectors.joining());
		
		//Collections.reverseOrder will not work
		// apply comparator
		result = list.stream().sorted(
				(a, b) -> Long.compare(Long.parseLong(b+a), Long.parseLong(a+b)))
//				.mapToInt(Integer :: parseInt) // not required
//				.mapToObj(String::valueOf) // not required
				.collect(Collectors.joining());
		return result.startsWith("0") ? "0" : result;
	}

	public static void main(String[] args) {
//		int[] nums = { 3, 30, 34, 5, 9 };
		int[] nums = {999999991,9};
		System.out.println(largestNumber(nums));
	}
}

// faster solution some how
class Solution {
	   private class LargerNumberComparator implements Comparator<String> {
	        @Override
	        public int compare(String a, String b) {
	            String order1 = a + b;
	            String order2 = b + a;
	           return order2.compareTo(order1);
	        }
	    }
	     public String largestNumber(int[] nums) {
	        // Get input integers as strings.
	        String[] asStrs = new String[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            asStrs[i] = String.valueOf(nums[i]);
	        }

	        // Sort strings according to custom comparator.
	        Arrays.sort(asStrs, new LargerNumberComparator());

	        // If, after being sorted, the largest number is `0`, the entire number
	        // is zero.
	        if (asStrs[0].equals("0")) {
	            return "0";
	        }

	        // Build largest number from sorted array.
	        String largestNumberStr = new String();
	        for (String numAsStr : asStrs) {
	            largestNumberStr += numAsStr;
	        }

	        return largestNumberStr;
	    }

	}
