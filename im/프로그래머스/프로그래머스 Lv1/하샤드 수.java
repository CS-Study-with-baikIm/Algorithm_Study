import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public boolean solution(int x) {

        /*
            IntStream 활용 <자릿수 더하기>
        */
        int sum = IntStream.iterate(x, i-> i > 0, i-> i/10)
                .map(i -> i%10)
                .sum();
        // return x % sum == 0? true:false;


        /*
            문자 스트림 활용
        */
        int sum2 = String.valueOf(x)    //문자열로 변환하기
                .chars()                    //하나의 문자씩 스트림 생성
                .map(ch -> ch - '0')        //0의 ASCII값을 빼서 숫자로 변환
                .sum();                     //총합 계산

        return x % sum == 0;            //논리식으로만 해도 된다. < 위에 활용할 때 처럼 안해도 된다.
    }
}