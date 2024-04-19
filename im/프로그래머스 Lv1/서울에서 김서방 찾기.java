import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {

        /*
            for문을 활용하여 seoul배열에서 Kim과 일치하는 인덱스를 찾아냄
        */

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")) return "김서방은 "+ i+"에 있다" ;
        }

        return "김서방은 "+ seoul.length+"에 있다." ;


        /*
            Arrays의 asList를 활용하여 seoul의 index를 가져오기
        */

        // return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim")+"에 있다." ;

    }
}