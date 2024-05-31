import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : scoville){
            minHeap.add(i);
        }

        int count = 0;
        while(minHeap.size() > 1){
            if(minHeap.peek() >= K){
                return count;
            }
            minHeap.add(minHeap.poll() + minHeap.poll()*2);
            count++;
        }

        if(minHeap.peek() >= K) return count;

        return -1;
    }
}