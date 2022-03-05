package WarmupPracticeSet_I;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
when both these products are concatenated with the original number, then it results in all digits from 1
to 9 present exactly once
 * 
 * @author Geetha
 *
 */
public class _10_IsFascinating {

	public static boolean isFascinating(int n) {
		
		String fullNumber = String.valueOf(n).concat(String.valueOf(n*2)).concat(String.valueOf(n*3));
//		StringBuilder sb = new StringBuilder(String.valueOf(n)).append(String.valueOf(n*2)).append(String.valueOf(n*3));
		
		System.out.println("full ?? "+fullNumber);
//		System.out.println("fullnumber3 ? "+sb.toString());
				
		// find if it contains all numbers only once (Using linkedhashmap)
		long count = fullNumber.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(x -> x.getValue() > 1).count();
		
		return count > 0 ? false : true;
	}
	
	public static void main(String[] args) {
		int n = 192; //853
		System.out.println(n+ "isFascinating ?  " + isFascinating(n));
	}
}
