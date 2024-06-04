import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        Set<String> set = new HashSet<>();

        char lastChar= words[0].charAt(0);

        for(int i = 0; i < words.length; i++){
            if(words[i].charAt(0) != lastChar){
                int[] rr = { (i%n +1), (i/n+1)};
                return rr;
            }

            set.add(words[i]);
            lastChar = words[i].charAt(words[i].length()-1);

            if(set.size() != i+1){
                int[] rr = {(i%n +1), (i/n+1)};
                return rr;
            }

        }

        return answer;
    }
}