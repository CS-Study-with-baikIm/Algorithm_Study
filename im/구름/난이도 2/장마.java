import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 집 개수
        int N = sc.nextInt();
        // 장마 기간
        int M = sc.nextInt();

        // 땅 높이 배열
        int[] land = new int[N];
        for(int i = 0; i < N; i++){
            land[i] =sc.nextInt();
        }
        // 장마 범위
        int[][] rainDay = new int[M][2];
        for(int i = 0; i < M; i++){
            rainDay[i][0] = sc.nextInt();
            rainDay[i][1] = sc.nextInt();
        }

        // 비 담기
        Set<Integer> hash = new HashSet<>();
        for(int i = 0; i < M; i++){
            for(int j = rainDay[i][0] -1; j < rainDay[i][1]; j++){
                land[j]++;
                hash.add(j);
            }
            if(i%3 == 2){
                for(int j = 0; j < N; j++){
                    if(hash.contains(j)){
                        land[j]--;
                        hash.remove(j);
                    }
                }
            }
        }

        String answer = "";
        for(int i = 0; i < N; i++){
            answer = answer + land[i] + " ";
        }
        answer = answer.trim();
        System.out.println(answer);
    }
}


// 땅 높이가 음수일수도
// 비내리면 물 높이 +1
// 배수 시스템이 작동하기 전까지 안빠짐
// 장마 3의 배수날 비 내린 후 작동 / 작동일 기준으로 2일 이내에 내린 위치에서 작동 9 작동이면 789
// 땅 높이는 싸인 물 만큼 증가