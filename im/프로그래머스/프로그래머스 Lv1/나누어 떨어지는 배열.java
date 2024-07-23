import java.util.*;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0) arrList.add(arr[i]);
        }

        int[] answer = arrList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(answer);

        if(answer.length == 0) {
            int[] tmp = {-1};
            return tmp;
        }
        return answer;
    }
}