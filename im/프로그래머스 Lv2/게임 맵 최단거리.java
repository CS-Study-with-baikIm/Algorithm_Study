import java.util.*;

class Solution {

    static int[][] map;
    static Queue<Point> queue;
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        queue = new LinkedList<>();
        map = maps;



        int answer = bfs(0,0);
        return answer;
    }

    public int bfs(int x, int y){
        queue.add(new Point(x, y, 1));
        map[x][y] = 2;

        while(!queue.isEmpty()){
            Point cur = queue.poll();

            if(cur.x == map.length-1 && cur.y == map[0].length -1) return cur.score;

            for(int i = 0; i <4; i++){
                int curX = cur.x+dx[i];
                int curY = cur.y+dy[i];
                if(curX < 0 || curX > map.length-1 || curY < 0 || curY > map[0].length-1)
                    continue;

                if(map[curX][curY] == 1) {
                    queue.add(new Point(curX, curY, cur.score+1));
                    map[curX][curY] = 2;
                }
            }


        }



        return -1;
    }

}

class Point{
    int x;
    int y;
    int score;

    public Point(int x, int y, int score){
        this.x = x;
        this.y = y;
        this.score = score;
    }

}