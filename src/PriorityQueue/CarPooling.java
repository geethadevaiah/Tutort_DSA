package PriorityQueue;

public class CarPooling {
	public static boolean carPooling(int[][] trips, int capacity) {
		
		// consider having the array with all timestamps
		int count[] = new int[1001];
		for(int[] trip : trips) {
			// on board the ppl 
			count[trip[1]] += trip[0];
			count[trip[2]] -= trip[0]; // de-board 
		}
		for(int number : count) {
			capacity -= number;
			if(capacity < 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] arr = {{2,1,5},{3,3,7}};
		carPooling(arr, 4);
	}
}
