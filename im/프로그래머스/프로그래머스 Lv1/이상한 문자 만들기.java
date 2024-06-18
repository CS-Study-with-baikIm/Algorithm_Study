class Solution {
    public String solution(String s) {
        String answer = "";

        s= s.toLowerCase();

        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(idx%2 == 0) answer += Character.toUpperCase(s.charAt(i));
            else answer += s.charAt(i);

            idx++;
            if(s.charAt(i) == ' ') idx = 0;

        }
        return answer;
    }
}