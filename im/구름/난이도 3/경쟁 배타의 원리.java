
import java.util.Scanner;

class 누적합_경쟁_배타 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;
        int[][] map = new int[1001][1001];

        int minX = 1001;
        int minY = 1001;
        int maxX = 0;
        int maxY = 0;

        // land 에 위치 넣기
        for (int i = 0; i < n; i++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2= sc.nextInt();
            int y2 = sc.nextInt();

            minX = Math.min(x1, minX);
            minY = Math.min(y1, minY);
            maxX = Math.max(x2, maxX);
            maxY = Math.max(y2, maxY);

            map[y1][x1]++;
            map[y2][x2]++;
            map[y1][x2]--;
            map[y2][x1]--;
        }


        for(int i = minY; i < maxY; i++){
            for(int j = minX; j < maxX; j++){
                map[i][j+1] += map[i][j];
            }
        }

        for(int i = minX; i < maxX; i++){
            for(int j = minY; j < maxY; j++){
                map[j + 1][i] += map[j][i];
            }
        }

        for(int i = minY; i < maxY; i++){
            for(int j = minX; j < maxX; j++){
                if(map[i][j] == k) answer++;
            }
        }

        System.out.println(answer);
    }
}


//가로 세로 1000
//
//k종이 공존하면 경쟁 일어남
//
//n종의 생물이 있다.

//3종류 2개면 경쟁

