import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {

        /*
            intStream을 이용하여 numbers 배열을 받고
            총합을 0~9까지의 합인 45에서 뺐다.
        */

        return 45 - IntStream.of(numbers).sum();

        /*
            다른 풀이
            Arrays.stream() - 배열을 기본 스트림으로 변환 / 좀 더 범용적이다. < 다양한 배열에 사용할 수 있다.
            IntStream.of() - 주어진 값들을 스트림으로 변환
        */

        // return 45-Arrays.stream(numbers).sum();

    }
}