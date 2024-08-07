import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int a = (int)(right - left);
        int[] answer = new int[a + 1];
        int idx = 0;
        for(long i = left; i <= right; i++){
            answer[idx] = (int)Math.max(i/n + 1, i%n + 1);
            idx++;
        }
        return answer;
    }
}