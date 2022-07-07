package sorting;

import java.util.PriorityQueue;

public class UglyNumberII {
	public static int nthUglyNumber1(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2 || n == 3 || n == 5) return n;
		
		int digits[] = new int[n];
		int t2 = 0, t3 = 0 , t5 = 0;
		digits[0] = 1;
		for(int i = 1; i < n ; i++) {
			digits[i] = Math.min(digits[t2] * 2, Math.min(digits[t3] * 3,
					digits[t5] * 5));
			if(digits[i] == digits[t2] * 2) t2++;
			if(digits[i] == digits[t3] * 3) t3++;
			if(digits[i] == digits[t5] * 5) t5++;
		}
		
		return digits[n-1];
	}
	public static int nthUglyNumber(int n) {
	    if(n==1) return 1;
	    PriorityQueue<Long> q = new PriorityQueue();
	    q.add(1l);
	    
	    for(long i=1; i<n; i++) {
	        long tmp = q.poll();
	        while(!q.isEmpty() && q.peek()==tmp) tmp = q.poll();
	        
	        q.add(tmp*2);
	        q.add(tmp*3);
	        q.add(tmp*5);
	    }
	    return q.poll().intValue();
	}
	public static void main(String[] args) {
		System.out.println(nthUglyNumber(10));
	}
}
