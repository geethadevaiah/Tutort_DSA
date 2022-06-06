package PriorityQueue;

import java.util.PriorityQueue;

class KthLargest {

    PriorityQueue<Integer> p;
    int k1 = 0;
    public KthLargest(int k, int[] nums) {
        this.k1 = k;
        p = new PriorityQueue<Integer>();
        for(int n : nums){
                p.add(n);
        }
        while(p.size() > k)
            p.poll();
    }
    
    
    public int add(int val) {
        p.add(val);
        if(p.size() > k1)
            p.poll();
        return p.peek();
    }
}
