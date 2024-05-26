import java.util.*;

class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++){
            int days = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            queue.add(days);
        }

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int current = queue.poll();
            int count = 1;

            while(!queue.isEmpty() && queue.peek() <= current){
                count++;
                queue.poll();
            }
            result.add(count);
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i< result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
