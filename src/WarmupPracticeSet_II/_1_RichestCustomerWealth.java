package WarmupPracticeSet_II;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
 *  the ith customer has in the jth bank. Return the wealth that the richest customer has.
 * 
 * @author Geetha
 *
 */
public class _1_RichestCustomerWealth {

	public static int richestWealth(int[][] arr) {
		int richestWealth = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0 ; j < arr[0].length ; j++) {
				sum += arr[i][j];
			}
			richestWealth = Math.max(richestWealth, sum);
		}
		
		return richestWealth;
	}
	
	public static void main(String[] args) {
		int acc[][] = { {1,2,3},{3,2,1}};
		System.out.println(richestWealth(acc));
		int acc1[][] = {{2,8,7},{7,1,3},{1,9,5}};
		System.out.println(richestWealth(acc1));
	}

}
