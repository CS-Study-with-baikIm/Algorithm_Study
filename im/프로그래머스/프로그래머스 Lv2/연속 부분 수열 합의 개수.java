import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                int tmp = 0;
                for(int k = 0; k <= i; k++){
                    tmp += elements[(j + k) % elements.length ];
                }
                set.add(tmp);
            }
        }

        return set.size();
    }
}