import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {

        List<Integer> arrList = new ArrayList<>();

        Arrays.sort(tangerine);

        int count = 1;
        for(int i = 1; i < tangerine.length; i++){
            if(tangerine[i] == tangerine[i-1])count++;
            else{
                arrList.add(count);
                count = 1;
            }

            if(i == tangerine.length-1) arrList.add(count);
        }


        int[] countArr = new int[arrList.size()];
        for(int i =0; i < countArr.length; i++){
            countArr[i] = arrList.get(i);
        }

        Arrays.sort(countArr);

        int sum = 0;

        for(int i = 0; i<countArr.length; i++){
            sum += countArr[countArr.length-1 - i];
            if(sum >= k) return i+1;
        }

        return tangerine.length;
    }
}