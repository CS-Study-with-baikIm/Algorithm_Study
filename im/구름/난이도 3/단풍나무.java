import java.util.Arrays;
import java.util.Scanner;

class Main {
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static boolean[][] visited;
    static int N;


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int answer = maple(map, 0);

        System.out.println(answer);

    }

    public static boolean check(int[][] map) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) return false;
            }
        }
        return true;
    }

    public static int maple(int[][] map, int day) {
        while (!check(map)) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] != 0) {
                        int count = 0;
                        if (i - 1 >= 0) {
                            if (map[i - 1][j] == 0) count++;
                        }
                        if (i + 1 < N) {
                            if (map[i + 1][j] == 0) count++;
                        }
                        if (j - 1 >= 0) {
                            if (map[i][j - 1] == 0) count++;
                        }
                        if (j + 1 < N) {
                            if (map[i][j + 1] == 0) count++;
                        }

                        if (map[i][j] == count) map[i][j] = -1;
                        else map[i][j] -= count;
                    }
                }
            }



            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] < 0) map[i][j] = 0;
                }
            }

            day++;

        }


        return day;
    }
}

//// n n 땅에 단풍나무
//0이면 물듬
//상하좌우 모두 물든 수만큼 나의 나무도 줄어듬

// 이중 포문으로 그냥 줄이면 1인경우 0으로 줄면서 영향을 미칠 수 있다.