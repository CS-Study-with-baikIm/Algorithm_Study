import java.util.*;

class Solution {


    public String solution(String number, int k) {
        String answer = "";
        boolean[] visit = new boolean[number.length()];
        StringBuilder sb = new StringBuilder();

        int start = 0;

        for(int i = 0; i < number.length() - k; i++){
            char max = '0';
            for(int j = start; j < k+i + 1; j++){
                if(number.charAt(j) > max && !visit[j]) {
                    visit[j] = true;
                    max = number.charAt(j);
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }



}