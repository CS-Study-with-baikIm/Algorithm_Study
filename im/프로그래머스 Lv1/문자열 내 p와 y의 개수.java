class Solution {
    boolean solution(String s) {

        /*
            전체 문자를 소문자로 바꾼후
            noP는 p를 제거한 문자열
            noY는 y를 제거한 문자열
            둘의 길이를 비교하여 개수를 비교한다.
        */

        String noP = s.toLowerCase().replace("p", "");
        String noY = s.toLowerCase().replace("y", "");
        return noP.length() == noY.length() ? true : false;
    }
}