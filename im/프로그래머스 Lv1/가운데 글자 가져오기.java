class Solution {
    public String solution(String s) {
        /*
            가운데 글자 가져오기
            홀수와 짝수 경우를 나누어 문제풀이
        */

        return s.length() %2 == 1
                ? "" +s.charAt(s.length()/2)
                : "" + s.charAt(s.length()/2 -1) +s.charAt(s.length()/2);

        /*
           substring을 활용하여
           (s.length()-1)/2 초기조건에서 홀수와 짝수 모두 작동하게 만든 코드
        */
        // return s.substring((s.length()-1)/2, s.length()/2 +1);


    }
}