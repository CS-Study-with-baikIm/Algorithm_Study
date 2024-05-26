class Solution {
    public String solution(int n) {

        /*
            n의 길이만큼 "수박"에서
            홀수면 '수', 짝수면 '박' 추가하기
        */

        String waterMelon = "수박";
        String answer = "";
        for(int i =0; i < n; i++){
            answer += waterMelon.charAt(i%2);
        }
        return answer;
    }
}