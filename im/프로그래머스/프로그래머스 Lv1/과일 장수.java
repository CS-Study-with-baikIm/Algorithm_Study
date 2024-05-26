import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        
        /*
            1. 역순 정렬하여 상자의 갯수만큼 앞에서부터 배열에서 꺼내어 나온 값 * 상자에 담길 수 있는 갯수(m) 을 하면 된다.
            
            2. 이중 배열을 사용하면 시간 초과가 나온다 (배열이 100만개가 넘기 때문이란다.)
            따라서 Arrays를 사용하여 오름차순으로 정렬한 뒤
            총 사과의 갯수 % 담을수 있는 갯수(m)을 한 나머지 사과를 빼고 나온 첫 값부터 m을 곱하면 된다.
        */

        int answer = 0;
        // 역순 정렬
        // for(int i = 0; i < score.length; i++){
        //     for(int j = 0; j < score.length; j++){
        //         int tmp = score[i];
        //         if(score[i]> score[j]){
        //             score[i] = score[j];
        //             score[j] = tmp;
        //         }
        //     }
        // }


        Arrays.sort(score);

        int count = score.length % m;

        while(count + m - 1 < score.length){
            answer += score[count] * m;
            count += m;

        }

        return answer;
    }
}