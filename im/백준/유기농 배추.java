import java.util.Scanner;

public class 지렁이 {
    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        for (int a = 0; a < n; a++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int t = sc.nextInt();

            // 배열은 [y][x] 로 열어야 좌표가 맞다 (x개만큼 옆으로간게 y개 쌓인 느낌)
            map = new int[y + 2][x + 2];
            visit = new boolean[y + 2][x + 2];
            int[][] jilung = new int[t][2];


            for (int i = 0; i < y + 2; i++) {
                for (int j = 0; j < x + 2; j++) {
                    map[i][j] = 0;
                }
            }

            for (int i = 0; i < t; i++) {
                int z = sc.nextInt() + 1;
                int p = sc.nextInt() + 1;
                map[p][z] = 1;
            }

            int count = 0;

//            for (int i = 0; i < y + 2; i++) {
//                for (int j = 0; j < x + 2; j++) {
//                    System.out.print(map[i][j]);
//                }
//                System.out.println();
//            }
//            System.out.println();

            int answer = 0;

            for (int i = 0; i < y + 2; i++) {
                for (int j = 0; j < x + 2; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        earth(i, j);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }

    }

    //영역 확인 + 사이즈 체크
    public static void earth(int i, int j) {
        if (visit[i][j] || map[i][j] != 1) {
            return;
        }

        visit[i][j] = true;

        // 4방향 검사
        earth(i + 1, j);
        earth(i - 1, j);
        earth(i, j + 1);
        earth(i, j - 1);

    }

}