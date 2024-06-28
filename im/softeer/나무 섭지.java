import java.io.*;
import java.util.*;

public class Main {
    static int[] dx ={-1, 0 , 1, 0};
    static int[] dy ={0, 1, 0, -1};
    static class pos{
        int x;
        int y;
        int time;
        public pos(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] str = new String[n][m];
        boolean[][] map = new boolean[n][m];
        boolean[][] visit = new boolean[n][m];
        int[] position = new int[2];
        int[] Dposition = new int[2];
        List<pos> Glist = new ArrayList<>();
        List<pos> Dlist = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String tmp = sc.next();
            for(int j = 0; j < m; j++){
                str[i][j] = ""+tmp.charAt(j);
                if (str[i][j].equals("N")) {
                    position[0] = i;
                    position[1] = j;
                }
                if(str[i][j].equals("G")){
                    Glist.add(new pos(i,j, 0));
                }
                if(str[i][j].equals("D")){
                    Dposition[0] = i;
                    Dposition[1] = j;
                }
                if(str[i][j].equals("#")){
                    map[i][j] = true;
                }

            }
            // System.out.println(Arrays.toString(str[i]));
        }

        int nt = 0;

        Queue<pos> q = new LinkedList<>();
        q.offer( new pos(position[0], position[1],0) );
        while(!q.isEmpty()){
            pos cur = q.poll();
            if(cur.x == Dposition[0] && cur.y == Dposition[1]){
                nt = cur.time;
                break;
            }
            visit[cur.x][cur.y] = true;
            for(int i = 0; i < 4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(nx >= 0 && nx < n && ny >=0 && ny < m){

                    if(!visit[nx][ny] && !map[nx][ny]){
                        visit[nx][ny] = true;
                        q.offer( new pos(nx, ny, cur.time+1) );
                    }
                }
            }
        }

        int gt = n*m;

        for(int i = 0; i < Glist.size(); i++){
            int tmpg = Math.abs(Glist.get(i).x - Dposition[0]) + Math.abs(Glist.get(i).y - Dposition[1]);
            if(gt>tmpg) gt = tmpg;
        }

        if(nt == 0) System.out.println("No");

        else if( nt <= gt) System.out.println("Yes");
        else System.out.println("No");


    }

}
