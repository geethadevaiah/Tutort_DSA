package Arrays;

import java.util.ArrayList;

public class BalanceArray {
	public static int solve(ArrayList<Integer> A) {
		int res = 0;
		int size = A.size();
		if (size == 2)
			return 0;
		if (size == 1)
			return 1;

		// brute force

		for (int i = 0; i < size; i++) {
			int element = A.remove(i);
			if (calculateSum(A))
				res++;
			A.add(i, element);
		}

		return res;
	}

	public static int solve1(ArrayList<Integer> A) {
		int n = A.size();
		int odd = 0, even = 0;
		int leftOdd[] = new int[n], rightOdd[] = new int[n];
		int leftEven[] = new int[n], rightEven[] = new int[n];
		for (int i = 0; i < n; i++) {
			leftOdd[i] = odd;
			leftEven[i] = even;
			if (i % 2 == 0)
				even += A.get(i);
			else
				odd += A.get(i);
		}
		odd = 0;
		even = 0;
		for (int i = n - 1; i >= 0; i--) {
			rightOdd[i] = odd;
			rightEven[i] = even;
			if (i % 2 == 0)
				even += A.get(i);
			else
				odd += A.get(i);
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (leftOdd[i] + rightEven[i] == leftEven[i] + rightOdd[i]) {
				ans++;
			}
		}
		return ans;
	}

	public static boolean calculateSum(ArrayList<Integer> arr) {
		int oddSum = 0, evenSum = 0;
		for (int i = 0; i < arr.size(); i = i + 2)
			evenSum += arr.get(i);

		for (int i = 1; i < arr.size(); i = i + 2)
			oddSum += arr.get(i);
		return oddSum == evenSum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(1);
//		list.add(6);
//		list.add(4);
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(5);
		list.add(8);
		System.out.println(solve1(list));
		System.out.println(findBalance(list));
	}
	
	public static int findBalance(ArrayList<Integer> list) {
		int res = 0, n = list.size();
		int leftOdd[] = new int[n], rightOdd[] = new int[n], leftEven[] = new int[n], rightEven[] = new int[n];
		int even = 0 , odd = 0;
		for(int i = 0 ; i < n ; i++) {
			leftOdd[i] = odd;
			leftEven[i] = even;
			if(i % 2 == 0) even += list.get(i);
			else odd += list.get(i);
		}
		odd = 0 ; even = 0;
		for(int i = n-1; i >= 0 ; i--) {
			rightOdd[i] = odd;
			rightEven[i] = even;
			if(i % 2 == 0) even += list.get(i);
			else odd += list.get(i);
		}
		for(int i = 0 ; i < n ; i++) {
			if(leftEven[i]+rightOdd[i] == leftOdd[i]+rightEven[i])
				res++;
		}
		return res;
	}
}