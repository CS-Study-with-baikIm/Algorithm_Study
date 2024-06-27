import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int[][] position;
    static int answer = 0;
    static int m;
    static int[] dx = {-1 ,0, 1 ,0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][n];
        position = new int[m][2];
        // 값 배열에 담기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = sc.nextInt();
            }
            // System.out.println(Arrays.toString(map[i]));
        }

        for(int i = 0; i < m; i++){
            position[i][0] = sc.nextInt() - 1;
            position[i][1] = sc.nextInt() - 1;
        }



        dfs(0,0,0);

        for(int i= 0; i < m; i++){
            answer += map[ position[i][0]] [position[i][1]];
        }
        System.out.println(answer);


    }

    static void dfs(int time, int sum, int person){
        answer = Math.max(sum, answer);
        if(time == 3){
            if(person < m-1){
                dfs(0, sum, person+1);
            }
        }
        else{
            int startX = position[person][0];
            int startY = position[person][1];
            for(int i = 0; i < 4; i++){
                int nx = startX + dx[i];
                int ny = startY + dy[i];
                if(ny>=0 && ny<n && nx>=0 && nx<n) {
                    int value = map[nx][ny];
                    map[nx][ny] = 0;
                    position[person][0] = nx;
                    position[person][1] = ny;
                    dfs(time+1, sum+value, person);
                    position[person][0] = startX;
                    position[person][1] = startY;
                    map[nx][ny] = value;
                }
            }
        }

    }


}
