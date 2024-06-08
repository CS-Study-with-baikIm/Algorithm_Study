import java.util.*;

class Solution {
    public int[] solution(int n) {

        int[][] matrix = new int[n][n];
        int x = -1;
        int y = 0;

        int dir = 0;
        int max = n;
        int count = 1;
        for(int i = 1; i<= facto(n); i++){
            if(dir%3 == 0){
                x++;
            }
            if(dir%3 == 1){
                y++;
            }
            if(dir%3 == 2){
                x--;
                y--;
            }
            matrix[x][y] = i;
            if(count < max) count ++;
            else {
                max--;
                count = 1;
                dir++;
            }
        }
        int[] answer = new int[facto(n)];
        int num = 0;
        for(int i = 0; i < n; i++){
            for(int j : matrix[i]){
                if(j!=0) {
                    answer[num] = j;
                    num++;
                }
            }
        }

        return answer;
    }

    public int facto(int i){
        if(i == 1) return i;
        else return i + facto(i-1);
    }
}