package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class AccountManager {
	public static ArrayList<Integer> solve(int A, int B, ArrayList<Integer> C) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int n = C.size();
		int[] timeInterval = new int[n-1];
		
		for (int i = 0; i < n-1; i++) {
			timeInterval[i] = C.get(i)+B;
		}
		int k = 0, count = 0;
		for(int i = 0 ; i < n ; i++) {
			count = 0;
			while(k<n-1 && timeInterval[k] <= C.get(i)) {
				k++;count++;
			}
			// done reduce n add
			A += count-1;
			result.add(A<0?0:A);
		}
		return result;
	}
	
	public static ArrayList<Integer> solveUsingQ(int A , int B, ArrayList<Integer> C){
		ArrayList<Integer> result = new ArrayList<Integer>();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i : C) {
			int num = i;
			while(!queue.isEmpty() && queue.peek() <= num) {
				queue.poll();
			}
			if(queue.size() == A)// queue is full
				result.add(0);
			else {
				queue.add(num + B);
				result.add(A - queue.size());
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(6);
		list.add(11);
		solve(4 ,5, list);
	}
}
