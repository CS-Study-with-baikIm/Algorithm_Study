import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        /*
            IntStream을 이용하여 배열 다루기
        */


        return IntStream.range(0,commands.length)       // 배열의 총 길이는 command[]의 길이와 같다.
                .map (i-> Arrays.stream(array)              // map을 이용하여 스트림으로 변환
                        .skip(commands[i][0]-1)                 // 시작 인덱스 부터 자르기
                        .limit(commands[i][1]-commands[i][0]+1) // limit으로 받아올 총 배열 길이 정하기
                        .sorted()                               // 오름차순 정렬
                        .toArray()[commands[i][2]-1])           // 요소 선택
                .toArray();                                 // 배열로 만들기

        /*
            copyOfRange 활용
        */

        // return IntStream.range(0,commands.length)
        //     .map(i -> {
        //         int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        //         Arrays.sort(subArray);                  // 부분 배열을 정렬합니다.
        //         return subArray[commands[i][2] - 1];    // k번째 요소를 반환합니다.
        //     })
        //     .toArray();                                 // 결과를 배열로 반환합니다.


    }
}