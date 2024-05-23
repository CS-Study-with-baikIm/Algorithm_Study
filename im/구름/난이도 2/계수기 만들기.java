import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 최댓값 배열
        int[] max = new int[N];
        // 초기값
        int[] init = new int[N];
        //값 넣기
        for (int i = 0; i < N; i++) {
            max[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            init[i] = sc.nextInt();
        }
        // 누르는 횟수
        int k = sc.nextInt();

        init[init.length-1] += k;
        //로직 구현
        for (int i = 0; i < init.length; i++) {


            // max보다 얼마나 큰지
            int up = init[init.length - 1 - i] / (max[max.length - 1 - i]+1);
//            System.out.println(up);

            // 큰값 빼고 남기기
            init[init.length - 1 - i] = init[init.length - 1 - i] %= (max[max.length - 1 - i]+1);
//            System.out.println(up);

            // 맨 첫자리 예외처리
            if(i < init.length-1){
                init[init.length - 2 - i] += up;
            }
        }

        for(int i : init){
            System.out.print(i);
        }
    }
}


//버튼을 누르면 가장 오른쪽 자리 +1
//최댓값보다 커지면 0이고 왼쪽 +1
//맨 왼쪽은 올림 전파 않음 << 예제 3 보니 맨왼쪽 0 가능 27분