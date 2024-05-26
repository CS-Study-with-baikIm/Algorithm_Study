class Solution {
    public String solution(String s) {



        // 테스트는 통과 8, 9, 11, 12, 13, 18 실패 이유를 모르겠다.

        // a, z의 경우를 포함하지 않았었다... 범위 실수
        
        
        /*
            전부 소문자로 바꾸기
            
            첫 글자를 대문자로 바꾸기
        */


        String answer = s.toLowerCase();

        if(answer.charAt(0) > 96 && answer.charAt(0) < 123){
            answer = (char)(answer.charAt(0) - 32) + answer.substring(1);
        }


        for(int i = 0; i < answer.length()-1; i++){
            if(answer.charAt(i) == ' ' && answer.charAt(i+1) > 96 && answer.charAt(i+1) <123){
                answer = answer.substring(0, i+1) + (char)(answer.charAt(i+1) - 32) + answer.substring(i+2);

            }
        }


        return answer;
    }
}