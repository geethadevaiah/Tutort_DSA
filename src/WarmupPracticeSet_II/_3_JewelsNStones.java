package WarmupPracticeSet_II;
/**
 * Input: jewels = "aA", stones = "aAAbbbb"
	Output: 3
 * 
 * @author Geetha
 *
 */

public class _3_JewelsNStones {

    public static int numJewelsInStones(String jewels, String stones) {
        
    	int count = 0;
        for(int i = 0 ; i < stones.toCharArray().length ;i++) 
        	if(jewels.indexOf(stones.charAt(i)) != -1) 
        		count++;
        return count;
    }
    
	public static void main(String[] args) {
		String jewels = "Aa";
		String stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));
	}

}
