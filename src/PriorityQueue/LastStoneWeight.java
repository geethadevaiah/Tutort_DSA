package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int n : stones)
			maxHeap.add(n);
		while (maxHeap.size() > 1) {
			int x = maxHeap.poll() - maxHeap.poll();
			if (x > 0)
				maxHeap.add(x);
		}
		return maxHeap.poll();
	}
}