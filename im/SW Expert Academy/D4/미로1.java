
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
    static int[][] map = new int[16][16];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static Queue<Point> queue;
    static int[][] score = new int[16][16];
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);


        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int n = sc.nextInt();
            int[] start = new int[2];
            queue = new LinkedList<>();

            for(int i = 0; i < 16; i++){
                String[] str = sc.next().split("");
                for(int j = 0; j <16; j++){
                    map[i][j] = Integer.parseInt(str[j]);
                    if(map[i][j] == 2) {
                        start[0] = i;
                        start[1] = j;
                    }
                }
            }

            System.out.println("#"+ test_case + " "  +bfs(start[0], start[1]));



        }
    }

    public static int bfs(int x, int y){
        queue.add(new Point(x, y));
        map[x][y] = 4;

        while(!queue.isEmpty()){
            Point cur = queue.poll();

            for(int i = 0; i <4; i++){
                int curX = cur.x+dx[i];
                int curY = cur.y+dy[i];
                if(map[curX][curY] == 0) {
                    queue.add(new Point(curX, curY));
                    map[curX][curY] = 4;
                    score[curX][curY] = score[cur.x][cur.y] + 1;
                }

                if(map[curX][curY] == 3) {
                    score[curX][curY] = score[cur.x][cur.y] + 1;

                    return 1;
                }
            }
        }

        return 0;
    }


}

class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}